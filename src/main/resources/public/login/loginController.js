app.controller("loginController",function($scope,$http){
    
    $scope.user={
        username:"",
        password:""
    };
    
    $scope.login = function(){
        console.log($scope.user.username+" "+$scope.user.password);
        
        $http({
        url: "http://localhost:8181/user/login",
        method: "POST",
        data: $scope.user.username
        })
        .then(function(response) {
            console.log(response);
            $window.location.href="/home";
            alert("Login successfull");
        }, 
        function(response) { // optional
            console.log("Failed")
        });
    }
});