package ioc_example.spring.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component - Tells Spring to create a bean of the below class
@Component
public class Employee {

	public Address add;

	/*
	 * @Autowired - IOC injects the dependency of the Address class in the Employee object 
	 * NOTE: The Autowired class should also be @Component. So that the IOC
	 * can create the object of it and inject it here. 
	 * Autowiring & @Qualifier
	 * ✅ What is Autowiring?
	 * Spring automatically finds and injects the required bean using @Autowired.
	 * There are two ways of dependency injection :-
	 * 1. Using Constructor
	 * 2. Using Setter/Getter
	 */
	@Autowired
	public Employee(Address add) {
		System.out.println("Employee constructor called");
		this.add = add;
	}

	public void gun() {
		System.out.println("gun method called");
	}
}
