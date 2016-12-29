(function(){
app.controller('registrationController',function($rootScope,$scope,$http,$window){

    $scope.user={loginId:"",
                password:"",
                reEnterPassword:"",
                name:"",
                email:"",
                phoneType:"",
                phoneNumber:"",
                mailingAddress:"",
                taxId:"asd",
                primaryIdType:"",
                primaryIdNumber:""};
    
    $scope.dataArray=[];
    
   $scope.showData = function(){
       console.log($scope.user);
   $rootScope.duplicate = $scope.user;
       
       var json = {
           "loginId" : $scope.user.loginId,
           "password" : $scope.user.password,
           "confirmPassword" : $scope.user.reEnterPassword,
           "name" : $scope.user.name,
           "email" : $scope.user.email,
           "phoneType" :$scope.user.phoneType,
           "phoneNo" :$scope.user.phoneNumber,
           "mailingAddress" : $scope.user.mailingAddress,
           "taxIdNo": $scope.user.taxId,
           "primaryIdType" :$scope.user.primaryIdNumber,
           "primaryIdNo": $scope.user.primaryIdNumber
       };
       
       $scope.dataArray.push($scope.user);
       console.log($scope.dataArray);
        $http({
        url: "http://localhost:8181/user/registration",
        method: "POST",
        data: json
    })
    .then(function(response) {
        console.log(response);
        $window.location.href="/";
        alert("Registration successfull");
    }, 
    function(response) { // optional
        console.log("Failed")
    });
   }
 
});
}());