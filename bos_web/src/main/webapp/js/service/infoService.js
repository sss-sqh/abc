//服务层
app.service('infoService',function($http){

    //搜索
    this.search=function(pageNo,pageSize){
        return $http.get('../newInfo/adminGetAllNewInfo?pageNo=' + pageNo + "&pageSize=" + pageSize);
    }

    this.access = function(newInfo){
        return $http.post('../newInfo/access',newInfo);
    }
});