<%--
  Created by IntelliJ IDEA.
  User: 红菱
  Date: 2018/1/28
  Time: 0:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<%--注册账户界面--%>

<html>
<head>
    <meta charset="utf-8">
    <title>register</title>
    <%--<link rel="stylesheet" type="text/css" href="../css/register.css">--%>
    <style>
        body{
            margin: 0;
            padding: 0;
            background-color: #f6f6f6;
            box-sizing: border-box;
        }
        .container{
            width: 1000px;
            height: 730px;
            margin: 0 auto;
            background-color: #ffffff;
            padding-top: 80px;
            box-sizing: border-box;
        }

        .container h1{
            /*box-sizing: border-box;*/
            text-align: center;
            font-size: 44px;
            letter-spacing: 0px;
            margin-top: 0px;
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

        .myform .gender-div{
            width: 100%;
            height: 50px;
            margin-top: 20px;
            padding-left: 247px;
            box-sizing: border-box;
        }
        .myform .gender-div .gender-span{
            font-size: 24px;
        }
        .myform .gender-div .gender{
            width: 350px;
            border-left: none;
            border-top: none;
            border-right: none;
            border-bottom: 1px solid #272424;
            background-color: transparent;
            outline: none;
        }


        .myform .address-div{
            width: 100%;
            height: 50px;
            margin-top: 20px;
            padding-left: 238px;
            box-sizing: border-box;
        }
        .myform .address-div .address-span{
            font-size: 24px;
        }
        .myform .address-div .address{
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
        .myform .picture-div{
            width: 100%;
            height: 50px;
            margin-top: 20px;
            padding-left: 246px;
            box-sizing: border-box;
        }
        .myform .picture-div .picture-span{
            font-size: 24px;
        }
        .myform .picture-div .picture{
            width: 352px;
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
</head>
<body>
<div class="container">
    <h1>
        <span class="s1">S</span>
        <span class="n">t</span>
        <span class="e">a</span>
        <span class="i">r</span>
        <span class="r">t</span>
        <span>&nbsp;&nbsp;&nbsp;</span>
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
        <form method="post" action="doregister.form">
            <div class="username-div">
                <span class="username-span">User : &nbsp;</span>
                <input type="text" name="username" class="username" id="username" />
            </div>
            <div class="gender-div">
                <span class="gender-span">Gender : &nbsp;</span>
                <input type="text" name="gender" class="gender" id="gender" />
            </div>
            <div class="address-div">
                <span class="address-span">Address : &nbsp;</span>
                <input type="text" name="address" class="address" id="address" />
            </div>
            <div class="password-div">
                <span class="password-span">Password : &nbsp;</span>
                <input type="password" name="password" class="password" id="password" />
            </div>
            <div class="picture-div">
                <span class="picture-span">Picture : &nbsp;</span>
                <input type="file" name="picture" class="picture" id="picture" />
            </div>
            <div class="button">
                <input type="submit" name="register" value="Register" />
                <span class="black"></span>
                <input type="button" name="return" value="Return" />
            </div>
        </form>
    </div>
</div>
</body>
</html>