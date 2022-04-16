package com.cs.jdk17.changes;

import com.cs.jdk17.model.PaymentState;
import com.cs.jdk17.model.Payment;

import java.math.BigDecimal;

import static com.cs.jdk17.utils.PrettyPrinter.*;

public class PatternMatchingForInstanceOf {

    public static void patternMatchingPaymentTest(Object o) {
        if (!(o instanceof Payment paymentRecord)) {
            throw new RuntimeException("The object was not a Payment class");
        }
        System.out.println(paymentRecord);
    }

    public static void printAllPatternMatchingForInstanceOf(){
        prettyPrintTitle("Pattern matching for InstanceOf");

        prettyPrintSection("Positive test");
        patternMatchingPaymentTest(new Payment(PaymentState.CREATED, BigDecimal.valueOf(10)));

        try{
            prettyPrintSection("Negative test");
            patternMatchingPaymentTest("Not a Payment class");
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
    }

}
