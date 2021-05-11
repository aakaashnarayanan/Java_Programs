import java.util.Scanner;
//import java.lang.Math;

class Employee {

  // initializing variables

  String eName;
  int eNo;
  double basicPay, pf, DA, HRA, NetPay, GS, pf_e, DA_e, HRA_e, GS_e;

  // --- default constructor -- getting user value instead of assigning 0

  Employee() {
    Scanner emp = new Scanner(System.in);

    System.out.println();
    System.out.println("--- enter the values -----");

    System.out.println("Enter the name of the Employee");
    eName = emp.nextLine();

    System.out.println("enter the " + eName + "'s ID");
    eNo = emp.nextInt();

    System.out.println("Enter the Basic pay for " + eName + ": ");
    basicPay = emp.nextDouble();

    System.out.println("Enter the Percentage of PF");
    pf = emp.nextDouble();

    System.out.println("Enter the percentage of DA");
    DA = emp.nextDouble();

    System.out.println("enter the percentage of HRA");
    HRA = emp.nextDouble();

    emp.close();
    System.out.println();
  }

  // -- parameterized constructor --

  Employee(String eName, int eNo, double basicPay, double pf, double DA, double HRA) {

    this.eName = eName;
    this.eNo = eNo;
    this.basicPay = basicPay;
    this.pf = pf;
    this.DA = DA;
    this.HRA = HRA;
  }

  // -- copy constructor --

  Employee(Employee c) {

    eName = c.eName;
    eNo = c.eNo;
    basicPay = c.basicPay;
    pf = c.pf;
    DA = c.DA;
    HRA = c.HRA;
  }

  // -- calculate net pay function with void has return type
  // used to calculate net pay as well as gross pay

  void calculateNetPay() {

    HRA_e = (HRA / 100) * basicPay;
    DA_e = (DA / 100) * basicPay;
    GS_e = basicPay + DA + HRA;
    pf_e = (pf / 100) * basicPay;
    // NetPay = (int) Math.round(GS - pf);
    NetPay = GS_e - pf;

    displayEmployee(); // calling th display function.
  }

  // display employee function which void has return
  // used to display the details

  void displayEmployee() {

    System.out.println();
    System.out.println("----- calculating the NetPay for the Employee -------");
    System.out.println();
    System.out.println("The Employee name: " + eName);
    System.out.println(eName + " Id: " + eNo);
    System.out.println("Basic Pay for the " + eName + " is: " + basicPay);
    System.out.println("the Gross pay for th employee" + eName + "is Rupees: " + GS_e);
    System.out.println("the Net Pay for the employee " + eName + "is Rupees: " + NetPay);
    System.out.println();
  }

}

public class EmpDemo {
  public static void main(String args[]) {

    System.out.print("\033[H\033[2J"); // this is escape statement used to clear the cmd, like performing cls

    System.out.println("-- using parameterized constructor --");

    Employee e1 = new Employee("Aakaash N", 001, 10000, 2, 10, 8);
    e1.calculateNetPay();
    // e1.displayEmployee(); calling the display function from the calculateNetPay()

    System.out.println("-- using copy constructor --");

    Employee e2 = new Employee(e1);
    e2.calculateNetPay();

    System.out.println("-- using default constructor -- ");

    Employee e3 = new Employee();
    e3.calculateNetPay();

  }
}
