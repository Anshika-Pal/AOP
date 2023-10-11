package com.aop.aopconcept;

import com.aop.aopconcept.services.PaymentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class AopconceptApplication {

	@Autowired
	PaymentService paymentService;

	public static void main(String[] args) {
		SpringApplication.run(AopconceptApplication.class, args);

	}

	@PostConstruct
	public void call()
	{
		paymentService.makePayment();
		paymentService.clearPayment(200);
    }
}
