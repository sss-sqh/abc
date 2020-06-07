//服务层
app.service('loginService',function($http){

    //读取列表数据绑定到表单中
    this.findOne=function(user){
        return $http.post('../user/findOne',user);
    }

});