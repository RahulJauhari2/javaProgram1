
public class DemoDee {
    public static void main(String[] args) {
        Employee e1=new Employee("ABC", 9000,1);
        e1.Employeeinfo();
        Employee e2=new Employee();
        e2.Employeeinfo();
    
    }
    
}

class Employee{
    private static int empldCounter=0;
    String name;
    private  int salary;
    private int empid;

    Employee(String name,int salary,int empid){

        this.name=name;
        this.salary=salary;
        this.empid=empid;
    }

        public Employee() {
        }
        
    
    public void Employeeinfo(){
        System.out.println("Employee Name:"+this.name);
        System.out.println("Employee Salary:"+this.salary);
        System.out.println(empid);
        }
     
        
    }