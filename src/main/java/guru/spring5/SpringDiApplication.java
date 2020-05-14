package guru.spring5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.spring5.controller.MyController;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(SpringDiApplication.class, args);
		MyController myController = (MyController)ctx.getBean("myController");
		String greetString= myController.sayHello();
		System.out.println(greetString);
	}

}
