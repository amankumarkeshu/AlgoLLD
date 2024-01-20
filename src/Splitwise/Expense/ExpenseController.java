package Splitwise.Expense;

import Splitwise.BalanceSheetController;
import Splitwise.Expense.Split.ExpenseSplit;
import Splitwise.Expense.Split.Split;
import Splitwise.User.User;

import java.util.List;

public class ExpenseController {


    BalanceSheetController balanceSheetController;
    public ExpenseController() {
        balanceSheetController = new BalanceSheetController();
    }

    public Expense createExpense(String expenseId, User paidByUser, double amount, String description,
                                 List<Split> splitDetails, ExpenseSplitType splitType) {


        ExpenseSplit expenseSplit = SplitFactory.getSplitObject(splitType);
        expenseSplit.validateSplitRequest(splitDetails, amount);

        Expense expense = new Expense(expenseId, amount, description, paidByUser, splitType, splitDetails);
        balanceSheetController.updateUserExpenseBalanceSheet(paidByUser, splitDetails, amount);
        return expense;

    }
}
