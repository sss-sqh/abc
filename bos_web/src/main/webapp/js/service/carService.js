//服务层
app.service('carService',function($http){

    //读取列表数据绑定到表单中
    this.findAll=function(){
        return $http.get('../newCar/adminGetAllNewCar');
    }

    //搜索
    this.search=function(pageNo,pageSize){
        return $http.get('../newCar/adminGetAllNewCar?pageNo=' + pageNo + "&pageSize=" + pageSize);
    }

    this.access = function (newCar) {
        return $http.post("../newCar/access",newCar);
    }

    this.stop = function (newCar) {
        return $http.post("../newCar/stop",newCar);
    }
});