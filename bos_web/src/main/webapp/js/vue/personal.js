new Vue({
    el: '#app',
    //Vue中的model模块。
    data: {
        user:{
            id:'',
            username:'',
            role:'',
            sex:'',
            phone:'',
            realname:'',
            email:'',
            driverType:'',
            fileNo:''
        },
        //修改个人信息
        dialogFormVisible1:false,
        formLabelWidth: '120px',
        //车辆信息
        dialogFormVisible2:false,
        formLabelWidth1:'150px',
        car:{
            cid:'',
            cno:'',
            ctype:'',
            cowner:'',
            caddress:'',
            cuseCharacter:'',
            cmodel:'',
            cvin:'',
            cengineNo:'',
            cissusDate:'',
            cweight:''
        }
    },
    methods: {
        //修改用户信息
        editUser:function () {
            var _this = this;
            _this.dialogFormVisible1 = false;
            //将修改的个人信息保存到数据库中
            axios.post('/bos/user/editUser',_this.user).then(function (response) {
                alert(response.data.message);
                _this.selectUser();
                window.location.href = '/bos/personal.html';
            }).catch(function () {

            });
        },
        //查询用户登录信息 如果用户是车主则继续查询车辆信息
        selectUser:function () {
            var _this = this;
            _this.user = {
                id:'',
                username:'',
                role:'',
                sex:'',
                phone:'',
                realname:'',
                email:''
            };
            axios.get('/bos/user/getSessionLoginUser').then(function (response) {
                // alert(response.data);
                _this.user = response.data;
                // 如果用户是车主则继续查询车辆信息
                if(_this.user.role == '2'){
                    // alert("111");
                    axios.get('/bos/car/getCarByUserId?cuser='+_this.user.id).then(function (response) {
                        _this.car = response.data;
                    }).catch();
                }
            }).catch(function () {

            });
        },
        //车辆信息
        save:function () {
            var _this = this;
            _this.dialogFormVisible2 = false;
            // alert(_this.car.cno);
            if(_this.car.cid != null && _this.car.cid != ''){
                axios.post('/bos/car/editCar',_this.car).then(function (response) {
                    alert(response.data.message);
                    window.location.href = '/bos/personal.html'
                }).catch(function () {

                });
            }else {
                axios.post('/bos/car/addCar',_this.car).then(function (response) {
                    alert(response.data.message);
                }).catch(function () {

                });
            }
        }
    },
    //异步请求 axios
    mounted:function() {
        this.selectUser();
    }
})