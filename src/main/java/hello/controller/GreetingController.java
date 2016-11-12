package hello.controller;

import org.apache.log4j.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by m on 2016-11-02.
 */

@Controller
public class GreetingController {
	private static Logger log = Logger.getLogger(GreetingController.class.getName());
	
	@RequestMapping("/greetings")
	public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name,
			Model model) {
		model.addAttribute("name", name);
		log.debug("AAAAA GreetingController AAAA");
		return "greeting";
	}
}
