# 又又又又一个商城

## 项目介绍


代码结构


## 技术栈
| 技术栈         | 名称               | 版本   | 备注 | 官网 |
| -------------- | ------------------ | ------ | ---- | ---- |
| SpringBoot     | 脚手架             |  v2.1.5      |      |      |
| JDK     | 运行环境             |  v1.8      |      |      |
| Mybatis-plus   | Orm 框架           |        |      |      |
| MySql          | 数据库               | v8.0.21 |      |      |
| flyway         | 数据库迁移工具     | CE v5.2.4       |      |      |
| Maven          | 项目构建管理工具   |  v3.6.3_1 |      |      |
| Hikari         | 数据库连接池       |        |      |      |
| Swagger-UI     | 在线接口文档       | v2.4.0 |      |      |
| docker-compose | 多容器部署         |        |      |      |
| TestNG         | 接口自动化测试框架 |        |      |      |
| Lombok         | POJO类简化工具     |  v1.18.12 |      |      |
| nginx         |      |   |      |      |

启动项目：
```bash
# 下载 docker 镜像
docker pull mysql:8.0.21

# 启动数据库
docker run -d --name=no-earn-money-mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=123456 -e MYSQL_DATABASE=foodie-shop mysql:8.0.21

```


## 相关地址
功能模块图：https://www.processon.com/view/link/5fbbad93e401fd2d6ed405af  
swagger: http://localhost:8088/doc.html
