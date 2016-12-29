var app = angular.module('myApp',['ngRoute']);
app.config(function($routeProvider) {
  $routeProvider
      .when('/home', {
    templateUrl : 'views/welcome.html',
    controller  : 'welcomeController'
  })
      .when('/', {
    templateUrl : 'login/login.html',
    controller  : 'loginController'
  })
      .when('/registrationPage', {
    templateUrl : 'registration/registration.html',
    controller  : 'registrationController'
  })
      .otherwise({redirectTo: '/'});

});