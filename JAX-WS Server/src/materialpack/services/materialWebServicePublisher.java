package materialpack.services;

import javax.xml.ws.Endpoint;

public class materialWebServicePublisher {

	public static void main(String[] args) throws ClassNotFoundException {
		Endpoint.publish("http://localhost:8080/ws/daws", new materialServiceImpl());
    }

}
