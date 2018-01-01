<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
pageContext.setAttribute("webpath", path);
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <base href="<%=basePath%>">
        
        <title>后台管理系统</title>
        
        <meta http-equiv="pragma" content="no-cache">
        <meta http-equiv="cache-control" content="no-cache">
        <meta http-equiv="expires" content="0">    
        <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
        <meta http-equiv="description" content="This is my page">
        <!--
        <link rel="stylesheet" type="text/css" href="styles.css">
        -->      
        <link href="static/css/login.css" rel="stylesheet" rev="stylesheet" type="text/css" media="all" />
        
        <link href="static/css/demo.css" rel="stylesheet" rev="stylesheet" type="text/css" media="all" />
        
        <script type="text/javascript" src="static/js/jquery1.42.min.js"></script>
        
        <script type="text/javascript" src="static/js/jquery.SuperSlide.js"></script>
        
        <script type="text/javascript" src="static/js/Validform_v5.3.2_min.js"></script>
        <script>
      //更换验证码
        function chageCode(){
            $('#codeImage').attr('src','user/authCode?abc='+Math.random());//链接后添加Math.random，确保每次产生新的验证码，避免缓存问题。
        }
            $(function(){
            
                $(".i-text").focus(function(){
                    $(this).addClass('h-light');
                });
                
                $(".i-text").focusout(function(){
                    $(this).removeClass('h-light');
                });
                
                $("#username").focus(function(){
                    var username = $(this).val();
                    if(username=='输入账号'){
                        $(this).val('');
                    }
                });
                
                $("#username").focusout(function(){
                    var username = $(this).val();
                    if(username==''){
                        $(this).val('输入账号');
                    }
                });
                
                $("#password").focus(function(){
                    var username = $(this).val();
                    if(username=='输入密码'){
                        $(this).val('');
                    }
                });
                
                $("#yzm").focus(function(){
                    var username = $(this).val();
                    if(username=='输入验证码'){
                    $(this).val('');
                    }
                });
                
                $("#yzm").focusout(function(){
                    var username = $(this).val();
                    if(username==''){
                    $(this).val('输入验证码');
                    }
                });
                
                $(".registerform").Validform({
                    tiptype:function(msg,o,cssctl){
                        var objtip=$(".error-box");
                        cssctl(objtip,o.type);
                        objtip.text(msg);
                    },
                    ajaxPost:true
                });
            });
            
            function login() {
                $.ajax({
                //几个参数需要注意一下
                  type: "GET",//方法类型
                  dataType: "json",//服务端接收的数据类型
                  url: "user/userCheck",//url
                  async: true,
                  data: {username:$("#username").val(), password:$("#password").val(), strCode:$("#yzm").val()},
                  success: function (result) {
                    console.log(result);//打印服务端返回的数据(调试用)
                    if (result.checkCode == 200) {
                    	alert("SUCCESS");
                    	chageCode()
                    	window.location.href = 'user/mainPage';
                      
                    } else {
                    	alert("失败");
                    };
                  },
                  error : function() {
                    alert("异常！");
                  }
                });
              }
        </script>
    </head>
  
    <body>
        <div class="header">
            <h1 class="headerLogo"><a title="后台管理系统" target="_blank" ><img alt="logo" src=""></a></h1>
            <div class="headerNav">
                <a target="_blank" href="#">菜单一</a>
                <a target="_blank" href="#">菜单二</a>
                <a target="_blank" href="#">菜单三</a>
                <a target="_blank" href="#">菜单四</a>
                <a target="_blank" href="#">帮助</a>    
            </div>
        </div>
        
        <div class="banner">
        <div class="login-aside">
            <div id="o-box-up"></div>
            <div id="o-box-down"  style="table-layout:fixed;">
                <div class="error-box"></div>
                <form  id = "registerform" class="registerform" onsubmit="return false" action="##" method="post">
                    <div class="fm-item">
                        <label for="logonId" class="form-label">登录帐号：</label>
                        <input type="text" value="输入账号" maxlength="100" id="username" class="i-text" datatype="s6-18" errormsg="用户名至少6个字符,最多18个字符！"  >    
                        <div class="ui-form-explain"></div>
                    </div>
                
                    <div class="fm-item">
                        <label for="logonId" class="form-label">登陆密码：</label>
                        <input type="password" value="" maxlength="100" id="password" class="i-text" datatype="*6-16" nullmsg="请输入密码！" errormsg="密码范围在6~16位之间！">    
                        <div class="ui-form-explain"></div>
                    </div>
                
                    <div class="fm-item pos-r">
                        <label for="logonId" class="form-label">验证码</label>
                        <input type="text" value="输入验证码" maxlength="100" id="yzm" class="i-text yzm" nullmsg="请输入验证码！" >    
                        <!--  <div class="ui-form-explain"><img src="user/authCode" onclick="chageCode()" title="图片看不清？点击重新得到验证码" style="cursor:pointer" class="yzm-img" /></div>-->
                        <label class="ui-form-explain"><img type="image" src="user/authCode" id="codeImage" onclick="chageCode()" title="图片看不清？点击重新得到验证码" style="cursor:pointer;" class="yzm-img"/></label>
                        <label style="margin-left: 80px"><a onclick="chageCode()" style="cursor:pointer;">换一张</a></label>
                    </div>
                  
                    <div class="fm-item">
                        <label for="logonId" class="form-label"></label>
                        <input type="button" onclick="login()" value="" tabindex="4" id="send-btn" class="btn-login"> 
                        <div class="ui-form-explain"></div>
                    </div>
                </form>
            </div>
        </div>
            <div class="bd">
                <ul>
                    <li style="background:url(static/themes/theme-pic1.jpg) #CCE1F3 center 0 no-repeat;"></li>
                    <li style="background:url(static/themes/theme-pic2.jpg) #BCE0FF center 0 no-repeat;"></li>
                </ul>
            </div>
            <div class="hd"><ul></ul></div>
        </div>
        <script type="text/javascript">jQuery(".banner").slide({ titCell:".hd ul", mainCell:".bd ul", effect:"fold",  autoPlay:true, autoPage:true, trigger:"click" });</script>
        <div class="banner-shadow"></div>

    
    </body>
</html>
