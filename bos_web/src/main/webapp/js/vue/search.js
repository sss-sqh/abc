new Vue({
    el: '#app',
    //Vue中的model模块。
    data: {
        form:{
            oid:'',
        },
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
            ostatus:'',
            car:{
                cno:'',
            }
        },
    },
    methods: {
        onSubmit:function () {
            var _this = this;
            // alert(_this.form.oid);
            axios.get("/bos/order/getOrderById?oid="+_this.form.oid).then(function (response) {
                if(response.data.res){
                    _this.dialogFormVisible = true;
                    _this.seeNewOrder.driverUser = response.data.map.order.driverUser;
                    _this.seeNewOrder.infoUser = response.data.map.order.infoUser;
                    _this.seeNewOrder.createdTime = response.data.map.order.createdTime;
                    _this.seeNewOrder.newInfo = response.data.map.order.newInfo;
                    _this.seeNewOrder.oid = response.data.map.order.oid;
                    _this.seeNewOrder.ostatus = response.data.map.order.ostatus;
                    _this.seeNewOrder.car = response.data.map.order.car;
                }else {
                    alert('抱歉，没有找到您要查询的订单！');
                }

            }).catch(function (response) {

            })
        }
    },
    //异步请求 axios
    mounted:function() {}
})