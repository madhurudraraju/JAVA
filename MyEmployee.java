abstract class Employee{
  String name;
  int id;
  String designation;
  String department;
  double experience;
  private double salary; //Decalaration of salary variable as private as a form of Encapsulation 
  private String address; //Decalaration of address variable as private as a form of Encapsulation
   
    public double getSalary(){  //Public getter to access encapsulated variable 'salary'
    return salary;
  }
     public String getAddress(){   //Public getter to access encapsulated variable 'address'
     return address;
  }
    
  public Employee(String name,int empid,String empdsgn,String empdept,double empexp,double tempsalary,String tempaddress){    //Parameterized constructor of superclass 'Employee'
    this.name=name;
    this.id=empid;
    this.designation=empdsgn;
    this.department=empdept;
    this.experience=empexp;
    this.salary=tempsalary;
    this.address=tempaddress;
    }
  
  public void printEmpDetails(){
    System.out.println("Employee Details are as follows:\n Name: " +name+";\n ID: " + id+";\n Designation: "+designation+";\n Department: "+department+";\n Experience: "+experience);
  }
  
  }

  public class MyEmployee extends Employee{      // Subclass 'MyEmployee' inherits the properties of superclass 'Employee'
      public MyEmployee(String name,int empid,String empdsgn,String empdept,double empexp,double tempsalary,String tempaddress){  //Parameterized constructor of subclass 'MyEmployee'
      super(name,empid,empdsgn,empdept,empexp,tempsalary,tempaddress);     //invoking super class parameterized constructor from subclass
     }
        
       public static void main(String[]args){
      MyEmployee emp1=new MyEmployee("Madhu",9563,"Jr.Manager","Electrical",3.5,900000,"RJY");  //instantiating the abstract class 'Employee' using subclass 'MyEmployee' 
      emp1.printEmpDetails(); 
      System.out.println(" Salary: "+emp1.getSalary());    //displaying superclass encapsulated/private variable in subclass using public getter
      System.out.println(" Address: "+emp1.getAddress());  //displaying superclass encapsulated/private variable in subclass using public getter
      }}