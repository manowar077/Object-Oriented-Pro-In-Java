package OOPs.classesdemo;


class details{
    //instance variable
    String name;
    String dept;
    String dob;

    //constructor
    public details(String emp_name,String emp_dept,String emp_dob){
        this.name=emp_name;
        this.dept=emp_dept;
        this.dob=emp_dob;
    }
    //methods to get employee details
    public void get_emp_details(){
        String email=name.toLowerCase()+"@company.com";
        IO.println("employee name"+name);
        IO.println("Employee deatils"+email);
    }
}
