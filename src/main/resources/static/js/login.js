// var angular=angular.module('login',[]);
var app = angular.module('login', []);
app.controller('loignController', ["$http", "$scope",
    function ($http, $scope) {
        $scope.params = {};
        $scope.returnDat;//登陆返回的数据
        $scope.sysUrl;//请求到的系统路径
        $scope.data = [];
        $scope.schoolYearList = [];//学年集合
        $scope.semesterList = [];//学期集合
        $scope.departmentList = [];//部门集合

        //通过ajax请求获取路劲


        $http.get('/json/UrlJson.json?random=' + Math.random()).then(function (res) {
            $scope.sysUrl = res.data.sysUrl;
        })

        $scope.userLogin=function(){
            if ($scope.username == '' || $scope.username == undefined || $scope.username == null) {
                alert("用户名不能为空" )
                return ;
            }else {
                $scope.params.username=$scope.username;
            }

            if ($scope.password == '' || $scope.password == undefined || $scope.password == null) {
                alert("密码不能为空" )
                return ;
            }else {
                $scope.params.password=$scope.password;
            }

            /*if ($scope.username == '' || $scope.username == undefined || $scope.username == null) {
                alert("用户名不能为空" )
                return ;
            }else {
                $scope.params.username=$scope.username;
            }*/
            $http.post($scope.sysUrl+'userCheck/login',{data:$scope.params}).then(function (succRes) {
                $scope.returnDat=response;
            },function (errData) {
                alert(errData)
            });

        }



    }]);