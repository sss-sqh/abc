new Vue({
    el: '#app',
    //Vue中的model模块。
    data: {
        newOrderList: [],
        totalRecord: 1,
        pageSize: 3,
        currentNum: 1,
        //弹窗的显示与隐藏
        dialogFormVisible:false,
        seeNewOrder:{
            driverUser:{
                username:'',
            },
            infoUser:{
                username:'',
            },
            createdTime:'',
            newInfo:{
                info:{
                    iid:'',
                    createdTime:'',
                    iname:'',
                    iweight:'',
                    ivolume:'',
                    icount:'',
                    iuser:'',
                    iuserPhone:'',
                    ireceiver:'',
                    ireceiverPhone:'',
                },
                address:'',
                type:''
            },
            oid:'',
            // oidString:'',
            ostatus:'',
            car:{
                cid:'',
                cno:'',
                createdTime:''
            }
        },
    },
    methods: {
        tableRowClassName({row, rowIndex}) {
            if (rowIndex === 1) {
                return 'warning-row';
            } else if (rowIndex === 3) {
                return 'success-row';
            }
            return '';
        },
        //分页
        fenye:function(url){
            var _this = this;
            _this.loading = true;
            axios.get(url).then(function (response) {
                _this.loading = false;
                // _this.list = response.data;   //没有分页时的
                _this.newOrderList = response.data.list;  //msg.data就是后端返回的json数据
                _this.totalRecord = response.data.total;
                _this.currentNum = response.data.pageNum;
                _this.pageSize = response.data.pageSize;
            }).catch(function () {

            });
        },
        //改变页码
        changeNum:function (num) {
            this.fenye('/bos/order/getPersonalOrder?pageNo=' + num);
        },
        //查看订单详细信息
        see:function (row) {
            var _this = this;
            // alert(row.newInfo.address);
            // if(_this.user != null && _this.user != ''){
                _this.dialogFormVisible = true;
                _this.seeNewOrder.driverUser = row.driverUser;
                _this.seeNewOrder.infoUser = row.infoUser;
                _this.seeNewOrder.createdTime = row.createdTime;
                _this.seeNewOrder.newInfo = row.newInfo;
                _this.seeNewOrder.oid = row.oid;
                _this.seeNewOrder.ostatus = row.ostatus;
                _this.seeNewOrder.car = row.car;
            // }else {
            //     alert("请先登录哦！");
            // }
        },
        finishOrder:function () {
            var _this = this;
            // alert(typeof _this.seeNewOrder.oid);
            // _this.seeNewOrder.createdTime = '1586424680000';
            // axios.post("/bos/order/finishOrder",_this.seeNewOrder).then(function (response) {
            axios.get("/bos/order/finishOrder?oid=" + _this.seeNewOrder.oid
                +"&cid="+_this.seeNewOrder.car.cid
                +"&carCreatedTime="+_this.seeNewOrder.car.createdTime
                +"&oCreatedTime="+_this.seeNewOrder.createdTime).then(function (response) {
                alert(response.data.message);
                _this.dialogFormVisible = false;
                window.location.href = '/bos/order.html';
            }).catch(function (response) {

            })
        }
    },
    //异步请求 axios
    mounted:function() {
        var _this = this;
        axios.get("/bos/order/getPersonalOrder").then(function (response) {
            _this.newOrderList = response.data.list;
            _this.totalRecord = response.data.total;
            _this.currentNum = response.data.pageNum;
            _this.pageSize = response.data.pageSize;
        }).catch(function (response) {

        })
    }
});