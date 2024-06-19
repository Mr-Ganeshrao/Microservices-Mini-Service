package in.ganesh.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.ganesh.client.GreetApiClient;

@RestController
public class WelcomeRestController {
	
	private Logger logger=LoggerFactory.getLogger(WelcomeRestController.class);
	
	@Autowired
	private GreetApiClient greetApiClient;
	
	@GetMapping("/welcome/{name}")
	public String welcomeMsg(@PathVariable("name") String name) {
		
		logger.info("WelcomeMsg() execution - Start");
		
		String welcomeMsg="wlcome to home..!";
		
		String msg =greetApiClient.invokeGreetApi(name);
		
		
		logger.info("welcomeMSg() execution - end");
		
		return msg +"," +welcomeMsg;
	}

}
