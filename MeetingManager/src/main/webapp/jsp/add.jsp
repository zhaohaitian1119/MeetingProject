<%--
  Created by IntelliJ IDEA.
  User: 39740
  Date: 2020/10/5
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script src="/static/js/jquery-1.12.4.js"></script>
<form method="post" action="/add">
    <table border="1px" width="450px">
        <tr align="center">
            <td colspan="2">
                <h3>会议室预定</h3>
            </td>
        </tr>
        <tr>
            <td>会议室:</td>
            <td>
                <select name="meetingname">
                    <option value="一号会议室">一号会议室</option>
                    <option value="二号会议室">二号会议室</option>
                    <option value="三号会议室">三号会议室</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>申请人:</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>预定日期:</td>
            <td><input type="text" name="meetingorder">日期格式yyyy-MM-dd</td>
        </tr>
        <tr align="center">
            <td colspan="2">
                <input type="submit" value="申请">
                <input type="reset" value="重置">
            </td>
        </tr>
    </table>
</form>
<script>
    $("form").submit(function () {
        var name = $("[name = 'name']").val();
        var meetingorder =  $("[name = 'meetingorder']").val();
        var reg = /^\d\d\d\d-\d\d-\d\d$/;
        if(name == ""){
            alert("申请人不能为空");
            return false;
        }
        if(meetingorder == ""){
            alert("预定日期不能为空");
            return false;
        }else if (reg.test(meetingorder) == false) {
            alert("请按照标准格式输入！");
            return false;
        }
    })
</script>
</body>
</html>
