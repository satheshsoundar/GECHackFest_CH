/**
 * 
 */
var uri='http://localhost:4334/login';
angular.module('Cusfilters', []);
angular.module('Cusfilters').filter('listToString', function() {
	  return function(x) {
	    var  txt = "";
	  
	    for (var i = 0; i < x.length; i++) {
	     if(x.length-1!=i)
	      txt =txt+x[i]+",";
	     else
	    	 txt =txt+x[i];
	    }
	    return txt;
	  };
	});
var gecHackfest=angular.module('GecHackFest',['ngRoute','Cusfilters',"kendo.directives"]);

gecHackfest.config(function($routeProvider) {
	  $routeProvider
	  .when("/", {
	    templateUrl : "partials/home.html"
	  })
	  .when("/videos", {
	    templateUrl : "partials/videos.html"
	  })
	  .when("/speakers", {
	    templateUrl : "partials/speakers.html"
	  })
	  .when("/schedule", {
	    templateUrl : "partials/schedule.html"
	  })
	  .otherwise("/")
	  ;
	});
gecHackfest.factory('loginService', function() {
	  var loginService={};
	  loginService.username=null;;
	 
	  return loginService;
	});

gecHackfest.controller('navCtrl',function($scope,$http,loginService){
	$scope.user_name=null;
	$scope.verfy={};
	$scope.verfy.user_name=null;
	$scope.verfy.pass=null;
	$scope.verfyUser=function(verify){
	/*$http.post(uri+'/login',$scope.verfy).then(
			function(success){
				console.log('success:'+success.data);
				loginService.loginService.username=$scope.verify.user_name;
				$scope.user_name=$scope.verify.user_name;
				
			},
			
			function(error){
				console.log(error.data);
				
			}
			);*/
		
		$scope.user_name=$scope.verfy.user_name;
	};
	$scope.signout=function(){
		$scope.user_name=null;
		$route.reload();
		
	};
	
});

