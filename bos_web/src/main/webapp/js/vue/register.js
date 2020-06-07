var vue = new Vue({
			el: '#app',
			//Vue中的model模块。
			data:{
				user:{
					username:'',
					password:'',
					// checkPasswd:'',
					realname:'',
					sex:'男',
					//age:'',
					phone:'',
					pic:'',
					email:'',
					// code:''
				},
				code:'',
				checkPasswd:'',
				dialogImageUrl: '',
				dialogVisible: false,
				rules: {
				  username: [
					{ required: true, message: '请输入用户名', trigger: 'blur' }
				  ],
				  password: [
					{ required: true, message: '密码不能为空', trigger: 'blur' },
					{ min: 6, message: '密码长度不能少于6位', trigger: 'blur' }
				  ],
				  checkPasswd: [
					// { required: true, message: '密码不能为空', trigger: 'blur' },
					{ validator: validatePass2, trigger: 'blur' }
				  ],
				  realname: [
					{ required: true, message: '请输入真实姓名', trigger: 'blur' }
				  ],
				  phone: [
					{ required: true, message: '请输入联系电话', trigger: 'blur' },
					{ validator: validatePass3, trigger: 'blur' }
				  ],
				  email: [
					{ required: true, message: '请输入邮箱地址', trigger: 'blur' },
					{ validator: validatePass4, trigger: 'blur' }
				  ],
					// code: [
					// 	{ required: true, message: '请输入验证码', trigger: 'blur' }
					// ]

				}
			},
			mounted:function(){

			},
			methods:{
				//普通用户注册 进行简单的验证，验证是否为空
				submit:function(ruleForm){
					var _this = this;
					this.$refs[ruleForm].validate(function(valid) {
						if (valid) {
							//注册
							console.log(_this.user.username);
							axios.post('/bos/user/add?code='+_this.code,_this.user).then(function (response) {
								alert(response.data.message);
								location.href = "login.html";
							}).catch(function () {

							});
							// alert('提交注册!');
						} else {
							alert("请填写必要字段！");
							return false;
						}
					});
				},
				//重置 清除
				reset:function (ruleForm) {
					alert("111");
					this.$refs[ruleForm].resetFields();
				},

				//获取手机验证码
				getCode:function () {
					var _this = this;
					if(_this.user.phone != null && _this.user.phone != ''){
						//获取验证码操作
						// alert(_this.user.phone);
						//将手机号传到后端用来发送验证码
						axios.get('/bos/user/sendCode?phone='+_this.user.phone).then(
							function (response) {
								if(response.data.res){
									alert("验证码发送成功！");
								}
							}
						).catch()
						//读秒
						RemainTime();
					}else {
						alert("请输入手机号！")
					}
				}
			}
		});

//验证两次密码是否一致
function validatePass2(rule, value, callback){
	// alert(value);
	// alert(vue.user.password);
	value = vue.checkPasswd;
	if (value == '') {
	  callback(new Error('请再次输入密码'));
	} else if (value != vue.user.password) {
	  callback(new Error('两次输入密码不一致!'));
	} else {
	  callback();
	}
}

//验证手机号码
function validatePass3(rule,value,callback){
	if(!(/^1[3456789]\d{9}$/.test(value))){
		callback(new Error('请输入正确的电话号码'));
	}
	callback();
}

//验证邮箱号码
function validatePass4(rule,value,callback){
	var el=/^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/;
	if(!el.test(value)){
		callback(new Error('请输入正确的邮箱'))
	}
	callback();
}

//读秒的方法
var iTime = 59;
var Account;
function RemainTime(){
	document.getElementById('zphone').disabled = true;
	var iSecond,sSecond="",sTime="";
	if (iTime >= 0){
		//秒数
		iSecond = parseInt(iTime%60);
		//分数
		iMinute = parseInt(iTime/60)
		if (iSecond >= 0){
			if(iMinute>0){
				sSecond = iMinute + "分" + iSecond + "秒";
			}else{
				sSecond = iSecond + "秒";
			}
		}
		sTime=sSecond;
		if(iTime==0){
			clearTimeout(Account);
			sTime='获取验证码';
			iTime = 59;
			document.getElementById('zphone').disabled = false;
		}else{
			Account = setTimeout("RemainTime()",1000);
			iTime=iTime-1;
		}
	}else{
		sTime='没有倒计时';
	}
	document.getElementById('zphone').innerHTML = sTime;
}
