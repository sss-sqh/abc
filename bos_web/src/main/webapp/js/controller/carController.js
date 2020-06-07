//控制层
app.controller('carController' ,function($scope,$controller,carService,adminService){

    $controller('baseController',{$scope:$scope});//继承

    //读取列表数据绑定到表单中
    $scope.findAll=function(){
        carService.findAll().success(
            function(response){
                $scope.list=response.list;
            }
        );
    };

    //搜索
    $scope.search=function(pageNo,pageSize){
        carService.search(pageNo,pageSize).success(
            function(response){
                $scope.list=response.list;
                $scope.paginationConf.totalItems=response.total;//更新总记录数
            }
        );
    }

    //查看详细信息
    $scope.see = function (newCar) {
        $scope.carInfo = newCar;
    }

    //审核通过成为司机
    $scope.access = function () {
        // alert($scope.carInfo.carUser.username);
        carService.access($scope.carInfo).success(
            function(response){
                window.location.reload();
            }
        );
    }

    //停用
    $scope.stop = function () {
        carService.stop($scope.carInfo).success(
            function (response) {
                window.location.reload();
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