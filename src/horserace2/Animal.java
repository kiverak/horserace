package horserace2;

/**
 * Created by kiverak on 29.05.2015.
 */
public class Animal {
    private String name;
    private int age;
    private String type;
    private boolean hasHorns;
    private int maxSpeed;
    private int distance = 0;
    private int var;        //random дистанция, пробегаемая животным за условную единицу времени time

    //todo ошибку выдаёт на инструкцию add
//    private ArrayList<String> animalNames = new ArrayList<>();
//    animalNames.add("Стрелка", "Звёздочка", "Буцефал", "Сирена", "Лана");
    //todo почему тут обязательно static? Иначе ошибка в Hippodrome.randomName();
    private static String[] names = {"Стрелка", "Звёздочка", "Буцефал", "Сирена", "Лана"};
    private static String[] types = {"Лошадь", "Антилопа", "Олень", "Бизон"};

    public Animal(String name, int age, String type, boolean isHorns, int maxSpeed, int distance, int var) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.hasHorns = isHorns;
        this.maxSpeed = maxSpeed;
        this.distance = distance;
        this.var = var;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getVar() {
        return var;
    }

    public void setVar(int var) {
        this.var = var;
    }

    public boolean getHasHorns() {
        return hasHorns;
    }

    public void setHasHorns(boolean isHorns) {
        this.hasHorns = isHorns;
    }

    public static String[] getNames() {
        return names;
    }

    public static String[] getTypes() {
        return types;
    }
}
