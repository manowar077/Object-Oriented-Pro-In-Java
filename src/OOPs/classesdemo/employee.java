package OOPs.classesdemo;

public class employee {

    // Instance variables
    String name;
    String dept;
    String dob;

    // Constructor
    public employee(String emp_name, String emp_dept, String emp_dob) {
        this.name = emp_name;
        this.dept = emp_dept;
        this.dob = emp_dob;
    }

    // Method
    public void get_emp_details() {

        String email = name.toLowerCase() + "@company.com";

        System.out.println("Employee Name: " + name);
        System.out.println("Employee Email: " + email);
    }
}