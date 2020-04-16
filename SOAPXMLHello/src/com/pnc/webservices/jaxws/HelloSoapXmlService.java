package com.pnc.webservices.jaxws;

public class HelloSoapXmlService {

	public String sayHello(String name){
		return "Welcome "+name+"to SOAP based XML demo example...";
	}
	
	public int sum(int num1, int num2){
		return num1+num2;
	}
}
