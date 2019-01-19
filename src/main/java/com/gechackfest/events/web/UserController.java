package com.gechackfest.events.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gechackfest.events.model.UserHibVO;
import com.gechackfest.events.service.SecurityService;
import com.gechackfest.events.service.UserService;
import com.gechackfest.events.validator.UserValidator;
import com.gechackfest.events.vo.User;
import com.google.gson.Gson;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration() {
              return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(User user, BindingResult bindingResult, Model model) {
        userValidator.validate(user, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }
        Gson gson = new Gson();
        UserHibVO userHibVO = gson.fromJson(gson.toJson(user), UserHibVO.class);
        userService.save(userHibVO);
        securityService.autologin(user.getUserName(), user.getPassword());
        return "redirect:/welcome";
    }
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
              return "login";
    }

    @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET)
    public String welcome(Model model) {
        return "welcome";
    }
}
