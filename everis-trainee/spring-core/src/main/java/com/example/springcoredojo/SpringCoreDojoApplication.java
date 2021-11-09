package com.example.springcoredojo;

import com.example.springcoredojo.ntt.Config;
import com.example.springcoredojo.ntt.UserAlumno;
import com.example.springcoredojo.ntt.Usuario;
import com.example.springcoredojo.ntt2.UserService;
import com.example.springcoredojo.ntt2.Youtuber;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class SpringCoreDojoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreDojoApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
		return args -> {
			creacionBeans();
			ClassPathXmlApplicationContext();
			ClassPathXmlApplicationContext2();
		};
	}

	private void creacionBeans(){
		ApplicationContext context =  new AnnotationConfigApplicationContext(Config.class);
		Usuario usuario = context .getBean("usuario", Usuario.class);
		System.out.println("Usuario: "+ usuario);
	}

	public void ClassPathXmlApplicationContext(){
		ApplicationContext context = new ClassPathXmlApplicationContext("user-bean-config.xml");
		Youtuber youtuber = context.getBean(Youtuber.class);

		System.out.println("Youtuber: " + youtuber.getName());

		/*ApplicationContext context = new ClassPathXmlApplicationContext("user-bean-config.xml");
		UserService userService = context.getBean(UserService.class);

		System.out.println("userService: " + userService.getName());*/
	}

	public void ClassPathXmlApplicationContext2(){
		ApplicationContext context = new ClassPathXmlApplicationContext("user-bean-config.xml");
		UserAlumno userAlumno = context.getBean(UserAlumno.class);

		System.out.println("Alumno: " +userAlumno.getUsuarioAlumno());
	}
}
