package com.cs.jdk17.changes;

import com.cs.jdk17.model.PaymentState;
import com.cs.jdk17.utils.PrettyPrinter;
import com.cs.jdk17.model.Payment;

import java.math.BigDecimal;

public class Records {

    public static void printAllRecords() {
        PrettyPrinter.prettyPrintTitle("Records");

        PrettyPrinter.prettyPrintSection("Payment record");
        var paymentRecord = new Payment(PaymentState.PENDING, BigDecimal.valueOf(30));
            System.out.println("Payment state -> " + paymentRecord.paymentState());
            System.out.println("Payment amount -> " + paymentRecord.amount());
            System.out.println(paymentRecord);
            System.out.println("Apply taxes -> " + paymentRecord.applyTaxes());

        PrettyPrinter.prettyPrintSection("Payment record with tax");
        var paymentRecordWithTax = new Payment(paymentRecord.paymentState(), paymentRecord.applyTaxes());
            System.out.println(paymentRecordWithTax);

        //var paymentRecordWithError = new Records(null, BigDecimal.valueOf(100));
    }

}
