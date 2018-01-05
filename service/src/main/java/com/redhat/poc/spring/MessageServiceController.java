package com.redhat.poc.spring;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redhat.poc.model.Factory;
import com.redhat.poc.model.Mxpo;
import com.redhat.poc.model.Response;


/**
 *  http://localhost:8080/transaction/ping
 * 
 * @author kylin
 *
 */
@RestController
public class MessageServiceController {
	
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/mxpo/ping")
    public Response greeting() {
        return new Response(counter.getAndIncrement(), "Success!");
    }
	
	@RequestMapping("/mxpo/sample")
    public Mxpo mxpo() {
        return Factory.mxpo();
    }



	
}
