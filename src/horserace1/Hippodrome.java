package horserace1;

import java.util.Random;

/**
 * Created by kiverak on 23.05.2015.
 */
public class Hippodrome {
    final int HORSECOUNT = 5;
    final int RACEDISTANCE = 100;
    int winner;
    //В начале игры создаются автоматически лошади, и для них автоматически генерируются характеристики
    Horse[] horses = new Horse[HORSECOUNT];
    Random random = new Random();


    void init(){
        for (int i = 0; i < HORSECOUNT; i++) {
            horses[i] = new Horse(0, 0, 0, 0);
            horses[i].distance = 0;
            horses[i].minSpeed = random.nextInt(4) + 8;
            horses[i].maxSpeed = random.nextInt(2) + 14;
            System.out.println("Лошадь " + (i + 1) + ": мин.скорость " + horses[i].minSpeed + " макс.скорость " + horses[i].maxSpeed);
        }
    }

    void show(){
        System.out.println("В гонке участвует лошадей: " + HORSECOUNT);
    }

    void race(){
        for (int i = 0; i < HORSECOUNT; i++) {
            horses[i].var  = random.nextInt(horses[i].maxSpeed - horses[i].minSpeed);
            horses[i].distance += horses[i].var;
            System.out.println("Лошадь " + (i + 1) + ": дистанция " + horses[i].distance);
        }
    }

    boolean gameOver () {
        boolean b = false;
        for (int i = 0; i < HORSECOUNT; i++) {
            if (horses[i].distance >= RACEDISTANCE) {
                b = true;
                winner = i;
            }
        }
        return b;
    }
}