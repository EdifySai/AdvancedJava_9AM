package com.ecommerce.utils;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.sendgrid.Content;
import com.sendgrid.Email;
import com.sendgrid.Mail;
import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
public class MailSender {

	public int sendRegistrationConfirmation(String toEmail) throws IOException {
		System.out.println("Inside mail sender");
		// the sender email should be the same as we used to Create a Single Sender Verification
		    Email from = new Email("saikumar@digital-edify.com");
		    String subject = "Registration Successful! Happy Shopping";
		    Email to = new Email(toEmail);
		    Content content = new Content("text/html", "<html><body><h1>Thanks for registering with us. We hope you will have a wonderful experience You can start from here</h1> <a href='https://www.flipkart.com'>Login</a></body></html>");
		    Mail mail = new Mail(from, subject, to, content);
		
		    SendGrid sg = new SendGrid("");
		    Request request = new Request();
		    try {
		      request.setMethod(Method.POST);
		      request.setEndpoint("mail/send");
		      request.setBody(mail.build());
		      Response response = sg.api(request);
		      System.out.println("response" + response.getStatusCode());
		      System.out.println("response.getBody()"+ response.getBody());
		      return response.getStatusCode();	     
		    } catch (IOException ex) {
		      throw ex;
		    }	   
	}
	
}
