
package free.dubbo.consumer.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import free.dubbo.consumer.TestMainAnnotationDemoService;

@Controller
@Component
public class AnnotationCosumerController {
	/*@Reference( version = "1.0.0")不能controller通用
	private DemoAnnotationService demoAnnotationService;*/
	@Autowired
	TestMainAnnotationDemoService testMainAnnotationDemoService;
	
	@RequestMapping(value="/dubbo-anno",method=RequestMethod.GET)
	public String index(ModelMap model){
		String result = testMainAnnotationDemoService.proxyHello("world,Annotation");
		
		model.addAttribute("msg", result);
		return "index";
	}
	
}
