# Java 设计模式练习<br>
## 一、单例设计模式<br>
	1、饿汉式<br>
	 线程安全，调用效率高，但是，不能延时加载<br>
	[Demo](https://github.com/xiaoxiaobai2/Jvav_Pattern/blob/master/Singleton/SingletonDemo01.java)<br><br>
	2、懒汉式、<br>
	 线程不安全（需要加入同步synchronized），调用效率不高，但是，可以延时加载<br>
	[Demo](https://github.com/xiaoxiaobai2/Jvav_Pattern/blob/master/Singleton/SingletonDemo02.java)<br><br>
	3、双重检测锁式<br>
	 由于JVM地层内部模型原因，偶尔出现问题不建议使用<br><br>
	4、静态内部类<br>
	 线程安全，调用效率高，可以延时加载<br>
	 [Demo](https://github.com/xiaoxiaobai2/Jvav_Pattern/blob/master/Singleton/SingletonDemo03.java)<br><br>
	5、枚举单例<br>
	 线程安全，调用效率高，不能延时加载<br>
	 [Demo](https://github.com/xiaoxiaobai2/Jvav_Pattern/blob/master/Singleton/SingletonDemo04.java)<br><br>
	6、防止反射和反序列化创建多个类<br>
	 [解决办法Demo](https://github.com/xiaoxiaobai2/Jvav_Pattern/blob/master/Singleton/SingletonDemo05.java)<br>
	 [测试Demo](https://github.com/xiaoxiaobai2/Jvav_Pattern/blob/master/Singleton/Test02.java)<br><br>
## 二、工厂设计模式<br>
	1、简单工厂模式（静态工厂模式）<br>
	 虽然某种程度不符合设计原则，但实际使用最多<br>
	 [demo](https://github.com/xiaoxiaobai2/Jvav_Pattern/tree/master/Factory/SimpleFactory)<br><br>
	2、工厂方法模式<br>
	 不修改已有类的前提下，通过增加新的工厂类实现扩展<br>
	 [demo](https://github.com/xiaoxiaobai2/Jvav_Pattern/tree/master/Factory/FactoryMethod)<br><br>
	3、抽象工厂模式（静态工厂模式）<br>
	 不可以增加产品，可以增加产品族<br>
	 [demo](https://github.com/xiaoxiaobai2/Jvav_Pattern/tree/master/Factory/AbstractFactory)<br><br>