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
        <link href="static/css/dashboard.css" rel="stylesheet" type="text/css" media="all" />

        <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
        <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
        <script src="static/bootstrap/docs/assets/js/ie-emulation-modes-warning.js"></script>
        <script type="text/javascript" src="static/js/echarts.js"></script>
       
    </head>
  
    <body>
    		
          <div class="col-sm-11 col-sm-offset-1 col-md-11 col-md-offset-1 main">
          <h1 class="page-header">销售详情</h1>

          <div class="row placeholders">
            <div class="col-xs-6 col-sm-6 placeholder">
                <!-- <img src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" width="200" height="200" class="img-responsive" alt="Generic placeholder thumbnail"> -->
                <!-- 为 ECharts 准备一个具备大小（宽高）的 DOM -->
                <div id="main" class="col-xs-12 col-sm-12 placeholder" style="height: 30%"></div>
		        <script>
		            // 基于准备好的dom，初始化echarts实例
		            var myChart = echarts.init(document.getElementById('main'));
		    
		            // 指定图表的配置项和数据
		            var option = {
		                title: {
		                    text: '销售记录'
		                },
		                tooltip: {},
		                legend: {
		                    data:['销量']
		                },
		                xAxis: {
		                    data: ["衬衫","羊毛衫","雪纺衫","裤子","高跟鞋","袜子"]
		                },
		                yAxis: {
		                	
		                },
		                series: [{
		                    name: '销量',
		                    type: 'bar',
		                    data: [5, 20, 36, 10, 10, 20]
		                }]
		            };
		    
		            // 使用刚指定的配置项和数据显示图表。
		            myChart.setOption(option);
                </script>
                <h4>柱状图</h4>
              <span class="text-muted">月度销量</span>
            </div>
            <div class="col-xs-6 col-sm-6 placeholder">
<!--               <img src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" width="200" height="200" class="img-responsive" alt="Generic placeholder thumbnail">
 -->              
 				<div id="main_01" class="col-xs-12 col-sm-12 placeholder" style="height: 30%"></div>
		        <script>
		            // 基于准备好的dom，初始化echarts实例
		            var myChart = echarts.init(document.getElementById('main_01'));
		    
		            // 指定图表的配置项和数据
		            var option = {
		                title: {
		                    text: '销售记录'
		                },
		                tooltip: {},
		                legend: {
		                    data:['销量']
		                },
		                xAxis: {
		                    data: ["衬衫","羊毛衫","雪纺衫","裤子","高跟鞋","袜子"]
		                },
		                yAxis: {
		                	
		                },
		                series: [{
		                    name: '销量',
		                    type: 'bar',
		                    data: [5, 20, 36, 10, 10, 20]
		                }]
		            };
		    
		            // 使用刚指定的配置项和数据显示图表。
		            myChart.setOption(option);
                </script>
 			 <h4>饼状图</h4>
              <span class="text-muted">出入库对比图</span>
            </div>
          
          </div>

          <h2 class="sub-header">库存详情</h2>
          <div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>序号</th>
                  <th>商品编号</th>
                  <th>商品名称</th>
                  <th>商品价格</th>
                  <th>商品库存数量</th>
                  <th>计量单位</th>
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
                </tr>
                <tr>
                  <td>002</td>
                  <td>000002</td>
                  <td>皮革大衣</td>
                  <td>99999</td>
                  <td>13</td>
                  <td>件</td>
                </tr>

              </tbody>
            </table>
          </div>
        </div>

    
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="static/bootstrap/docs/assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <!-- Just to make our placeholder images work. Don't actually copy the next line! -->
    <script src="static/bootstrap/docs/assets/js/vendor/holder.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="static/bootstrap/docs/assets/js/ie10-viewport-bug-workaround.js"></script>
    
    </body>
</html>
