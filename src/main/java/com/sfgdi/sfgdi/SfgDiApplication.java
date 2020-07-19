package com.sfgdi.sfgdi;

import com.sfgdi.sfgdi.controllers.*;
import com.sun.org.apache.xml.internal.security.utils.I18n;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SfgDiApplication.class, args);

		MyController myController=(MyController) ctx.getBean("myController");
		System.out.println("--- PRIMARY");
		System.out.println(myController.sayHello());

		System.out.println("----setter");
		SetterInjectedController setterInjectedController=(SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("----property");
		PropertyInjectedController propertyInjectedController=(PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("----constructor");
		ConstrucorInjectedController construcorInjectedController=(ConstrucorInjectedController) ctx.getBean("construcorInjectedController");
		System.out.println(construcorInjectedController.getGreeting());

		I18nController i18nController=(I18nController)ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());
	}

}
