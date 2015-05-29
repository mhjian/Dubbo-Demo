
package free.dubbo.consumer.controller;
import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import free.dubbo.study.service.DemoService;

@Controller
public class CosumerController {
	@Resource(name="demoService")
	private DemoService demoService;
	
	
	@RequestMapping(value="/dubbo",method=RequestMethod.GET)
	public String index(ModelMap model){
		long startTime = System.currentTimeMillis();
		String result = demoService.sayHello("world,XML");
		model.put("result", result);
		
		long endTime = System.currentTimeMillis();
		model.put("useTimes", endTime-startTime);
		model.addAttribute("msg", result);
		return "index";
	}

}
