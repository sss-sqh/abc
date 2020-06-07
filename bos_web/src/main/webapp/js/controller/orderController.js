app.controller('orderController',function ($scope,$controller,orderService,adminService) {

    $controller('baseController',{$scope:$scope});//继承

    //读取列表数据绑定到表单中
    $scope.search=function(pageNo,pageSize){
        orderService.search(pageNo,pageSize).success(
            function(response){
                $scope.list=response.list;
                $scope.paginationConf.totalItems=response.total;//更新总记录数
            }
        );
    };
    $scope.getAdminUser = function () {
        adminService.getAdmin().success(function (response) {
            if(response != null && response != ''){
                $scope.admin = response;
            }else{
                window.location.href = '../admin/login.html';
            }
        })
    }
    //查看详细信息
    //查看详细信息
    $scope.see = function (order) {
        $scope.order = order;
    }
})