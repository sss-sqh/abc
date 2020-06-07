app.controller('indexController',function ($scope,adminService) {
    $scope.getAdminUser = function () {
        adminService.getAdmin().success(function (response) {
            if(response != null && response != ''){
                $scope.admin = response;
            }else{
                window.location.href = '../admin/login.html';
            }
        })
    }
})