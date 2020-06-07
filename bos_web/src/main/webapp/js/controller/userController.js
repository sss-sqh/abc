//控制层
app.controller('userController' ,function($scope,$controller,userService,adminService){

    $controller('baseController',{$scope:$scope});//继承

    //读取列表数据绑定到表单中
    $scope.findAll=function(){
        userService.findAll().success(
            function(response){
                $scope.list=response.list;
            }
        );
    };

    //搜索
    $scope.search=function(pageNo,pageSize){
        userService.search(pageNo,pageSize).success(
            function(response){
                $scope.list=response.list;
                $scope.paginationConf.totalItems=response.total;//更新总记录数
            }
        );
    }

    //查看详细信息
    $scope.see = function (user) {
        $scope.userInfo = user;
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