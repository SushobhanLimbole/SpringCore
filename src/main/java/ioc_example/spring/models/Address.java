package ioc_example.spring.models;

import org.springframework.stereotype.Component;

@Component
public class Address {

	public Address() {
		System.out.println("Address object created");
	}
	
	public void fun() {
		System.out.println("fun method called");
	}
}
