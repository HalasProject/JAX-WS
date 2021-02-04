package dawspack.services;

import javax.xml.ws.Endpoint;

public class dawsWebServicePublisher {

	public static void main(String[] args) throws ClassNotFoundException {
		Endpoint.publish("http://localhost:8080/ws/daws", new dawsServiceImpl());
    }

}
