(function(){
var app = angular.module('myApp', []);	

var ctrl=function($scope,$log,$http){
	
	
	
	$scope.empname;
	$scope.empcity;
	$scope.empmob;
	$scope.empadd1;
	$scope.address={};
	$scope.empadd2;
	$scope.zip;
	$scope.json;
	$scope.getid;
	
	$scope.submitEmp = function() {
		
		
		var payload={
			"name":$scope.empname,
			"city":$scope.empcity,
			"mobile":$scope.empmob,
			"address":{
				"add1":$scope.empadd1,
				"add2":$scope.empadd2,
				"zipcode":parseInt($scope.zip)
			}			
		}
		$log.info(angular.toJson(payload));
		var result=$http.post("http://localhost:8080/Employees",payload)
		result.then(function(response){
			$scope.user=response.data;
			alert("the user "+$scope.user.name+" is saved in the database with the id "+$scope.user.id);
		});
	
		
	};	
		
	}
	
	
	var getid=function($scope,$http,$log){
		$scope.getid;
		
		$scope.submitReq = function() {
			var id="http://localhost:8080/Employees/"+$scope.getid;
			var employee = $http.get(id);
			employee.then(function(response){
				$log.info(response.data);
				$scope.user=response.data;
			});
			

		
		};	
		
	}

app.controller("myCtrl",ctrl);
app.controller("getid",getid);

	
}())