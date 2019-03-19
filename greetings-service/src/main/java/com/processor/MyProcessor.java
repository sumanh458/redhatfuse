package com.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;



public class MyProcessor  implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println("in processor");
		final String name=exchange.getIn().getHeader("name",String.class);
		
		exchange.getIn().setBody("Hi testing");
		
	}
}
