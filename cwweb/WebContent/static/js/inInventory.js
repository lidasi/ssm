$(function () {
    $("#Type_div").hide();
    $("#Size_div").hide();
    $("#Style_div").hide();
    $("#Color_div").hide();
    $("#Bar_div").hide();
    $("#Name_div").hide();
    
    var str = "";
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
                //打印服务端返回的数据(调试用)
                
                if (result.length > 0) {
                    $("#tbody").html("");
                    str = "";
                    var count = 1;
                    for(var i = 0; i< result.length; i ++) {
                    	
                    	var style = "";
                        switch(result[i].style) {
                            case 1 : style = "春装";
                            break;
                            case 2 : style = "冬装";
                            break;
                            case 3 : style = "夏装";
                            break;
                            case 4 : style = "秋装";
                            break;
                            case 5 : style = "四季装";
                            break;
                            default:
                                style = "未记录的款式";
                        }
                        
                        var color = "";
                        switch(result[i].color) {
        	                case 1 : color = "红色";
        	                break;
        	                case 2 : color = "橙色";
        	                break;
        	                case 3 : color = "黄色";
        	                break;
        	                case 4 : color = "绿色";
        	                break;
        	                case 5 : color = "青色(黑色)";
        	                break;
        	                case 6 : color = "蓝色";
        	                break;
        	                case 7 : color = "紫色";
        	                break;
        	                default:
        	                	color = "未标记颜色";
                        }

                        var size = "";
                        switch(result[i].size) {
        	                case 1 : size = "XXS";
        	                break;
        	                case 2 : size = "XS";
        	                break;
        	                case 3 : size = "S";
        	                break;
        	                case 4 : size = "M";
        	                break;
        	                case 5 : size = "L";
        	                break;
        	                case 6 : size = "XL";
        	                break;
        	                case 7 : size = "XXL";
        	                break;
        	                case 8 : size = "XXXL";
        	                break;
        	                default:
        	                	color = "尺寸不明";
                        }

                        var type = "";
                        switch(result[i].type) {
        	                case 1 : type = "运动";
        	                break;
        	                case 2 : type = "悠闲";
        	                break;
        	                case 3 : type = "牛仔";
        	                break;
        	                default:
        	                    style = "未记录的类型";
                        }
                        
                        //result[i].commdityUnit; 目前只有这一种分类
                        var cUnit = "件";

                        var c_in_type = "";
                        switch(result[i].inType) {
        	                case 1 : c_in_type = "运动";
        	                break;
        	                case 2 : c_in_type = "悠闲";
        	                break;
        	                case 3 : c_in_type = "牛仔";
        	                break;
        	                default:
        	                	c_in_type = "来路不明";
                        }
                    	
                    	
                        if(i%2 != 0) {
                            str += "<tr class='success'>"
                        } else {
                            str += "<tr class='info'>"
                        }
                        
                        if(count < 10) {
                            str += "<td>" + "0" + count + "</td>";
                        } else {
                            str += "<td>" + count + "</td>";
                        }
                        count += 1;
                        str += "<td>" + result[i].bar + "</td>";
                        str += "<td>" + result[i].name + "</td>";
                        str += "<td>" + result[i].market + "</td>";
                        str += "<td>" + style + "</td>";
                        str += "<td>" + color + "</td>";
                        str += "<td>" + size + "</td>";
                        str += "<td>" + type + "</td>";
                        str += "<td>" + result[i].inNumber + "</td>";
                        str += "<td>" + result[i].unitPrice + "</td>";
                        str += "<td>" + result[i].commdityTotal + "</td>";
                        str += "<td>" + c_in_type + "</td>";
                        str += "<td>" + result[i].brokerage + "</td>";
                        str += "<td>" + cUnit + "</td>";
                        str += "<td>" + result[i].inDate + "</td>";
                        str +="<td>"
                        str +=     "<button type='button' class='btn btn-warning btn-xs' data-toggle='tooltip' data-placement='left' title='修改这条入库信息'>"
                        str +=          "<span class='glyphicon glyphicon-edit'></span>"
                        str +=     "</button>"
                        str += 		"&nbsp;&nbsp;"
                        str +=     "<button type='button' class='btn btn-danger btn-xs' data-toggle='tooltip' data-placement='left' title='删除这条入库信息'>"
                        str +=         "<span class='glyphicon glyphicon-remove-sign'></span>"
                        str +=     "</button>"
                        str +="</td>"
                        str +="</tr>";
                    }
                    $("#tbody").append(str);
                } else {
                    $("#tbody").html("");
                };
              },
              error : function() {
                alert("异常！");
              }
         });
    });
});

var addInInventry = function() {
	
}