package com.cs.jdk17.model;

import java.math.BigDecimal;

public record Payment(PaymentState paymentState, BigDecimal amount) {

    public Payment {
        // The assignment of the parameters to the record fields occur at the end of the constructor
        System.out.println("Parameter paymentState=" + paymentState + ", Field paymentState=" + this.paymentState());
        System.out.println("Parameter amount=" + amount + ", Field amount=" + this.amount());
        if (paymentState == null) {
            throw new IllegalArgumentException("PaymentState should not be null");
        }
    }

    public BigDecimal applyTaxes() {
        return amount.multiply(BigDecimal.valueOf(1.21));
    }

    public String toString() {
        return String.format("Payment in state %s with amount %s", paymentState, amount);
    }

}
