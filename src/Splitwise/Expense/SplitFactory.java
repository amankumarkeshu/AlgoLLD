package Splitwise.Expense;

import Splitwise.Expense.Split.EqualExpenseSplit;
import Splitwise.Expense.Split.ExpenseSplit;
import Splitwise.Expense.Split.PercentageExpenseSplit;
import Splitwise.Expense.Split.UnequalExpenseSplit;

public class SplitFactory {

    public static ExpenseSplit getSplitObject(ExpenseSplitType splitType) {
        switch (splitType) {
            case EQUAL -> {
                return new EqualExpenseSplit();
            }
            case UNEQUAL -> {
                return new UnequalExpenseSplit();
            }
            case PERCENTAGE -> {
                return new PercentageExpenseSplit();
            }
            default -> {
                return null;
            }
        }
    }
}
