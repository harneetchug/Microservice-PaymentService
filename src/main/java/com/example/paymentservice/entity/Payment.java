package com.example.paymentservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="Payment_TB")
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

  @Id
  @GeneratedValue
  private int paymentId;
  private String paymentStatus;
  private String transactionId;
  private double amount;
  private int orderId;



}