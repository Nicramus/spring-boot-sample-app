package hello.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HostsController {
	
	List<String> hosts = new ArrayList();	
	String label = "Test label";
	
	{
		hosts.add("Host1");
		hosts.add("Host2");
		hosts.add("Host3");
	}
	
	@RequestMapping("/hosts")
	public String hostss(Model model) {
		model.addAttribute("hosts", hosts);
		return "HostsView";
	}
	
}
