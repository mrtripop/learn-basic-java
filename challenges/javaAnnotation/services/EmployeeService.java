package challenges.javaAnnotation.services;

import java.lang.reflect.Method;

import challenges.javaAnnotation.interfaces.EmployeeBudget;
import challenges.javaAnnotation.models.EmployeeDetails;

public class EmployeeService {

    public EmployeeService() {
    }

    public Object validateEmployeeBudget(String employeeRole, int spend) {
        try {
            Class annotatedClass = EmployeeDetails.class;
            Method[] methods = annotatedClass.getMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(EmployeeBudget.class)) {
                    EmployeeBudget employee = method.getAnnotation(EmployeeBudget.class);
                    String userRole = employee.userRole();
                    int budgetLimit = employee.budgetLimit();
                    if (userRole.equals(employeeRole)) {
                        boolean isOkay = (Boolean) method.invoke(new EmployeeDetails(), budgetLimit, spend);
                        if (isOkay) {
                            System.out.println("Spend is okay");
                        } else {
                            System.out.println("Budget Limit Over");
                        }
                        return isOkay;
                    }
                }
            }
            return "Class EmployeeDetails not have EmployeeBudget annotation";
        } catch (Exception e) {
            e.printStackTrace();
            return "Validate annotation error";
        }
    }
}
