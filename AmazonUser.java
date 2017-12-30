abstract class User{
  String name;
  String emailid;
  String mobileno;
  String gender;
  String billingaddress;
  String shippingaddress;
  private String loginid; //Decalaration of loginid variable as private as a form of Encapsulation 
  private String password; //Decalaration of password variable as private as a form of Encapsulation
   
    public String getLoginid(){  //Public getter to access encapsulated variable 'loginid'
    return loginid;
  }
     public String getPassword(){   //Public getter to access encapsulated variable 'password'
     return "Its called 'password' for a reason";
  }
    
  public User(String name,String email,String mobile,String gender,String billingadd,String shippingadd,String loginid, String password){    //Parameterized constructor of superclass 'Employee'
    this.name=name;
    this.emailid=email;
    this.mobileno=mobile;
    this.gender=gender;
    this.billingaddress=billingadd;
    this.shippingaddress=shippingadd;
    this.loginid=loginid;
    this.password=password;
    }
  
  public void printUserDetails(){
    System.out.println("User Details are as follows:\n Name: " +name+";\n Email: " + emailid+";\n Mobile no: "+mobileno+";\n Gender: "+gender+";\n Billing Address: "+billingaddress+"\n Shipping Address: "+shippingaddress);
  }
  
  }

  public class AmazonUser extends User{      // Subclass 'AmazonUser' inherits the properties of superclass 'User'
      public AmazonUser(String name,String email,String mobile,String gender,String billingadd,String shippingadd,String loginid, String password){  //Parameterized constructor of subclass 'AmazonUser'
      super(name,email,mobile,gender,billingadd,shippingadd,loginid,password);     //invoking super class parameterized constructor from subclass
     }
        
       public static void main(String[]args){
      AmazonUser user1=new AmazonUser("Madhu","rmadhu.837@gmail.com","8114367666","Female","Odisha","RJY","MadhuR","madhu13");  //instantiating the abstract class 'User' using subclass 'AmazonUser' 
      user1.printUserDetails(); 
      System.out.println(" UserID: "+user1.getLoginid());    //displaying superclass encapsulated/private variable in subclass using public getter
      System.out.println(" Password: "+user1.getPassword());  //displaying superclass encapsulated/private variable in subclass using public getter
      }}