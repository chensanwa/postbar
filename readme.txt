
项目名称：PostBar
别名：简易贴吧、小跳蚤

简介：
1、提供用户注册、登录功能，
2、用户可查看其他人在公共区域发的帖子，也可以自己发帖。
3、提供评论功能（不支持嵌套评论）
4、用户可以查看个人空间


实体类与表之间的对应关系：

User类------------user表
Post类------------post表、post表关联comment表
CommentText类-----------comment表

user表：id(PK not null)、name(not null)、gender、address、password(not null)、picture
post表：postid(PK not null)、userid(not null)、title、textcontent、picture、posttime
comment表：commentid(PK not null)、postid(not null)、commenttext(not null)、userid(not null)、discusstime
picture表：postid、picture

post表通过 postid 可关联到comment表中数据，通过userid可关联到user表中数据，通过postid可关联到picture表
comment表通过userid可关联到user表中数据



测试说明：

由于本项目尚未开发完全（目前只开发了登录、注册功能），其中注册时还不能进行上传头像，如须测试，请按照说明测试。

测试环境说明：
Tomcat 8.5.23
JDK 1.8
Intellij IDEA 2017.2.6
Chrome

登录测试步骤：
1、启动服务器，部署项目
2、chrome浏览 http://localhost:8080/postbar即可进入登录界面
3、登录名：Tom 密码：123456
4、点击Login，登录成功即可跳转至“模拟首页”，登录失败即跳转“模拟登录失败页面”

注册测试步骤：
1、启动服务器，部署项目
2、chrome浏览 http://localhost:8080/postbar/register即可进入登录界面
3、输入User、Gender、Address、Password、Picture（尚未开发）
4、点击Register即可注册，注册成功将跳转至“模拟首页”，注册失败将跳转“模拟注册失败页面”





