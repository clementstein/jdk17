package com.cs.jdk17.changes;

import com.cs.jdk17.model.PaymentState;
import com.cs.jdk17.utils.PrettyPrinter;

import java.util.Set;

public class SwitchExpressions {

    private static void switchExpressions(PaymentState state) {
        String textFromSwitch = switch (state) {
            case CREATED, PENDING -> {
                System.out.printf("Payment state %s%n", state);
                yield state + " --> Hold on, money is coming";
            }
            case COMPLETED -> state + " --> You received the payment";
            case CANCELLED -> state + " --> Payment has been cancelled";
            case UNDEFINED -> state + " --> Undefined payment state";
        };
        System.out.println(textFromSwitch);
    }

    private static void switchExpressionsInSysOut(PaymentState state) {
        System.out.println(
                switch (state) {
                    case CREATED, PENDING -> state + " --> Hold on, money is coming";
                    case COMPLETED -> state + " --> You received the payment";
                    case CANCELLED -> state + " --> Payment has been cancelled";
                    default -> state + " --> Undefined payment state";
                });
    }

    private static void switchExpressionsWithYield(PaymentState state) {
        String textFromSwitch = switch (state) {
            case CREATED, PENDING:
                yield state + " --> Hold on, money is coming";
            case COMPLETED:
                yield state + " --> You received the payment";
            case CANCELLED:
                yield state + " --> Payment has been cancelled";
            default:
                yield state + " --> Undefined payment state";
        };
        System.out.println(textFromSwitch);
    }

    public static void printAllSwitchExpressions() {
        PrettyPrinter.prettyPrintTitle("Switch expressions");
        var states = Set.of(PaymentState.values());

        PrettyPrinter.prettyPrintSection("Basic Switch expressions");
        states.forEach(SwitchExpressions::switchExpressions);

        PrettyPrinter.prettyPrintSection("Switch expressions in SysOut");
        states.forEach(SwitchExpressions::switchExpressionsInSysOut);

        PrettyPrinter.prettyPrintSection("Switch expressions with yield");
        states.forEach(SwitchExpressions::switchExpressionsWithYield);

    }

}
