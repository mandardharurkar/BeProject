/*myApp.controller('displayAllUsers',[
  '$scope', 'displayAllUsersService',function($scope, displayAllUsersService)
    {
        displayAllUsersService.getUsers()
        .then(function(data)
        {
            $scope.userRequests = data;
        })
        .catch(function(Errorresponse)
        {
            console.log('Error: ',Errorresponse);
            $scope.userRequests = Errorresponse.message;
        });
    }])
       
myApp.factory('displayAllUsersService',function($q, $http, $log)
    {
        var getUsers = function()
        {
            var deferred = $q.defer();
            $http.get('http://localhost:8080/v1.0/users')
            .success(function(data)
            {
                deferred.resolve(data);
            })
            .error(function(reason)
            {
                deferred.reject(reason);
                $log.error(reason);
            })
            return deferred.promise;
        }

        return
        {
            getUsers: getUsers
        };
    });*/

var myApp = angular.module('myApp',[]);
myApp.controller('UserMgmtController',[
  '$scope', 'UserMgmtService',function($scope, UserMgmtService)
    {
        UserMgmtService.getUsers()
        .then(function(data)
        {
            $scope.userRequests = data;
        })
        .catch(function(Errorresponse)
        {
            console.log('Error: ',Errorresponse);
            $scope.userRequests = Errorresponse.message;
        });
    }])
       
myApp.factory('UserMgmtService',function($q, $http, $log)
    {
        var getUsers = function()
        {
            var deferred = $q.defer();
            $http.get('http://localhost:8080/v1.0/users')
            .success(function(data)
            {
                deferred.resolve(data);
            })
            .error(function(reason)
            {
                deferred.reject(reason);
                $log.error(reason);
            })
            return deferred.promise;
        }

        return{
            getUsers: getUsers
        };
    });
