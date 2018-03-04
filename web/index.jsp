<%--
  Created by IntelliJ IDEA.
  User: 红菱
  Date: 2018/1/26
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

<%--默认页、登录界面--%>

<head>
    <meta charset="UTF-8">
    <title>Confession</title>
    <%--<link rel="stylesheet" type="text/css" href="/WEB-INF/css/index.css">--%>
    <style type="text/css">
        body{
            margin: 0;
            padding: 0;
            background-color: #f6f6f6;
            /*box-sizing: border-box;*/
        }

        .container{
            width: 1000px;
            height: 730px;
            margin: 0px auto;
            /*background-color: #ffffff;*/
            box-sizing: border-box;
            padding-top: 80px;
        }
        .container h1{
            text-align: center;
            font-size: 70px;
            letter-spacing: 0px;
        }
        .container h1 span{
            margin: 0;
            padding: 0;
            display: inline-block;
        }
        .container h1 .e{
            color: #271CA2;
            letter-spacing: 0;
        }
        .container h1 .x{
            color: #F08080;
        }
        .container h1 .p{
            color: #22D8D6;
        }
        .container h1 .r{
            color: #895E59;
        }
        .container h1 .e{
            color: #27C82E;
        }
        .container h1 .s1{
            color: #EDDA41;
        }
        .container h1 .s2{
            color: #1AC4EC;
        }
        .container h1 .i{
            color: #E6F116;
        }
        .container h1 .o{
            color: #129DD7;
        }
        .container h1 .n{
            color: #DE09B9;
        }

        .myform .username-div{
            width: 100%;
            height: 50px;
            margin-top: 70px;
            padding-left: 280px;
            box-sizing: border-box;
        }
        .myform .username-div .username-span{
            font-size: 24px;
        }
        .myform .username-div .username{
            width: 350px;
            border-left: none;
            border-top: none;
            border-right: none;
            border-bottom: 1px solid #272424;
            background-color: transparent;
            outline: none;
        }
        .myform .password-div{
            width: 100%;
            height: 50px;
            margin-top: 20px;
            padding-left: 220px;
            box-sizing: border-box;
        }
        .myform .password-div .password-span{
            font-size: 24px;
        }
        .myform .password-div .password{
            width: 350px;
            border-left: none;
            border-top: none;
            border-right: none;
            border-bottom: 1px solid #272424;
            background-color: transparent;
            outline: none;
        }

        .myform .button{
            width: 100%;
            height: 100px;
            box-sizing: border-box;
            padding-left: 320px;
            margin-top: 30px;
        }
        .myform .button input{
            width: 150px;
            height: 40px;
            border-radius: 20px;
            background-color: #5E48FC;
            font-size: 20px;
            margin-right: 50px;
            outline: none;
        }
        .myform .button .black{
            display: block;
            width: 20px;
            float: left;
        }
    </style>

    <script type="text/javascript">
        function goRegister() {
            window.self.location = "/WEB-INF/jsp/register.jsp";
        }
    </script>
</head>
<body>
<div class="container">
    <h1>
        <span class="e">E</span>
        <span class="x">x</span>
        <span class="p">p</span>
        <span class="r">r</span>
        <span class="e">e</span>
        <span class="s1">s</span>
        <span class="s2">s</span>
        <span class="i">i</span>
        <span class="o">o</span>
        <span class="n">n</span>
    </h1>
    <div class="myform">
        <form method="post" action="login.form">
            <div class="username-div">
                <span class="username-span">User : &nbsp;</span>
                <input type="text" name="username" class="username" id="username" />
            </div>
            <div class="password-div">
                <span class="password-span">Password : &nbsp;</span>
                <input type="password" name="password" class="password" id="password" />
            </div>
            <div class="button">
                <input type="submit" name="login" value="Login" />
                <a href="/jsp/register.jsp">
                    <input type="button" name="register" value="Register"/>
                </a>
            </div>
        </form>
    </div>
</div>
</body>
</html>
