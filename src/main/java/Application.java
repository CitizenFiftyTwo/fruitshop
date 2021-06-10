import domain.CashRegister;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        CashRegister cashRegister = new CashRegister();

        System.out.println("Your input :" + input);

        in.close();
    }

}
