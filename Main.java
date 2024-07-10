package Project;
import java.util.Scanner;
public class Main{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ExpenseManager expenseManager = new ExpenseManager();
    int choice;

    do {
        System.out.println("<<<<<<<<<< Expense Tracker >>>>>>>>>>");
        System.out.println("1. Add Expense");
        System.out.println("2. View Expenses");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter expense category: ");
                String category = scanner.next();
                System.out.print("Enter expense amount: ");
                double amount = scanner.nextDouble();
                expenseManager.addExpense(category, amount);
                break;
            case 2:
                expenseManager.viewExpenses();
                break;
            case 3:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
        }
    } while (choice != 3);

    scanner.close();
}
}