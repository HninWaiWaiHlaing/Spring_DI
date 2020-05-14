package guru.spring5.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	public String sayHello() {
		System.out.println("Hello World!!!!");	
		return "Hi Yuki.";
	}
}