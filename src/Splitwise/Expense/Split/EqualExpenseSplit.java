package Splitwise.Expense.Split;

import java.util.List;

public class EqualExpenseSplit implements ExpenseSplit{
    @Override
    public void validateSplitRequest(List<Split> splitList, double amount) {

        double checkAmount = 0;
        for(Split split: splitList) {
            checkAmount+=split.getAmountOwe();
        }
        if (checkAmount == amount) {
            System.out.println("This is a correct expense");
        } else {
            System.out.println("This is an incorrect expense");
        }
    }
}
