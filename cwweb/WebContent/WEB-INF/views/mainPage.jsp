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
 
        <link rel="stylesheet" type="text/css" href="static/bootstrap/dist/css/bootstrap.min.css" />
        <link rel="stylesheet" type="text/css" href="static/bootstrap/dist/css/bootstrap-theme.min.css" />
        <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
        <link href="static/bootstrap/docs/assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <script type="text/javascript" src="static/js/jquery1.42.min.js"></script>
        <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
        <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
        <script src="static/bootstrap/docs/assets/js/ie-emulation-modes-warning.js"></script>
        
        <script>
        $(function(){
        	//获取所有li的节点
            var list = document.getElementsByTagName("li");
            //给每个li绑定事件
            for(var i = 0;i < list.length;i++){
                list[i].onclick = function(){
                    //将节点的颜色变成红色
                     $(this).addClass("active");
                     $(this).siblings().removeClass("active");
                     var src = $(this).children("a:eq(0)").children("span:eq(0)").text();
                     $('#iframe_body').attr('src', src);
                }
            }
        });
        </script>
        
        <style type="text/css">
        /* Hide for mobile, show later */
            
            
            
            /* Sidebar navigation */
            .nav-sidebar {
              background-color: #D1EEEE;
              margin-right: -14px; /* 20px padding + 1px border */
              margin-bottom: 13px;
              margin-left: -14px;
            }
            .nav-sidebar > li > a {
              padding-right: 20px;
              padding-left: 20px;
            }
            .nav-sidebar > .active > a,
            .nav-sidebar > .active > a:hover,
            .nav-sidebar > .active > a:focus {
              color: #fff;
              background-color: #428bca;
            }
            
            .active{
                color: #fff;
                background-color: #428bca;
            }
            
        </style>
    </head>
  
    <body>
        <div class="container-fluid">  
            <div class="row">  
                <div  class="col-sm-12 col-md-12 sidebar">  
                    <iframe src="user/header" class="col-sm-12 col-md-12 sidebar" scrolling="no" height="50px" frameborder="0"></iframe>
                </div>  
                <div class="col-sm-11 col-md-11 sidebar" style="margin-left: 15px; margin-top: 2px; height: 100%;">
     
                        <div style="background-color: #D1EEEE; height: 100%;" class="col-sm-3 col-md-2 sidebar">
                          <ul class="nav nav-sidebar">
                            <li><a>销售详情<span class="sr-only">user/navPage</span> </a></li>
                            <li><a>商品入库管理 <span class="sr-only">user/inInventory</span></a></li>
                            <li><a>商品出库管理<span class="sr-only">user/outInventory</span></a></li>
                            <li><a>总库存信息<span class="sr-only">user/tatolInventory</span></a></li>
                            <li><a>库存履历 <span class="sr-only">user/resumeInventory</span></a></li>
                            <li><a>销售管理 <span class="sr-only">user/saleAdmin</span></a></li>
                            <li><a>财务统计 <span class="sr-only">user/financeStatistics</span></a></li>
                            <li><a>员工管理<span class="sr-only">user/staffAdmin</span> </a></li>
                            <li><a>用户管理<span class="sr-only">user/userAdmin</span></a></li>
                            <li><a>商品信息管理<span class="sr-only">user/commodityAdmin</span></a></li>
                            <li><a>订单管理 <span class="sr-only">user/orderAdmin</span></a></li>
                          </ul>
                        </div>
                        <div class="col-sm-9 col-md-10 sidebar">  
                            <iframe id ="iframe_body" src="user/navPage" width="100%"  scrolling="no" height="100%" frameborder="0"></iframe>
                        </div>  
               
                </div>
            </div>
              
            <script>  
              
            </script>  
        </div>  
        <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <!-- Just to make our placeholder images work. Don't actually copy the next line! -->
    <script src="static/bootstrap/docs/assets/js/vendor/holder.min.js"></script>
    <script type="text/javascript" src="static/js/jquery-1.8.3.js"></script>
    <script type="text/javascript" src="static/js/jquery1.42.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="static/bootstrap/docs/assets/js/ie10-viewport-bug-workaround.js"></script>
        
    </body>
</html>
