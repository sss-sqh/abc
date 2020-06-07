app.service('adminService',function ($http) {

    //搜索
    this.getAdmin=function(){
        return $http.get('../user/getSessionAdminUser');
    }
})