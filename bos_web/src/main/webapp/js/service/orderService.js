app.service('orderService',function ($http) {

    //搜索
    this.search=function(pageNo,pageSize){
        return $http.get('../order/findAllOrder?pageNo=' + pageNo + "&pageSize=" + pageSize);
    }
})