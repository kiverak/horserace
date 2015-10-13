package horserace2;

import java.util.Random;

/**
 * Created by kiverak on 23.05.2015.
 */
public class Hippodrome {
    final int AMOUNT_OF_ANIMALS = 5;
    final int RACE_DISTANCE = 1000;
    int winner;

    //В начале игры создаются автоматически животные, и для них автоматически генерируются характеристики
    Animal[] animals = new Animal[AMOUNT_OF_ANIMALS];
    Random random = new Random();

    int randomAge(){
        return random.nextInt(10) + 1;
    }

    String randomName(){
        int i = random.nextInt(Animal.getNames().length);
        return Animal.getNames()[i];
    }

    String randomType(){
        int i = random.nextInt(Animal.getTypes().length);
        return Animal.getTypes()[i];
    }

    boolean randomIsTrue(){
        int oneOrNull = random.nextInt(2);
        if (oneOrNull == 1) return true;
        return false;
    }

    int randomMaxSpeed(){
        return 20 - random.nextInt(5);              //доделать
    }

    void init(){
        for (int i = 0; i < AMOUNT_OF_ANIMALS; i++) {
            animals[i].setAge(randomAge());             //todo не понимаю, почему тут выдает ошибку
            animals[i].setName(randomName());
            animals[i].setType(randomType());
            animals[i].setHasHorns(randomIsTrue());
            animals[i].setDistance(0);
            animals[i].setMaxSpeed(randomMaxSpeed());
            System.out.println("Животное №" + (i + 1) + " макс.скорость " + animals[i].getMaxSpeed());
        }
    }

    void show(){
        System.out.println("В гонке участвует животных: " + AMOUNT_OF_ANIMALS);
    }

    void race(){
        for (int i = 0; i < AMOUNT_OF_ANIMALS; i++) {
            int randomVar = random.nextInt(animals[i].getMaxSpeed());
            animals[i].setVar(randomVar);
            int amountDistance = animals[i].getDistance() + animals[i].getVar();
            animals[i].setDistance(amountDistance);
            System.out.println("Животное №" + (i + 1) + ": дистанция " + animals[i].getDistance());
        }
    }

    boolean gameOver () {
        for (int i = 0; i < AMOUNT_OF_ANIMALS; i++) {
            if (animals[i].getDistance() >= RACE_DISTANCE) {
                winner = i;
                return true;
            }
        }
        return false;
    }
}