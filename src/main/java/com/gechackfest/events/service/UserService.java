package com.gechackfest.events.service;

import com.gechackfest.events.model.UserHibVO;

public interface UserService {
    void save(UserHibVO user);

    UserHibVO findByUsername(String username);
}
