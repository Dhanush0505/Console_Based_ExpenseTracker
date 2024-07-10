package Project;

import java.util.Scanner;

public class ExpenseManager {
    private static final int MAX_EXPENSES = 100;
    private Expense[] expenses;
    private int expenseCount;

    public ExpenseManager() {
        expenses = new Expense[MAX_EXPENSES];
        expenseCount = 0;
    }

    public void addExpense(String category, double amount) {
        if (expenseCount < MAX_EXPENSES) {
            expenses[expenseCount] = new Expense(category, amount);
            expenseCount++;
            System.out.println("Expense added successfully!");
        } else {
            System.out.println("Expense tracker is full. Cannot add more expenses.");
        }
    }

    public void viewExpenses() {
        if (expenseCount == 0) {
            System.out.println("No expenses recorded yet.");
        } else {
            System.out.println("\n<<< Expense List >>>");
            //System.out.println("Category\tAmount");
            for (int i = 0; i < expenseCount; i++) {
                System.out.println("Category: "+expenses[i].getCategory());
                System.out.println("Amount: " + expenses[i].getAmount());
            }
            System.out.println("Total Expenses: ₹" + calculateTotalExpenses());
        }
    }

    private double calculateTotalExpenses() {
        double total = 0;
        for (int i = 0; i < expenseCount; i++) {
            total += expenses[i].getAmount();
        }
        return total;
    }
}