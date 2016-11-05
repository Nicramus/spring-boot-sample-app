package hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HostsController {
	
	@RequestMapping("/hosts")
	public String hostss() {
		return "HostsView";
	}
	
}
