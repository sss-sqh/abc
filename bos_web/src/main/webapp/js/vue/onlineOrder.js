var vue = new Vue({
    el: '#app',
    //Vue中的model模块。
    data: {
        user:{
            username:'',
            role:''
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
        s_province:'',
        s_city:'',
        s_county:'',
        d_province:'',
        d_city:'',
        d_county:'',
        type1:'',
        type2:''
    },
    methods: {
        submit:function(){
            var _this = this;
            if(_this.user != null && _this.user != ''){
                //发布货源信息
                axios.post('/bos/info/add',_this.info).then(function (response) {
                    alert(response.data.message);
                    window.location.href = "/bos/onlineOrder.html";
                }).catch(function () {

                });
            }else {
                alert("sorry！亲，请先登录哦！！")
                window.open("/bos/login.html");
            }

        }
    },
    //异步请求 axios 页面加载完就执行的
    mounted:function() {
        var _this = this;
        //请求省份
        axios.get('/bos/address/getAddByPid?pid=0').then(function (response) {
            _this.s_province = response.data;
            _this.d_province = response.data;
        }).catch(function () {

        });
        //请求分类信息
        axios.get('/bos/type/getTypeByPid?pid=0').then(function (response) {
            _this.type1 = response.data;
        }).catch(function () {

        });
        //查询用户登录信息
        axios.get('/bos/user/getSessionLoginUser').then(function (response) {
            // alert(response.data);
            _this.user = response.data;
        }).catch(function () {

        });
    },
});
//根据省的变化而变化的市  发货地
vue.$watch('info.sprovince', function(nval, oval) {
    if(nval != oval) {
        vue.info.scity = '';
        vue.info.scounty = '';
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
vue.$watch('info.scity', function(nval, oval) {
    if(nval != oval) {
        vue.info.scounty = '';
    }
    if(nval){
        axios.get('/bos/address/getAddByPid?pid='+nval).then(function (response) {
            vue.s_county = response.data;
        }).catch(function () {

        });
    }
});
//根据省的变化而变化的市  目的地
vue.$watch('info.dprovince', function(nval, oval) {
    if(nval != oval) {
        vue.info.dcity = '';
        vue.info.dcounty = '';
    }
    if(nval){
        // alert(nval);
        axios.get('/bos/address/getAddByPid?pid='+nval).then(function (response) {
            vue.d_city = response.data;
        }).catch(function () {

        });
    }
});
//根据市的变化而变化的县  目的地
vue.$watch('info.dcity', function(nval, oval) {
    if(nval != oval) {
        vue.info.dcounty = '';
    }
    if(nval){
        axios.get('/bos/address/getAddByPid?pid='+nval).then(function (response) {
            vue.d_county = response.data;
        }).catch(function () {

        });
    }
});
//根据货物大种类变换小种类
vue.$watch('info.typeGood1', function(nval, oval) {
    if(nval != oval) {
        vue.info.typeGood2 = '';
    }
    if(nval){
        axios.get('/bos/type/getTypeByPid?pid='+nval).then(function (response) {
            vue.type2 = response.data;
        }).catch(function () {

        });
    }
});