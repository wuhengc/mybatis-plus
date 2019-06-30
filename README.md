> QQ：33993155 欢迎互相交流

## 简介
这是一个基于Springboot2.x，mybatis-plus3.x 整合的后台的demo
- 你也可以把它作为springboot2.x技术的学习项目；
- 你还可以作为SpringCloud服务化思想的学习理解；
- ...
## 使用技术
- SpringBoot 2.x 后台基本框架
- Mybaits-Plus 好用的mybatis框架
- lombox getter setter插件
- druid 数据库连接池

## 模块分层
### 后端模块
```shell
mybatis-base
├── mybatis-core  # 核心模块：配置文件，Entity类，mapper类，工具类，异常过滤等，自动生成代码
│   ├── pom.xml
│   └── src
├── mybatis-main # 启动模块：
│   ├── pom.xml
└── └── src
```
### 后台依赖关系

mybatis-core -> mybatis-main
- 采用多模块的形式，便于后续SpringCloud微服务的改造升级

```
## 项目部署
### 服务端
项目后端环境
- JDK1.8
- Mysql5.7
- IDEA编译器
- Lombox插件（百度一下）

部署步骤：
1.  导入项目，并且运行mybatis-base -> mybatis-main -> MybatisMainApplication里的main方法

```
### 最后
开源不易，一定要给我==Star==哦！！
