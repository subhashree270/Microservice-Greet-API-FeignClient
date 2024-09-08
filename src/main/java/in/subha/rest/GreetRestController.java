package in.subha.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.subha.client.WelcomeClient;

@RestController
public class GreetRestController {
	@Autowired
	private WelcomeClient welcomeClient;
	
	@Autowired
	private Environment env;
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		String port = env.getProperty("server.port");
		String welcomeMsg = welcomeClient.invokeWelcomeMsg();
		return welcomeMsg.concat("  Good Night...("+port+")") ;
	}

}
