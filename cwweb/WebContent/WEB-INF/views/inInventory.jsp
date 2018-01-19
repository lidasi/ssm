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
        <link href="static/css/inInventory.css" rel="stylesheet" type="text/css" />

        <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
        <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
        <script src="static/bootstrap/docs/assets/js/ie-emulation-modes-warning.js"></script>
        <script type="text/javascript" src="static/js/jquery-1.8.3.js"></script>
        <script type="text/javascript" src="static/js/inInventory.js"></script>
    </head>
  
     <body>
        <h1 class="page-header">入库信息
             <small style="float: right;"><button type='button' class='btn btn-info btn-md' data-toggle="tooltip" data-placement="left" title="添加一条入库信息" onclick="addInInventry()"><span class='glyphicon glyphicon-plus'></span></button></small>
        </h1>
        
        <div class="col-sm-12 col-md-12 main">
        <div class="row placeholders">
            <div class="form-group col-sm-2 col-md-2">
			    <label for="commodityBar">编号</label>
			    <input type="text" class="form-control" id="commodityBar" placeholder="商品编号">
			</div>
			<div class="form-group col-sm-2 col-md-2">
                <label for="commodityBar">名称</label>
                <input type="text" class="form-control" id="commodityName" placeholder="商品名称">
            </div>
            <div class="form-group col-sm-2 col-md-2" style="height: 10px">
		            <label class="" for="name">类型</label>
		        <select class="selectType form-control">
		            <option value="-1" selected = "selected"></option>
		            <option value="0">运动</option>
		            <option value="1">休闲</option>
		            <option value="2">老年装</option>
		        </select>
                
            </div>
            <div class="form-group col-sm-2 col-md-2" style="height: 10px">
                <label for="commoditySize">尺码</label>
                <select class="selectSize form-control">
                  <option value="-1" selected = "selected"></option>
                  <option value="0">XXS</option>
                  <option value="1">XS</option>
                  <option value="2">S</option>
                  <option value="3">M</option>
                  <option value="4">L</option>
                  <option value="5">XL</option>
                  <option value="6">XXL</option>
                  <option value="7">XXXL</option>
                </select>
                
            </div>
            <div class="form-group col-sm-1 col-md-1" style="height: 10px">
                <label for="commodityColor">颜色</label>
                <select class="selectColor form-control">
                    <option value="-1" selected = "selected"></option>
                    <option value="0">红</option>
                    <option value="1">橙</option>
                    <option value="2">黄</option>
                    <option value="3">绿</option>
                    <option value="4">青</option>
                    <option value="5">蓝</option>
                    <option value="6">紫</option>
                </select>
                
            </div>
            <div class="form-group col-sm-2 col-md-2" style="height: 10px">
                <label for="commodityStyle">款式</label>
                <select class="selectStyle form-control">
                    <option value="-1" selected = "selected"></option>
                    <option value="0">春装</option>
                    <option value="1">夏装</option>
                    <option value="2">秋装</option>
                    <option value="3">冬装</option>
                    <option value="4">四季装</option>
                  
                </select>
                
            </div>
			<div class="form-group col-sm-1 col-md-1">
			     <label for="search">检索</label>
			     <button type="button" class="form-control btn btn-info btn-xs" id="search">
                     <span class="glyphicon glyphicon-search"></span>
                 </button>
			</div>
        </div>
        <div class="row placeholders col-sm-11 col-md-11 ">
            <div class="selectText" id="Bar_div" style="margin-left: -10px">
                    <strong id="Bar_div_text" style="float: left"></strong>
                    <button id="Bar_div_btn" type="button" style="float: right; border:none; background-color: #fff;" >×</button>
            </div>
            <div class="selectText" id="Name_div" style="margin-left: 15px">
                    <strong id="Name_div_text" style="float: left"></strong>
                    <button id="Name_div_btn" type="button" style="float: right; border:none; background-color: #fff;" >×</button>
            </div>
            <div class="selectText" id="Type_div" style="margin-left: 15px">
                    <strong id="Type_div_text" style="float: left"></strong>
                    <button id="Type_div_btn" type="button" style="float: right; border:none; background-color: #fff;" >×</button>
            </div>
            <div class="selectText" id="Size_div" style=" margin-left: 15px">
                    <strong id="Size_div_text" style="float: left"></strong>
                    <button id="Size_div_btn" type="button" style="float: right; border:none; background-color: #fff" >×</button>
            </div>
            <div class="selectText" id="Color_div" style="margin-left: 15px">
                    <strong id="Color_div_text" style="float: left"></strong>
                    <button id="Color_div_btn" type="button" style="float: right; border:none; background-color: #fff" >×</button>
            </div>
            <div class="selectText" id="Style_div" style="margin-left: 15px">
                    <strong id="Style_div_text" style="float: left"></strong>
                    <button id="Style_div_btn" type="button" style="float: right; border:none; background-color: #fff" >×</button>
            </div>
        </div>
        <br>
        <hr>
        <div class="row placeholders">
	         <h2 class="sub-header">库存详情</h2>
	          <div class="table-responsive">
	            <table id="commdityTable" class="table table-hover text-nowrap table-condensed table-bordered" >
	               <thead>
	                   <tr>
	                       <th>序号</th>
	                       <th>商品编号</th>
	                       <th>商品名称</th> 
	                       <th>商品价格</th>
	                       <th>款式</th>
	                       <th>颜色</th>
	                       <th>尺码</th>
	                       <th>类型</th>
	                       <th>入库数量</th>
	                       <th>单价</th>
	                       <th>总价</th>
	                       <th>入库类型</th>
	                       <th>经手人</th>
	                       <th>单位</th>
	                       <th>入库时间</th>
	                       <th>操作</th>
	                   </tr>
	               </thead>
	               <tbody id = "tbody">
	               </tbody>
	            </table>
	          </div>
            </div>
         </div>
         <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
        <script>window.jQuery || document.write('<script src="static/bootstrap/docs/assets/js/vendor/jquery.min.js"><\/script>')</script>
        <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    
    </body>
</html>
