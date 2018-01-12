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
        
        <script type="text/javascript">
	        $(function () {
	        	$("#Type_div").hide();
	        	$("#Size_div").hide();
	        	$("#Style_div").hide();
	        	$("#Color_div").hide();
	        	$("#Bar_div").hide();
	        	$("#Name_div").hide();
	        	
	        	var searchInfo;
	        	$(".selectType").change(function(){
	        	       var selectType=$(this).children('option:selected').val()
	        	       if (selectType != "" && selectType != null) {
	        	    	   if(selectType == 0) {
	        	    		   $("#Type_div_text").html("运动")
	        	    		   $("#Type_div").show();
	        	    	   } else if(selectType == 1) {
                               $("#Type_div_text").html("休闲")
                               $("#Type_div").show();
                           } else if(selectType == 2) {
                               $("#Type_div_text").html("老年装")
                               $("#Type_div").show();
                           }
	        	       } else {
	        	    	   $("#Type_div_text").html("")
	        	    	   $("#Type_div").hide();
	        	       }
	        	});
	        	
	        	$(".selectSize").change(function(){
                    var selectSize=$(this).children('option:selected').val()
                    if (selectSize != "" && selectSize != null) {
                        if(selectSize == 0) {
                            $("#Size_div_text").html("XXS")
                            $("#Size_div").show();
                        } else if(selectSize == 1) {
                            $("#Size_div_text").html("XS")
                            $("#Size_div").show();
                        } else if(selectSize == 2) {
                            $("#Size_div_text").html("S")
                            $("#Size_div").show();
                        } else if(selectSize == 3) {
                            $("#Size_div_text").html("M")
                            $("#Size_div").show();
                        } else if(selectSize == 4) {
                            $("#Size_div_text").html("L")
                            $("#Size_div").show();
                        } else if(selectSize == 5) {
                            $("#Size_div_text").html("XL")
                            $("#Size_div").show();
                        } else if(selectSize == 6) {
                            $("#Size_div_text").html("XXL")
                            $("#Size_div").show();
                        } else if(selectSize == 7) {
                            $("#Size_div_text").html("XXXL")
                            $("#Size_div").show();
                        }
                    } else {
                        $("#Size_div_text").html("")
                        $("#Size_div").hide();
                    }
             });
	        	
	        	$(".selectStyle").change(function(){
                    var selectStyle=$(this).children('option:selected').val()
                    if (selectStyle != "" && selectStyle != null) {
                        if(selectStyle == 0) {
                            $("#Style_div_text").html("春装")
                            $("#Style_div").show();
                        } else if(selectStyle == 1) {
                            $("#Style_div_text").html("夏装")
                            $("#Style_div").show();
                        } else if(selectStyle == 2) {
                            $("#Style_div_text").html("秋装")
                            $("#Style_div").show();
                        } else if(selectStyle == 3) {
                            $("#Style_div_text").html("冬装")
                            $("#Style_div").show();
                        } else if(selectStyle == 4) {
                            $("#Style_div_text").html("四季装")
                            $("#Style_div").show();
                        }
                    } else {
                        $("#Style_div_text").html("")
                        $("#Style_div").hide();
                    }
             });
	        	
	        	$(".selectColor").change(function(){
                    var selectColor=$(this).children('option:selected').val()
                    if (selectColor != "" && selectColor != null) {
                        if(selectColor == 0) {
                            $("#Color_div_text").html("红")
                            $("#Color_div").show();
                        } else if(selectColor == 1) {
                            $("#Color_div_text").html("橙")
                            $("#Color_div").show();
                        } else if(selectColor == 2) {
                            $("#Color_div_text").html("黄")
                            $("#Color_div").show();
                        } else if(selectColor == 3) {
                            $("#Color_div_text").html("绿")
                            $("#Color_div").show();
                        } else if(selectColor == 4) {
                            $("#Color_div_text").html("青")
                            $("#Color_div").show();
                        } else if(selectColor == 5) {
                            $("#Color_div_text").html("蓝")
                            $("#Color_div").show();
                        } else if(selectColor == 6) {
                            $("#Color_div_text").html("紫")
                            $("#Color_div").show();
                        }
                    } else {
                        $("#Color_div_text").html("")
                        $("#Color_div").hide();
                    }
             });
	        	
	        $("#commodityBar").change(function(){
	        	var commodityBar = $("#commodityBar").val();
	        	if (commodityBar != "" && commodityBar != null) {
	        		$("#Bar_div_text").html(commodityBar);
	        		$("#Bar_div").show();
	        	} else {
	        		$("#Bar_div").hide();
	        	}
	        });
	        $("#commodityName").change(function(){
                var commodityName = $("#commodityName").val();
                if (commodityName != "" && commodityName != null) {
                    $("#Name_div_text").html(commodityName);
                    $("#Name_div").show();
                } else {
                    $("#Name_div").hide();
                }
            });
	            
	        	$("#Type_div_btn").click(function(){
	        		$("#Type_div").hide();
	        		$(".selectType").val("");
	        	});
	        	
	        	$("#Size_div_btn").click(function(){
                    $("#Size_div").hide();
                    $(".selectSize").val("");
                });
	        	
	        	$("#Style_div_btn").click(function(){
                    $("#Style_div").hide();
                    $(".selectStyle").val("");
                });
	        	$("#Color_div_btn").click(function(){
                    $("#Color_div").hide();
                    $(".selectColor").val("");
                });
	        	$("#Bar_div_btn").click(function(){
                    $("#Bar_div").hide();
                    $("#commodityBar").val("");
                });
	        	$("#Name_div_btn").click(function(){
                    $("#Name_div").hide();
                    $("#commodityName").val("");
                });
	        	
	        	$("#search").click(function(){
	        		var type = $(".selectType").children('option:selected').val();
	        		var size = $(".selectSize").children('option:selected').val();
	        		var style = $(".selectStyle").children('option:selected').val();
	        		var color = $(".selectColor").children('option:selected').val();
	        		var bar = $("#commodityBar").val();
	        		var name = $("#commodityName").val();
	        		var formArry = {
	        			"type" : type, 
	        			"size" : size,
	        			"style" : style,
	        			"color" : color,
	        			"bar" : bar,
	        			"name" : name
	        		};
	        				
	        		$.ajax({
	                    //几个参数需要注意一下
	                      type: "GET",//方法类型
	                      dataType: "json",//服务端接收的数据类型
	                      url: "user/commoditySearch",//url
	                      async: true,
	                      data: formArry,
	                      success: function (result) {
	                        console.log(result);//打印服务端返回的数据(调试用)
	                        if (result.commodityInfo != null && result.commodityInfo != "") {
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
	        	});
	        });
        </script>
    </head>
  
     <body>
        <h1 class="page-header">入库信息</h1>
        
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
        <hr>
        <hr>
        <div class="row placeholders">
	         <h2 class="sub-header">库存详情</h2>
	          <div class="table-responsive">
	            <table class="table table-hover">
	              <thead>
	                <tr>
	                  <th>序号</th>
	                  <th>商品编号</th>
	                  <th>商品名称</th>
	                  <th>商品价格</th>
	                  <th>商品库存数量</th>
	                  <th>计量单位</th>
	                  <th>操作</th>
	                </tr>
	              </thead>
	              <tbody>
	                <tr>
	                  <td>001</td>
	                  <td>000001</td>
	                  <td>毛线大衣</td>
	                  <td>2394.55</td>
	                  <td>120</td>
	                  <td>件</td>
	                  <td>
	                       <button type="button" class="btn btn-warning btn-xs">
                                <span class="glyphicon glyphicon-edit"></span>
                           </button>
                            <button type="button" class="btn btn-danger btn-xs">
                                <span class="glyphicon glyphicon-remove-sign"></span>
                           </button>
                      </td>
	                </tr>
	                <tr>
	                  <td>002</td>
	                  <td>000002</td>
	                  <td>皮革大衣</td>
	                  <td>99999</td>
	                  <td>13</td>
	                  <td>件</td>
	                  <td>
                           <button type="button" class="btn btn-warning btn-xs">
                                <span class="glyphicon glyphicon-edit"></span>
                           </button>
                            <button type="button" class="btn btn-danger btn-xs">
                                <span class="glyphicon glyphicon-remove-sign"></span>
                           </button>
                      </td>
	                </tr>
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
