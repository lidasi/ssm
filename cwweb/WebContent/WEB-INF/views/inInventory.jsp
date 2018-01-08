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
<!--         <link href="static/css/inInventory.css" rel="stylesheet" type="text/css" media="all" />
 -->
        <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
        <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
        <script src="static/bootstrap/docs/assets/js/ie-emulation-modes-warning.js"></script>
        <script type="text/javascript" src="static/js/jquery-1.8.3.js"></script>
        
        <script type="text/javascript">
	        $(function () {
	            $('#ann').dropdown('toggle');
	        }); 
        </script>
    </head>
  
     <body>
        <h1 class="page-header">入库信息</h1>
        
        <div class="col-sm-9 col-sm-offset-1 col-md-10 col-md-offset-1 main">
        <div class="row placeholders">
            <div class="form-group col-sm-2 col-md-2">
			    <label for="commodityBar">编号</label>
			    <input type="text" class="form-control" id="commodityBar" placeholder="商品编号">
			</div>
			<div class="form-group col-sm-2 col-md-2">
                <label for="commodityBar">名称</label>
                <input type="text" class="form-control" id="commodityBar" placeholder="商品名称">
            </div>
            <div class="form-group col-sm-2 col-md-2" style="height: 10px">
		            <label class="" for="name">类型</label>
		        <select class="form-control">
		            <option value="0">运动</option>
		            <option value="1">休闲</option>
		            <option value="2">老年装</option>
		        </select>


                
            </div>
            <div class="form-group col-sm-1 col-md-1" style="height: 10px">
                <label for="commodityBar">尺码</label>
                <div class="dropdown">
                      <button id="commoditySize" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                        尺码
                        <span class="caret"></span>
                      </button>
                      <ul class="dropdown-menu" aria-labelledby="commoditySize">
                        <li value="0"><a>XXS</a></li>
                        <li value="1"><a>XS</a></li>
                        <li value="2"><a>S</a></li>
                        <li value="3"><a>M</a></li>
                        <li value="4"><a>L</a></li>
                        <li value="5"><a>XL</a></li>
                        <li value="6"><a>XXL</a></li>
                        <li value="7"><a>XXXL</a></li>
                      </ul>
                </div>
                
            </div>
            <div class="form-group col-sm-1 col-md-1" style="height: 10px">
                <label for="commodityBar">颜色</label>
                <div class="dropdown">
                      <button id="commodityColor" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                        颜色
                        <span class="caret"></span>
                      </button>
                      <ul class="dropdown-menu" aria-labelledby="commodityColor">
                        <li value="0"><a>红</a></li>
                        <li value="1"><a>橙</a></li>
                        <li value="2"><a>黄</a></li>
                        <li value="3"><a>绿</a></li>
                        <li value="4"><a>青</a></li>
                        <li value="5"><a>蓝</a></li>
                        <li value="6"><a>紫</a></li>
                      </ul>
                </div>
                
            </div>
            <div class="form-group col-sm-1 col-md-1" style="height: 10px">
                <label for="commodityBar">款式</label>
                <div class="dropdown">
                      <button id="commodityStyle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                        款式
                        <span class="caret"></span>
                      </button>
                      <ul class="dropdown-menu" aria-labelledby="commodityStyle">
                        <li value="0"><a>春装</a></li>
                        <li value="1"><a>冬装</a></li>
                        <li value="2"><a>夏装</a></li>
                        <li value="3"><a>秋装</a></li>
                        <li value="4"><a>四季装</a></li>
                        
                      </ul>
                </div>
                
            </div>
			<div class="form-group col-sm-1 col-md-1">
			     <label for="search">检索</label>
			     <button type="button" class="form-control btn btn-info btn-xs" id="search">
                     <span class="glyphicon glyphicon-search"></span>
                 </button>
			</div>
        </div>
        <div class="row placeholders">
            <div id="searchInfo"></div>
        </div>
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
