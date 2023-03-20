package com.earquake.sgfdi;

import com.earquake.sgfdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SgfDiApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SgfDiApplication.class, args);

		System.out.println("===== I18N Controller");
		I18nController i18nController = context.getBean(I18nController.class);
		System.out.println(i18nController.sayGreeting());

		System.out.println("===== Primary Bean");
		TestController controller = context.getBean(TestController.class);
		System.out.println(controller.sayHello());

		System.out.println("===== Property");
		PropertyInjectedController propertyInjectedController = context.getBean(PropertyInjectedController.class);
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("===== Setter");
		SetterInjectedController setterInjectedController = context.getBean(SetterInjectedController.class);
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("===== Constructor");
		ConstructorInjectedController constructorInjectedController = context.getBean(ConstructorInjectedController.class);
		System.out.println(constructorInjectedController.getGreeting());
	}
}
