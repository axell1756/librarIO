package controllers;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component("UserController")
@RestController
public class UserController {
	@RequestMapping("/test")
	public String home(){
		return "Das Boot, reporting for duty!";
	}

}