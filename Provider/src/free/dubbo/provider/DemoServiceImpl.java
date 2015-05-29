package free.dubbo.provider;

import free.dubbo.study.service.DemoService;


public class DemoServiceImpl implements DemoService{

	public String sayHello(String name) {
		return "Hello Dubbo,Hello,Jason,Peter " + name;
	}

}
