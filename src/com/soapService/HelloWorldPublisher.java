package com.soapService;
import javax.xml.ws.Endpoint;

//Endpoint publisher
public class HelloWorldPublisher{
	
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:9099/ws/hello", new HelloWorldImpl());
    }

}