import java.util.Scanner;

class FooCorporation {
  public static void salary(double base_pay, double hours){
    int MINIMUM_WAGE = 8;
    int MAXIMUM_HOURS = 60;
    if (base_pay < MINIMUM_WAGE) {
      System.out.println("Error: Base pay must be at least $" + MINIMUM_WAGE + " per hour.");
      return;
    }
    if (hours > MAXIMUM_HOURS) {
      System.out.println("Error: Hours worked must not exceed " + MAXIMUM_HOURS + " hours.");
      return;
    }
    if (hours <= 40){
      System.out.println(base_pay * hours);
    }else{
      double overtime = hours - 40;
      System.out.println(base_pay * (40 + 1.5 * overtime));
    }
  }
  public static void main(String[] arguments){
    Scanner scanner = new Scanner(System.in);
    salary(7.5,35);
    salary(8.2,47);
    salary(10,73);
    scanner.close();
  }
}

