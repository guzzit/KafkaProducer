package com.kafka.kafkaProducer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties( ignoreUnknown = true )
public class StreamBody {
	@JsonProperty("bid_price")
	public double bid_price;//: 216.04079169240094
	
	@JsonProperty("order_quantity")
	public int order_quantity;//: 392
	
	@JsonProperty("symbol")
	public String symbol;//: "Google"
	
	@JsonProperty("timestamp")
	public int timestamp;//: 1614405183
	
	@JsonProperty("trade_type")
	public String trade_type;//: "market"
	
}
