app.service('typeService',function($http){
    this.getTypeByPid =function (pid) {
        return $http.get('../type/getTypeByPid?pid=' + pid);
    }

    this.add = function (type) {
        return $http.post('../type/addType',type);
    }

    this.update = function (type) {
        return $http.post('../type/updateType',type);
    }
    this.findOne = function (id) {
        return $http.get('../type/findOne?id=' + id);
    }
    //删除
    this.dele=function(ids){
        return $http.get('../type/delete?ids='+ids);
    }
})