package com.tdsserver.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestReceiverController {
	
    private static final Logger logger = LoggerFactory.getLogger(RequestReceiverController.class);

	
    @PostMapping("/request")
    public String handleRequest(@RequestBody String request) {
        // Log the request for now; later you will publish this to a Kafka topic
        logger.info("Received request: {}", request);
        return "Request processed";
    }

}
