package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        /*
        How to combine multiple boolean expressions?
        Use logical operators.
         */
        // logical operators represent real world rules

        // && -> AND operator; only if both conditions are true
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30; // Java evaluates this expression from left to right
        System.out.println(isWarm);

        boolean isEligible;
        // || -> OR operator; if at least one condition is true
        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        isEligible = hasHighIncome || hasGoodCredit;
        System.out.println(isEligible);

        // ! -> NOT operator; reverses a value
        boolean hasCriminalRecord = false;
        isEligible = hasHighIncome || hasGoodCredit && !hasCriminalRecord;
        System.out.println(isEligible);
    }
}