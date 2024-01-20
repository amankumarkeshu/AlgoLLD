package Splitwise;

import java.util.HashMap;
import java.util.Map;

public class UserExpenseBalanceSheet {

    Map<String, Balance> userVsBalance;

    double totalYourExpense;
    double totalYouOwe;
    double totalPayment;


    double totalYouGetBack;

    public UserExpenseBalanceSheet() {
        this.userVsBalance = new HashMap<>();
        this.totalYourExpense = 0;
        this.totalYouOwe = 0;
        this.totalYouGetBack = 0;
    }

    public Map<String, Balance> getUserVsBalance() {
        return userVsBalance;
    }

    public void setUserVsBalance(Map<String, Balance> userVsBalance) {
        this.userVsBalance = userVsBalance;
    }

    public double getTotalYourExpense() {
        return totalYourExpense;
    }

    public void setTotalYourExpense(double totalYourExpense) {
        this.totalYourExpense = totalYourExpense;
    }

    public double getTotalYouOwe() {
        return totalYouOwe;
    }

    public void setTotalYouOwe(double totalYouOwe) {
        this.totalYouOwe = totalYouOwe;
    }

    public double getTotalYouGetBack() {
        return totalYouGetBack;
    }

    public void setTotalYouGetBack(double totalYouGetBack) {
        this.totalYouGetBack = totalYouGetBack;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

}
