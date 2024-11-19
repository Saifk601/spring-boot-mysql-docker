package in.saifit;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import in.saifit.entity.user;
import in.saifit.repository.userRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		userRepository user = context.getBean(userRepository.class);
		
		/*user u1 = new user(108, "adnan", "male", 29, "India");
		user u2 = new user(109, "javed", "male", 33, "usa");
		user u3 = new user(110, "jabir", "male", 33, "India");
		user u4 = new user(111, "shakil", "male", 30, "usa");
		
		user u5 = new user(112, "farman", "male", 29, "germany");
		user u6 = new user(113, "saad", "male", 28, "India");
		user u7 = new user(114, "faizan", "male", 32, "India");
		
		
		user.saveAll(Arrays.asList(u1,u2,u3,u4,u5,u6,u7));*/
		
		
		//Sorting
		
		
		/*List<in.saifit.entity.user> list = user.findAll(Sort.by("userAge").ascending());
		list.forEach(u1 ->{
			System.out.println(u1);
		});
		System.out.println("#########################################################");
		List<in.saifit.entity.user> list2 = user.findAll(Sort.by( "userName","userAge").descending());
		list.forEach(u2 ->{
			System.out.println(u2);
		});*/
		
		// pagination
		
		/*PageRequest pageRequest = PageRequest.of(2, 3);
		Page<in.saifit.entity.user> all = user.findAll(pageRequest);
		int totalPages = all.getTotalPages();
		System.out.println(totalPages);
		List<in.saifit.entity.user> list = all.getContent();
		list.forEach(u1->{
			System.out.println(u1);
		});*/
		
		//Query by example
		
		  user entity = new user();
		  
		  entity.setCountry("India");
		  entity.setUserAge(26);
		
		  Example<in.saifit.entity.user> example = Example.of(entity);
		  List<in.saifit.entity.user> list = user.findAll(example);
		  list.forEach(u1 ->{
			  System.out.println(u1);
		  });
	}

}
