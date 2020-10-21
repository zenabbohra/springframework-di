package com.springframework.sfdi;

import com.springframework.sfdi.controllers.ConstructorInjectedController;
import com.springframework.sfdi.controllers.MyController;
import com.springframework.sfdi.controllers.PropertyInjectedController;
import com.springframework.sfdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfDiApplication.class, args);

		System.out.println("-----MyController");
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.getGreeting());

		System.out.println("-----PropertyInjectedController");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("-----SetterInjectedController");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-----ConstructorInjectedController");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
