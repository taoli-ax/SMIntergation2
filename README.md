# SMIntergation2
再次尝试集成mybatis到sping


#### 重要解决bug
报错 ： invalid bound (not found):com.coh.mapper.DepartmentMapper.findAll
反复检查文件名，namespace,value,com.coh.mapper路径等方面，都没有发现任何异常
看起来一切都很正常
但是，下次请记得用maven的项目时，请手动执行clean,validate,compile,test
这时一个报错出现了 ``java.lang.IllegalAccessError: class lombok.javac.apt.LombokProcessor cannot access class com.sun.tools.javac.processing.JavacProcessingEnvironment``
这个问题并不是spring报错所能体现的，而关键就在这个报错上，于是之前的反复检查语法都变成了方向错误的瞎搞
``https://stackoverflow.com/questions/66801256/java-lang-illegalaccesserror-class-lombok-javac-apt-lombokprocessor-cannot-acce
``
解决方案是把lombok版本由原来的1.18.10换成1.18.22
坑爹啊！这么隐蔽对新手真的好吗，maven兄出来解释一下
