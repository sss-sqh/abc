//服务层
app.service('userService',function($http){

    //读取列表数据绑定到表单中
    this.findAll=function(){
        return $http.get('../newCar/adminGetAllNewCar');
    }

    //搜索
    this.search=function(pageNo,pageSize){
        return $http.get('../user/findAll?pageNo=' + pageNo + "&pageSize=" + pageSize);
    }

});