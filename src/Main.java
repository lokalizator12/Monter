public class Main {
    public static void main(String[] args) {


        Monster monster1 = new Monster();
        Monster monster2 = new Monster(3);
        Monster monster3 = new Monster(5, 5);
        Monster monster4 = new Monster(10, 10, 10);

        monster1.whichMonster();
        monster2.whichMonster();
        monster3.whichMonster();
        monster4.whichMonster();
    }
}
