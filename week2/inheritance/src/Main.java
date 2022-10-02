public class Main {
    public static void main (String[] args){
    Customer customer=new Customer();
    Employee employee=new Employee();
CustomerManager customerManager=new CustomerManager();
EmployeeMenager employeeMenager=new EmployeeMenager();
customerManager.Add();
customerManager.List();
employeeMenager.Add();
employeeMenager.List();
employeeMenager.BestEmployee();
    }
}
