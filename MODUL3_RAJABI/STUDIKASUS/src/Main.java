public class Main {
    public static void main(String[] args) {
      Calculation calc = new Calculation();
      Scanner scanner = new Scanner(System.in);
      boolean repeat = true;
      do {
        try {
          System.out.println("==Menu Program");
          System.out.println("1. Square");
          System.out.println("2. Circle");
          System.out.println("3. Trapezoid");
          System.out.print("Select menu : ");
          int choice = scanner.nextInt();
          switch (choice) {
            case 1:
              System.out.print("Enter side value: ");
              double side = scanner.nextDouble();
              calc.setSquare(side);
              System.out.println("Square area: " + calc.getSquare());
              break;
            case 2:
              System.out.print("Enter radius value: ");
              double radius = scanner.nextDouble();
              calc.setCircle(radius);
              System.out.println("Circle area: " + calc.getCircle());
              break;
            case 3:
              System.out.print("Enter upper side value: ");}}}