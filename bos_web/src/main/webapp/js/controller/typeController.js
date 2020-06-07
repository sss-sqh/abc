app.controller('typeController',function($scope,$controller,typeService){

    $controller('baseController',{$scope:$scope});//继承

    $scope.getTypeByPid = function (pid) {
        $scope.pid = pid;
        typeService.getTypeByPid(pid).success(
            function(response){
                $scope.list = response;
            }
        )
    }

    $scope.pid = 0;  //用来记住上级父id

    $scope.grade=1;  //默认为1级
    //设置级别
    $scope.setGrade=function(value){
        $scope.grade=value;
    }
    //设置导航、读取列表
    $scope.selectList=function(p_entity){
        $scope.selectIds = [];
        if($scope.grade==1){//如果为1级
            $scope.entity_1=null;
        }
        if($scope.grade==2){//如果为2级
            $scope.entity_1=p_entity;
        }
        $scope.getTypeByPid(p_entity.id);	//查询此级下级列表
    }

    //保存
    $scope.save = function () {
        var serviceObject;//服务层对象
        if($scope.entity.id!=null){//如果有ID
            serviceObject=typeService.update( $scope.entity ); //修改
        }else{
            $scope.entity.pid=$scope.pid;//赋予上级ID
            serviceObject=typeService.add( $scope.entity  );//增加
        }
        serviceObject.success(
            function(response){
                if(response.res){
                    //重新查询
                    $scope.getTypeByPid($scope.pid);//重新加载
                }else{
                    alert(response.message);
                }
            }
        );
    }

    $scope.findOne = function (id) {
        typeService.findOne(id).success(function (response) {
            $scope.entity = response;
        })
    }

    //批量删除
    $scope.dele=function(){
        //获取选中的复选框
        typeService.dele( $scope.selectIds ).success(
            function(response){
                if(response.res){
                    $scope.getTypeByPid($scope.pid);//刷新列表
                    $scope.selectIds=[];
                }
            }
        );
    }
})