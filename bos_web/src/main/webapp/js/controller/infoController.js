//控制层
app.controller('infoController' ,function($scope,$controller,infoService,adminService){

    $controller('baseController',{$scope:$scope});//继承


    //搜索
    $scope.search=function(pageNo,pageSize){
        infoService.search(pageNo,pageSize).success(
            function(response){
                $scope.list=response.list;
                $scope.paginationConf.totalItems=response.total;//更新总记录数
            }
        );
    }

    $scope.access = function (newInfo) {
        infoService.access(newInfo).success(
            function (response) {
                window.location.href = '../admin/info.html'
            }
        )
    }
    $scope.getAdminUser = function () {
        adminService.getAdmin().success(function (response) {
            if(response != null && response != ''){
                $scope.admin = response;
            }else{
                window.location.href = '../admin/login.html';
            }
        })
    }
});