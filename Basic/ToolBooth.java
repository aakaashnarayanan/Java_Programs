import java.util.Scanner;

class Tool {
  int carTotal;
  double cashTotal;

  Tool() {
    carTotal = 0;
    cashTotal = 0;
  }

  void payingCar() {
    carTotal += 1;
    cashTotal += 0.5;
  }

  void nonPayCar() {
    carTotal += 1;
  }

  void display() {
    System.out.println("the total number of car passed is: " + carTotal);
    System.out.println("cash collected is: " + cashTotal);
  }
}

public class ToolBooth {
  public static void main(String args[]) {
    Tool t = new Tool();
    int option = 0;
    int end;

    //Scanner s = new Scanner(System.in);

   /* while (end == 1) {
      System.out.print("Enter your choice");
      option = s.nextInt();

      switch (option) {
      case (option == 1):
        t.payingCar();
        break;
      case (option == 2):
        t.nonPayCar();
        break;
      case (option == 3):
        end = 1;
      }
      s.close();
    }*/
    t.display();
  }
}
