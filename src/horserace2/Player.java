package horserace2;

import java.util.Scanner;

/**
 * Created by kiverak on 23.05.2015.
 */
public class Player {
    int setAnimal(){
        System.out.println("Выберите животное (1 - 5)");
        Scanner scanner = new Scanner(System.in);
        String s;
        s = scanner.nextLine();
        int set = Integer.parseInt(s) - 1;
        System.out.printf("Вы поставили на животное с номером:%s\n", s);
        return set;
    }
}
