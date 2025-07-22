package ioc_example.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ioc_example.spring.models.Employee;

public class App {
	public static void main(String[] args) {

		/*
		 * It creates the Spring container and tells it to: 
		 * Read the configuration class AppConfig.class 
		 * Scan for Spring beans (like @Component, @Service, @Repository, etc.) 
		 * Instantiate those beans 
		 * Wire the dependencies (DI) 
		 * Make the beans available via context.getBean()
		 * 
		 * ✅ ApplicationContext 
		 * It’s the central Spring container.
		 * It manages all the beans, their dependencies, and lifecycle.
		 * 
		 * ✅ AnnotationConfigApplicationContext 
		 * A specific implementation of ApplicationContext that:
		 * Accepts Java-based configuration (no XML)
		 * Scans annotations like @Component, @Bean, @Configuration 
		 * 
		 * ✅ What is a Bean?
		 * A bean is any Java object that Spring manages.
		 * 🔁 Lifecycle Stages:
		 * Instantiation: Object is created
		 * Dependency Injection: Dependencies are set
		 * Post Initialization: Custom logic after setup (@PostConstruct)
		 * Ready to Use
		 * Destruction: Clean-up before shutting down (@PreDestroy)
		 * 
		 * 🧰 Bean Scopes
		 * 
		 * ✅ What is Scope?
		 * Scope defines how many instances of a bean Spring creates and how long they live.
		 * Singleton - One instance per Spring container (default)
		 * Prototype - New instance every time it’s needed
		 * 
		 * example :-
		 * @Component
		 * @Scope("singleton") // default
		 * class SingletonBean {}
		 * 
		 * @Component
		 * @Scope("prototype")
		 * class PrototypeBean {}
		 * 
		 * Autowiring & @Qualifier
		 * ✅ What is Autowiring?
		 * Spring automatically finds and injects the required bean using @Autowired.
		 * 
		 * ⚠️ Problem:
		 * If there are multiple beans of the same type, Spring doesn’t know which to use.
		 * 
		 * ✅ Solution: @Qualifier
		 * @Component("petrolEngine")
		 * class PetrolEngine implements Engine {}
		 * 
		 * @Component("dieselEngine")
		 * class DieselEngine implements Engine {}
		 * 
		 * @Component
		 * class Car {
		 *     @Autowired
		 *     @Qualifier("dieselEngine")
		 *     private Engine engine;
		 * }
		 */

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee e = context.getBean(Employee.class);
		e.gun();
		e.add.fun();
	}
}
