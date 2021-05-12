package com.kafka.kafkaProducer.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.kafkaProducer.model.Producer;
import com.kafka.kafkaProducer.model.StreamBody;

@RestController
public class StreamController {
	public static final String TOPIC = "marketorders-events";
	public Producer producerThread;
	public StreamController() {
		boolean isAsync = false;
        this.producerThread = new Producer(TOPIC, isAsync);
        this.producerThread.start();
	}
	@PostMapping("/stream")
	public void postStream(@RequestBody StreamBody stream) {
		this.producerThread.setMessage(stream);
		this.producerThread.run();
		System.out.println(stream.symbol);
	}
}

