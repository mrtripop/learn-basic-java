package challenges.javaAnnotation;

import challenges.javaAnnotation.services.EmployeeService;

public class JavaAnnotationTest {

    /*
     * Problem from Hackerrank:
     * https://www.hackerrank.com/challenges/java-annotations/problem
     */

    private EmployeeService employeeService = new EmployeeService();

    public JavaAnnotationTest() {
        System.out.println("======= Java Annotation Test =======");
    }

    public void testJavaAnnotation_seniorBudgetLowerThan100() {
        // arrange
        String userRole = "SENIOR";
        int spend = 99;
        // action
        boolean isOkay = (Boolean) employeeService.validateEmployeeBudget(userRole, spend);
        boolean expect = true;
        assert expect == isOkay;
        System.out.printf("Result: %b, expect: %b, actual: %b%n", expect == isOkay, expect, isOkay);
    }

    public void testJavaAnnotation_seniorBudgetHigherThan100() {
        // arrange
        String userRole = "SENIOR";
        int spend = 101;
        // action
        boolean isOkay = (Boolean) employeeService.validateEmployeeBudget(userRole, spend);
        boolean expect = false;
        assert expect == isOkay;
        System.out.printf("Result: %b, expect: %b, actual: %b%n", expect == isOkay, expect, isOkay);
    }

    public void testJavaAnnotation_seniorBudgetEqualTo100() {
        // arrange
        String userRole = "SENIOR";
        int spend = 100;
        // action
        boolean isOkay = (Boolean) employeeService.validateEmployeeBudget(userRole, spend);
        boolean expect = true;
        assert expect == isOkay;
        System.out.printf("Result: %b, expect: %b, actual: %b%n", expect == isOkay, expect, isOkay);
    }

    public void testJavaAnnotation_juniorBudgetLowerThan50() {
        // arrange
        String userRole = "JUNIOR";
        int spend = 49;
        // action
        boolean isOkay = (Boolean) employeeService.validateEmployeeBudget(userRole, spend);
        boolean expect = true;
        assert expect == isOkay;
        System.out.printf("Result: %b, expect: %b, actual: %b%n", expect == isOkay, expect, isOkay);
    }

    public void testJavaAnnotation_juniorBudgetHigherThan50() {
        // arrange
        String userRole = "JUNIOR";
        int spend = 51;
        // action
        boolean isOkay = (Boolean) employeeService.validateEmployeeBudget(userRole, spend);
        boolean expect = false;
        assert expect == isOkay;
        System.out.printf("Result: %b, expect: %b, actual: %b%n", expect == isOkay, expect, isOkay);
    }

    public void testJavaAnnotation_juniorBudgetEqualTo50() {
        // arrange
        String userRole = "JUNIOR";
        int spend = 50;
        // action
        boolean isOkay = (Boolean) employeeService.validateEmployeeBudget(userRole, spend);
        boolean expect = true;
        assert expect == isOkay;
        System.out.printf("Result: %b, expect: %b, actual: %b%n", expect == isOkay, expect, isOkay);
    }

}
