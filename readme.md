##说明
本系统单纯作为学习使用,
##采用技术:
spring-boot,mybaits
##使用插件
generator,pagehelper
##启动说明:
###启动需要环境
jdk1.8,mysql 1.7,idea
###启动操作步骤
1.在mysql中创建数据库,打开doc文件,将mysql脚本在数据库中执行
2.并更application.properties文件中的对应地址账号密码
3.在 StudynewprojectApplication.java 文件中右键启动
###添加日志记录
日志控制配置文件:log4j.properties
可控制台打印日志,可输入日志到文件,当前输入目录为:D:\\logs\\springboot*(可更改)
<<resources/doc/log4j内容说明.txt>> 为 log4j内使用说明
###添加自定义异常,
添加自定义异常,并捕获全局异常,将得到的异常信息json返回给前端,并且将异常堆栈信息打印入日志文件.
