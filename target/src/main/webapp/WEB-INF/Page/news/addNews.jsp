<%@ page language="java" contentType="text/html; charset=UTF-8"
	 pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<title>添加新闻</title>

<body>	
<%@ include file="/WEB-INF/Page/common/header.jsp"%>
<script type="text/javascript" charset="utf-8" src="${context_path}/ueditor/ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8" src="${context_path}/ueditor/ueditor.all.min.js"> </script>
<script type="text/javascript" charset="utf-8" src="${context_path}/ueditor/lang/zh-cn/zh-cn.js"></script>
<style ></style>
<s:form action="News_addNews" namespace="/News" method="post">
  


		<div class="controls">
		  标题:<s:textfield name="news.News_Title"></s:textfield>
        </div>		
        类别:
		<div class="controls">
		
        <s:doubleselect  theme="simple"  list="allCategory"  name="Category_Id"  listKey="Category_Id"  listValue="Category_Name"  doubleList="map.get(top)"  doubleName="category.Category_Id"   doubleListKey="Category_Id"  doubleListValue="Category_Name"/>

        </div>


<div class="container-fluid">
	<div class="row-fluid">
		<div class="span4">
        时间:
		<div class="controls">
		 <div class="controls input-append date form_date" data-date="" data-date-format="dd MM yyyy" data-link-field="dtp_input2" data-link-format="yyyy-mm-dd">
                    <input size="16" type="text"  value="" readonly>
                    <span class="add-on"><i class="icon-remove"></i></span>
					<span class="add-on"><i class="icon-th"></i></span>
         </div>
        </div>
		</div>
		<div class="span4">

		<div class="controls">
		地点:
 			<s:doubleselect  theme="simple"  list="allAddress"  name="Address_Id"  listKey="Address_Id"  listValue="Address_Name"  doubleList="maping.get(top)"  doubleName="address.Address_Id"   doubleListKey="Address_Id"  doubleListValue="Address_Name"/>
            </div>

		</div>
		<div class="span4">

         人物:
		<div class="controls">
     <select class="multiSelect" name="news.News_Persion" style="width:200px">
        <option >tom</option>
        <option >admin</option>
        <option >alex</option>
</select>
</div>
		</div>
	</div>
</div>

 内容: <s:textarea  name="news.News_Content" id="editor"  ></s:textarea></br>

   
<s:submit value="提交"></s:submit>
</s:form>



<script type="text/javascript" charset="utf-8">

   UE.getEditor('editor');
   
   setTimeout(function () {
    editor.execCommand('drafts');
    }, 500); 

</script>


<script type="text/javascript">

	$('.form_date').datetimepicker({
        language:  'zh-CN',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		minView: 2,
		forceParse: 0
    });
	
</script>


</body>
</html>
