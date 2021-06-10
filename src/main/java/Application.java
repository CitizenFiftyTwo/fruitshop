import domain.CashRegister;
import domain.FruitDictionary;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        CashRegister cashRegister = new CashRegister();

        while (true) {
            String input = in.nextLine();

            cashRegister.addInBasket(FruitDictionary.valueOf(input).getFruitType().name());

            System.out.println("Price : " + cashRegister.getTotal());
        }
    }

}
