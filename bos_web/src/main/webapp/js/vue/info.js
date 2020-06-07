var vue = new Vue({
    el: '#app',
    //Vue中的model模块。
    data: {
        //登录用户的信息
        user:{
            username:'',
            role:'',
            cid:''
        },
        info:{
            sprovince:'',
            scity:'',
            scounty:'',
            dprovince:'',
            dcity:'',
            dcounty:'',
            source:'',
            destination:'',
            createdTime:'',
            iname:'',
            iweight:'',
            ivolume:'',
            icount:'',
            iremarks:'',
            iuser:'',
            iuserPhone:'',
            ireceiver:'',
            ireceiverPhone:'',
            typeGood1:'',
            typeGood2:''
        },
        //查询的选项
        search: {
            search_sprovince: '',
            search_scity:'',
            search_scounty: ''
        },
        s_province:'',
        s_city:'',
        s_county:'',
        d_province:'',
        d_city:'',
        d_county:'',
        type1:'',
        type2:'',
        //分页信息
        list:[],
        totalRecord: 1,
        pageSize: 3,
        currentNum: 1,
        //页面加载
        loading:false,
        //控制弹窗的显示
        dialogFormVisible:false,
        seeNewInfo:{
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
        }
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
        fenye:function(url){
            var _this = this;
            _this.loading = true;
            axios.get(url).then(function (response) {
                _this.loading = false;
                // _this.list = response.data;   //没有分页时的
                _this.list = response.data.list;  //msg.data就是后端返回的json数据
                _this.totalRecord = response.data.total;
                _this.currentNum = response.data.pageNum;
                _this.pageSize = response.data.pageSize;
            }).catch(function () {

            });
        },
        changeNum:function (num) {
            this.fenye('/bos/newInfo/getAllNewInfo?pageNo=' + num);
        },
        onSubmit:function(){
            var _this = this;
            axios.get('/bos/newInfo/getAllNewInfo',{params:this.search}).then(function (response) {
                _this.loading = false;
                // _this.list = response.data;   //没有分页时的
                _this.list = response.data.list;  //msg.data就是后端返回的json数据
                _this.totalRecord = response.data.total;
                _this.currentNum = response.data.pageNum;
                _this.pageSize = response.data.pageSize;
            }).catch(function () {

            });
        },
        see:function (row) {
            var _this = this;
            if(_this.user != null && _this.user != ''){
                this.dialogFormVisible = true;
                this.seeNewInfo.info = row.info;
                this.seeNewInfo.address = row.address;
                this.seeNewInfo.type = row.type;
            }else {
                alert("请先登录哦！");
            }
        },
        saveOrder:function () {
            var _this = this;
            // alert('车辆id'+_this.user.cid);
            if(_this.user.role == '2' && _this.user.cid != null && _this.user.cid != '' ) {
                _this.dialogFormVisible = false;
                axios.post("/bos/order/saveOrder", _this.seeNewInfo).then(function (response) {
                    alert(response.data.message);
                    window.location.href = "/bos/info.html";
                }).catch(function () {

                });
            }else{
                alert("抱歉！您不能接单，因为您还不是司机！");
            }
        }
    },
    //异步请求 axios 页面加载完就执行的
    mounted:function() {
        var _this = this;
        //请求省份
        axios.get('/bos/address/getAddByPid?pid=0').then(function (response) {
            _this.s_province = response.data;
            // _this.d_province = response.data;
        }).catch(function () {

        });
        //查询用户登录信息
        axios.get('/bos/user/getSessionLoginUser').then(function (response) {
            // alert(response.data);
            _this.user = response.data;
        }).catch(function () {

        });
        this.fenye('/bos/newInfo/getAllNewInfo');
    },
});
//根据省的变化而变化的市  发货地
vue.$watch('search.search_sprovince', function(nval, oval) {
    if(nval != oval){
        vue.search.search_scity = '';
        vue.search.search_scounty = '';
    }
    if(nval){
        // alert(nval);
        axios.get('/bos/address/getAddByPid?pid='+nval).then(function (response) {
            vue.s_city = response.data;
        }).catch(function () {

        });
    }
});
//根据市的变化而变化的县  发货地
vue.$watch('search.search_scity', function(nval, oval) {
    if(nval != oval){
        vue.search.search_scounty = '';
    }
    if(nval){
        axios.get('/bos/address/getAddByPid?pid='+nval).then(function (response) {
            vue.s_county = response.data;
        }).catch(function () {

        });
    }
});