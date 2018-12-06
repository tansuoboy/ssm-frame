# ssm-frame
配置步骤：
1.创建maven工程
2.修改web.xml文件：开启spring容器和springmvc视图解析，配置编码拦截器和Rest风格请求
3.配置dispatcherServlet-servlet.xml：包扫描（controller）springmvc视图控制和默认jsp存放的位置
4.配置spring文件：包扫描（排除controlller）配置数据源，mybatis和事务控制
5.配合mybats文件：
6.创建数据库，使用mybatis的逆向工程生成maper文件
7.测试类测试搭建的环境
