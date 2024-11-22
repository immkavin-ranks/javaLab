package javaLab;

class Employee {
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + employeeId + ", Name: " + name);
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, int employeeId, String department) {
        super(name, employeeId);
        this.department = department;
    }

    public void manageDepartment() {
        System.out.println("Managing department: " + department);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Manager projectManager = new Manager("John Doe", 1001, "IT");
        projectManager.displayInfo();  // Inherited method
        projectManager.manageDepartment();  // Manager's specific method
    }
}

