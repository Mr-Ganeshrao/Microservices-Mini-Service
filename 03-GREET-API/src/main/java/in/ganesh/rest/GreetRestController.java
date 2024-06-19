package in.ganesh.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {

	private Logger logger = LoggerFactory.getLogger(GreetRestController.class);
	
	@GetMapping("/greet/{name}")
	public String greetMsg(@PathVariable("name") String name) {

		logger.info("greetMsg() Execution -Start ");
		String msg = name + "Good Morning";

		logger.info("greetMsg() Execution - end");

		return msg;
	}
}
