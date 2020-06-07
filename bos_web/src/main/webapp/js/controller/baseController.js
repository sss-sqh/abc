//baseController层
app.controller("baseController",function ($scope) {
    //分页
    $scope.reloadList = function () {
        //之前用的分页方法
        //$scope.findPage($scope.paginationConf.currentPage,$scope.paginationConf.itemsPerPage);
        //现在用的条件查询和分页等
        $scope.search($scope.paginationConf.currentPage, $scope.paginationConf.itemsPerPage);
        $scope.selectIds = [];
    }

    // 分页控制必须的参数
    $scope.paginationConf = {
        // 1 当前页
        currentPage: 1,
        //2 总记录数
        totalItems: 10,
        //3 每页显示记录数
        itemsPerPage: 4,
        //2 每页显示的记录数调整
        perPageOptions: [5, 10, 30, 40],
        //2 总记录数
        onChange: function () {
            $scope.reloadList(); // 查数据
        }
    }
    //选择框
    //获取页面中选中的ids
    $scope.selectIds = [];
    $scope.updateSelection = function ($event, id) {
        //如果被选中则为true
        if ($event.target.checked) {
            //将id加入到数组中
            $scope.selectIds.push(id);
        } else {
            //拿到id号对应的下标放在index中
            var index = $scope.selectIds.indexOf(id);
            // 删除   splice(删除的下标，个数);
            $scope.selectIds.splice(index, 1)
        }
    }

    //提取json字符串数据中某个属性，返回拼接字符串 逗号分隔
    $scope.jsonToString = function(jsonString,key){
        var jsonObj = JSON.parse(jsonString);
        var value = "";
        for (var i = 0; i < jsonObj.length; i++){
            if(i > 0){
                value += ",";
            }
            value += jsonObj[i][key];
        }
        return value;
    }

})