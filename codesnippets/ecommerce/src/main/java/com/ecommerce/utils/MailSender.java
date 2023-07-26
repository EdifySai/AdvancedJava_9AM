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

	public String sendTextEmail() throws IOException {
		System.out.println("Inside mail sender");
		// the sender email should be the same as we used to Create a Single Sender Verification
		    Email from = new Email("saikumar@digital-edify.com");
		    String subject = "The subject";
		    Email to = new Email("saikumar@digital-edify.com");
		    Content content = new Content("text/html", "<html><body><h1>This is a test email</h1> <a href='https://www.digital-lync.com'>Click here</a></body></html>");
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
		      return response.getBody();	     
		    } catch (IOException ex) {
		      throw ex;
		    }	   
	}
	
}
