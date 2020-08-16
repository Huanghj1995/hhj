<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta charset="UTF-8">
   <style>
table {
    border-collapse: collapse;
}
td {
            text-align: center;
            border: 1px solid #dcdbdb;
        }
.tdColor {
           height: 40px;
           background-color: #f2f2f2;
           color: #438eb9;
       }

.baBody {
    margin-top: 20px;
    margin-left: 90px;
}
.btn_ok {
    display: inline-block;
    width: 100px;
    height: 40px;
    line-height: 40px;
    background-color: #3695cc;
    color: #fff;
    font-size: 16px;
    cursor: pointer;
    text-align: center;}

.btn_yes {
    margin-left: 66px;
}
.bbD .input3 {
    width: 240px;
    height: 40px;
    border: 1px solid #ccc;
    text-indent: 15px;
    margin-left: 10px;
}

    </style>
</head>

<body>


                <table border="1" cellspacing="0" cellpadding="0">
                    <tr>
                        <td width="100px" class="tdColor tdC">序号</td>
                        <td width="200px" class="tdColor">账户</td>
                        <td width="200px" class="tdColor">密码</td>
                        <td width="200px" class="tdColor">操作</td>

                    <c:forEach items="${userList}" var="u">
                        <tr height="40px">
                            <td>${u.id}</td>
                            <td>${u.name}</td>
                            <td>${u.pwd}</td>
                    <td> <a href="/delete${u.id}" > 删除</a>  </td>
                        </tr>
                    </c:forEach>
                </table>

                <form action="<%=basePath %>/add" method="post">
                        <div class="baBody">
                            <div class="bbD">
                                序号<input name="id" type="text" class="input3"/>
                            </div>
                            <div class="bbD">
                                账号<input name= "name" type="text" class="input3" />
                            </div>
                            <div class="bbD">
                                密码<input name= "pwd" type="text" class="input3" />
                            </div>
                            <div class="bbD">
                                <p class="bbDP">
                                    <button class="btn_ok btn_yes" type="submit"  >添加</button>
                                </p>
                            </div>
                        </div>
                </form>


</body>

</html>