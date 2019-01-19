/**
 * 
 */
gecHackfest.controller('shedualeCtrl',function($scope,$http,loginService){

	$scope.registerEvent={};
	$scope.registerEvent.id=null;
	$scope.registerEvent.name=null;
	$scope.registerEvent.startDate=null;
	$scope.registerEvent.endDate=null;
	$scope.registerEvent.startTime=null;
	$scope.registerEvent.endTime=null;
	$scope.registerEvent.category=[];
	$scope.registerEvent.venue=null;
	$scope.listOfevent=[];
	$scope.category=[];
	$scope.category=[
		{
			"id":123,
			"name":"MyEvent1"
		},
		{
			"id":123,
			"name":"MyEvent1"
		}
		,
		{
			"id":123,
			"name":"MyEvent1"
		}
		
	];
	$scope.listOfevent=[
		{
			"id":123,
			"name":"MyEvent1",
			"startDate":'22-02-2019',
			"endDate":'25-02-2019',
			"startTime":"8:00",
			"endTime":"22:00",
			"category":['someCat','someCat'],
			"venue":'L2-62',
			"isRegistered":true
			
		},
		{
			"id":123,
			"name":"MyEvent1",
			"startDate":'22-02-2019',
			"endDate":'25-02-2019',
			"startTime":"8:00",
			"endTime":"22:00",
			"category":['someCat','someCat'],
			"venue":'L2-62',
			"isRegistered":false
			
		},{
			"id":123,
			"name":"MyEvent1",
			"startDate":'22-02-2019',
			"endDate":'25-02-2019',
			"startTime":"8:00",
			"endTime":"22:00",
			"category":['someCat','someCat'],
			"venue":'L2-62',
			"isRegistered":true
			
		},{
			"id":123,
			"name":"MyEvent1",
			"startDate":'22-02-2019',
			"endDate":'25-02-2019',
			"startTime":"8:00",
			"endTime":"22:00",
			"category":['someCat','someCat'],
			"venue":'L2-62',
			"isRegistered":false
			
		}
		
		
	];

$http.post(uri+'/getEvent',	$scope.user_name).then(
			function(success){
				
				$scope.listOfevent=success.data;
				
			},
			
			function(error){
				console.log(error.data);
				
			}
			);
$http.get(uri+'/getcategaroy').then(
		function(success){
			
			$scope.category=success.data;
			
		},
		
		function(error){
			console.log(error.data);
			
		}
		);
		
	
$scope.newEvent=function(){
	$scope.listOfevent.push($scope.registerEvent);
	/*$http.post(uri+'/newEvent',	$scope.registerEvent).then(
			function(success){
				
				$scope.listOfevent.push(success.data);
				
			},
			
			function(error){
				console.log(error.data);
				
			}
			);*/
	$scope.registerEvent={};
};
$scope.registerUser=function(id){
	$http.post(uri+'/registerEvent',{"event_id":id,"username":$scope.user_name}).then(
			function(success){
				
				$scope.listOfevent.push(success.data);
				
			},
			
			function(error){
				console.log(error.data);
				
			}
			);
}
	
	
});

