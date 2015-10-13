/**
 * Created by kiverak on 23.05.2015.
 */
public class Main {
    public static void main(String[] args) {
        Hippodrome hippodrome = new Hippodrome();
        Player player = new Player();
        int timer = 0;
        int set;
        int place = 1;

        System.out.println("Начало игры!");

        hippodrome.init();
        hippodrome.show();
        set = player.setHorse();

        do {
            hippodrome.race();
            timer++;
        } while (!hippodrome.gameOver());

        for (int i = 0; i < hippodrome.HORSECOUNT; i++) {
            if (hippodrome.horses[set].distance < hippodrome.horses[i].distance)
                place++;
        }

        System.out.println("Победила лошадь с номером " + (hippodrome.winner + 1) + " со временем " + timer + " c");
        if (set == hippodrome.winner)
            System.out.println("Поздравляем! Ваша лошадь пришла первой!");
        else System.out.println("Вы проиграли! Ваша лошадь пришла под номером " + place);

        System.out.println("Конец игры!");
    }
}
