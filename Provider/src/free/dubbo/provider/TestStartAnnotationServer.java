package free.dubbo.provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestStartAnnotationServer {
	
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("test-applicationContext.xml");
		context.start();
		
		System.in.read(); // 按任意键退出
	}
}
