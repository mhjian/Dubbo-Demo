package free.dubbo.consumer;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;

import free.dubbo.study.service.DemoAnnotationService;

@Component
public class TestMainAnnotationDemoService {
	@Reference(version = "1.0.0")
	private DemoAnnotationService demoAnnotationService;

	public String proxyHello(String str) {
		return demoAnnotationService.love("world"); // 执行远程方法
	}
}
