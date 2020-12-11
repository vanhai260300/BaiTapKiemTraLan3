package com.example.thecoffeehouse;

public class EmployeeDataUtils {

    public static Employee[] getEmployees() {
        Employee emp1 = new Employee("Đà Nẵng");
        Employee emp2 = new Employee("Quảng Trị");
        Employee emp3 = new Employee("Hồ Chí Minh");
        Employee emp4 = new Employee("Huế");
        return new Employee[]{emp1, emp2, emp3,emp4};
    }
}

