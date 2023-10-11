package com.aop.aopconcept.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    //We don't have any argument to pass in the makePayment method
   @Before("execution(* com.aop.aopconcept.services.PaymentServiceImpl.makePayment())")
    public void printBefore(){
        System.out.println("Payment Started...");
    }

    //We have argument to pass in the makePayment method
    @After("execution(* com.aop.aopconcept.services.PaymentServiceImpl.clearPayment(..))")
    public void printAfter(){
        System.out.println("Payment Done...");
    }
}
