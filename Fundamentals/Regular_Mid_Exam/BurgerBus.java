package Regular_Mid_Exam;

import java.util.Scanner;

public class BurgerBus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCity = Integer.parseInt(scanner.nextLine());

        int countCity = 0;
        double totalProfit = 0;
        for (int i = 1; i <= numberCity ; i++) {
            String nameCity = scanner.nextLine();
            double ownerIncome = Double.parseDouble(scanner.nextLine());
            double ownerExpenses = Double.parseDouble(scanner.nextLine());

            countCity++;

            if (countCity % 3 == 0 && countCity % 5 == 0){
                ownerIncome = ownerIncome - ownerIncome * 0.1;
            } else if (countCity % 3 == 0) {
                ownerExpenses = ownerExpenses + ownerExpenses * 0.5;
            } else if (countCity % 5 ==0) {
                ownerIncome = ownerIncome - ownerIncome * 0.1;
            }
            double profit = ownerIncome - ownerExpenses;
            totalProfit = totalProfit + profit;

            System.out.printf("In %s Burger Bus earned %.2f leva.%n",nameCity,profit);
        }
        System.out.printf("Burger Bus total profit: %.2f leva.%n",totalProfit);
    }
}
