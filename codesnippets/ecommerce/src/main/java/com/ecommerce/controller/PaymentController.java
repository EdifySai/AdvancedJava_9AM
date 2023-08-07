package com.ecommerce.controller;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;

@RestController
public class PaymentController {

	@CrossOrigin
	@GetMapping("/payment/createOrderId/{amount}")
	@ResponseBody
	public String createPaymentOrderId(@PathVariable String amount) {
	    String orderId=null;
	    try {
	        RazorpayClient razorpay = new RazorpayClient("","");
	        JSONObject orderRequest = new JSONObject();
	        orderRequest.put("amount", amount); // amount in the smallest currency unit
	        orderRequest.put("currency", "INR");
	        orderRequest.put("receipt", "order_rcptid_11");

	        Order order = razorpay.orders.create(orderRequest);
	        orderId = order.get("id");
	    } catch (RazorpayException e) {
	        // Handle Exception
	        System.out.println(e.getMessage());
	    }
	    return orderId;
	}
	
	
}
