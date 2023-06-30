import utils.ManagerFunction;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        do {
            ManagerFunction.printMenu();
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    ManagerFunction.inputInf();
                    break;
                case 2:
                    ManagerFunction.showInf();
                    break;
                case 3:
                    ManagerFunction.salaryTeacher();
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        } while (true);
    }
}
