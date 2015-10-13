package horserace1;

import java.util.Scanner;

/**
 * Created by kiverak on 23.05.2015.
 */
public class Player {
    int setHorse(){
        System.out.println("Выберите лошадь (1 - 5)");
        Scanner scanner = new Scanner(System.in);
        String s;
        s = scanner.nextLine();
        int set = Integer.parseInt(s) - 1;
        System.out.printf("Вы ввели X:%s\n", s);
        return set;
    }
}
