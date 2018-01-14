$(function () {
	$("#Type_div").hide();
	$("#Size_div").hide();
	$("#Style_div").hide();
	$("#Color_div").hide();
	$("#Bar_div").hide();
	$("#Name_div").hide();
	var str = "";
    var thead = "<thead><tr><th>序号</th><th>商品编号</th><th>商品名称</th> <th>商品价格</th><th>操作</th></tr></thead>";
    $("#commdityTable").append(thead);
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
                if (result.length > 0) {
                    str += "<tbody>";
                    for(var i = 0; i< result.length; i ++) {
	                    str += "<tr>"
	                    if(i < 10) {
	                    	str += "<td>" + "0" + i + "</td>";
	                    } else {
	                    	str += "<td>" + i + "</td>";
	                    }
	                    
	                    str += "<td>" + result[i].bar + "</td>";
	                    str += "<td>" + result[i].name + "</td>";
	                    str += "<td>" + result[i].market + "</td>";
	                    str +="<td>"
	                    str +=     "<button type='button' class='btn btn-warning btn-xs'>"
	                    str +=          "<span class='glyphicon glyphicon-edit'></span>"
	                    str +=     "</button>"
	                    str +=     "<button type='button' class='btn btn-danger btn-xs'>"
	                    str +=         "<span class='glyphicon glyphicon-remove-sign'></span>"
	                    str +=     "</button>"
	                    str +="</td>"
	                    str +="</tr>";
                    }
                    str += "</tobody>"
                    $("#commdityTable").append(str);
                } else {
                	console.log("没有数据")
                };
              },
              error : function() {
                alert("异常！");
              }
         });
	});
});