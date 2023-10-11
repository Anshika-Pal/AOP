package com.aop.aopconcept.services;

import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService{
    @Override
    public void makePayment() {
        System.out.println("Amount Debited..");
        //
        //
        System.out.println("Amount Credited");
    }

    @Override
    public void clearPayment(int a) {
        System.out.println(a+"Amount Debited..");
        //
        //
        System.out.println(a+"Amount Credited");
    }
}
