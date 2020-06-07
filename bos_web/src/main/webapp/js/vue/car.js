new Vue({
    el: '#app',
    //Vue中的model模块。
    data: {
        //用户信息
        user:{
            // username:'',
            // role:''
        },
        //查询的选项
        search: {
            search_cweight: '',
        },
        //分页信息
        list:[],
        totalRecord: 1,
        pageSize: 3,
        currentNum: 1,
        //页面加载
        loading:false,
        //详细信息页面的显示与隐藏
        dialogFormVisible:false,
        seeNewCar:{
            car:{
                cno:'',
                ctype:'',
                cweight:'',
                createdTime:''
            },
            carUser:{
                username:'',
                realname:'',
                phone:''
            }
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
        //分页方法
        fenye:function (url) {
            var _this = this;
            _this.loading = true;
            axios.get(url).then(function (response) {
                _this.loading = false;
                // _this.list = response.data;   //没有分页时的
                _this.list = response.data.list;  //msg.data就是后端返回的json数据
                _this.totalRecord = response.data.total;
                _this.currentNum = response.data.pageNum;
                _this.pageSize = response.data.pageSize;
            }).catch()
        },
        //搜索的方法
        onSubmit:function(){
            var _this = this;
            axios.get('/bos/newCar/getAllNewCar',{params:_this.search}).then(function (response) {
                _this.loading = false;
                // _this.list = response.data;   //没有分页时的
                _this.list = response.data.list;  //msg.data就是后端返回的json数据
                _this.totalRecord = response.data.total;
                _this.currentNum = response.data.pageNum;
                _this.pageSize = response.data.pageSize;
            }).catch(function () {

            });
        },
        //改变页码
        changeNum:function (num) {
            this.fenye('/bos/newCar/getAllNewCar?pageNo=' + num);
        },
        //查看详细信息
        see:function (row) {
            var _this = this;
            if(_this.user != null && _this.user != ''){
                alert(_this.user);
                _this.dialogFormVisible = true;
                _this.seeNewCar.car = row.car;
                _this.seeNewCar.carUser = row.carUser;
            }else {
                alert("请先登录哦！")
            }

        }
    },
    //异步请求 axios
    mounted:function() {
        var _this = this;
        //http://localhost:8080/bos/newcar/getAllNewCar?search_cweight=8
        this.fenye('/bos/newCar/getAllNewCar');
        //查询用户登录信息
        axios.get('/bos/user/getSessionLoginUser').then(function (response) {
            // alert("返回的user" + response.data);
            _this.user = response.data;
            // alert("data中的user" + _this.user);
        }).catch(function () {

        });
    }
})
