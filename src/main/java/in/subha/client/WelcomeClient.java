package in.subha.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "Welcome-API")
public interface WelcomeClient {
	
	@GetMapping("/welcome")
	public String invokeWelcomeMsg();

}
