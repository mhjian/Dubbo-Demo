package free.dubbo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import free.dubbo.study.service.DemoService;


public class Consumer {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("file:D:/projectWorkBench/android_work/Consumer/WebContent/WEB-INF/dubbo-consumer.xml");
		context.start();
		DemoService demoService = (DemoService)context.getBean("demoService"); 
	    String hello = demoService.sayHello("world");//调用服务端方法
	    System.out.println(hello);
	}
}
