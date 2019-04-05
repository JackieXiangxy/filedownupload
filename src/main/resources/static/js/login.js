angular.module('login',[]).
controller('spotCheckConfigListCtrl', ["$http", "$scope", "$filter", "$state", "ngTableParams", "$aside",
    "SweetAlert", "toaster", "cfpLoadingBar", "paramService", "$utils", "$modal",
    function ($http, $scope, $filter, $state, ngTableParams, $aside, SweetAlert, toaster, cfpLoadingBar, paramService, utils, $modal) {
        $scope.params = {};
        $scope.returnDat;//登陆返回的数据
        $scope.data = [];
        $scope.schoolYearList = [];//学年集合
        $scope.semesterList = [];//学期集合
        $scope.departmentList = [];//部门集合

        $scope.params.username;

        $http.post('',$scope.params).success(function (response) {
            $scope.returnDat=response;
        })

    }]);