package com.example.paymentservice.service;


import com.example.paymentservice.entity.Payment;
import com.example.paymentservice.repository.PaymentRepostory;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

  @Autowired
  private PaymentRepostory repostory;

  public Payment doPayment(Payment payment)
  {
    payment.setTransactionId(UUID.randomUUID().toString());
     return repostory.save(payment);
  }


}
