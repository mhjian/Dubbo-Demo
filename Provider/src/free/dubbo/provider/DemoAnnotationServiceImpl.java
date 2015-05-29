package free.dubbo.provider;

import com.alibaba.dubbo.config.annotation.Service;

import free.dubbo.study.service.DemoAnnotationService;


@Service(version="1.0.0")
public class DemoAnnotationServiceImpl implements DemoAnnotationService {
	public String love(String name) {
		
		return "Annotation--Hello " + name;
	}

}
