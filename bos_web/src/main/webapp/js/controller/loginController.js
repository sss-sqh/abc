//控制层
app.controller('loginController' ,function($scope,loginService){

    //读取列表数据绑定到表单中
    $scope.findOne=function(){
        loginService.findOne($scope.user).success(
            function(response){
                if(response.res){
                    alert(response.message);
                    window.location.href = '../admin/index.html';
                }else{
                    window.location.href = '../admin/login.html';
                }
            }
        );
    };

});