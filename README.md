# SMIntergation2
再次尝试集成mybatis到sping


## 重要解决bug
**报错 ： invalid bound (not found):com.coh.mapper.DepartmentMapper.findAll**

1. 反复检查`文件名 namespace, value, com.coh.mapper`路径等方面，都没有发现任何异常

2. **看起来一切都很正常**  

3. 但是，下次请记得用maven的项目时，请**手动**执行`clean,validate,compile,test`  

4. 这时一个报错出现了:  
``java.lang.IllegalAccessError: class lombok.javac.apt.LombokProcessor cannot access class com.sun.tools.javac.processing.JavacProcessingEnvironment``  

5. 这个问题并不是spring报错所能体现的，而关键就在这个报错上，于是之前的反复检查语法都变成了方向错误的瞎搞  
``https://stackoverflow.com/questions/66801256/java-lang-illegalaccesserror-class-lombok-javac-apt-lombokprocessor-cannot-acce
``  

6. 解决方案是把lombok版本由原来的1.18.10换成1.18.22
7. 坑爹啊！这么隐蔽对新手真的好吗，maven兄出来解释一下

## 重要bug解决
1. 请检查target编译文件中是否有`XxxClassMapper.xml`文件
2. 没有的话，测试会报错 ` invalid bound(not found)`
3. 请手动添加这个文件到target相应目录下
4. 解决！

### 学习结束
**视频地址**[【Spring】bilibili的up主视频】](https://www.bilibili.com/video/BV1FR4y1x7Sp/?share_source=copy_web&vd_source=4ab8c0bacabe264ca7fc26a04c087e55)