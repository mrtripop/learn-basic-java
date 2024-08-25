package challenges.javaAnnotation.models;

import challenges.javaAnnotation.interfaces.EmployeeBudget;

public class EmployeeDetails {

    @EmployeeBudget(userRole = "SENIOR", budgetLimit = 100)
    public boolean seniorMember(int budget, int moneySpend) {
        System.out.println("Senior Member");
        System.out.println("Spend: " + moneySpend);
        System.out.println("Budget Left: " + (budget - moneySpend));
        return budget >= moneySpend;
    }

    @EmployeeBudget(userRole = "JUNIOR", budgetLimit = 50)
    public boolean juniorUser(int budget, int moneySpend) {
        System.out.println("Junior Member");
        System.out.println("Spend: " + moneySpend);
        System.out.println("Budget Left: " + (budget - moneySpend));
        return budget >= moneySpend;
    }
}
