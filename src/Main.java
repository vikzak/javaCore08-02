import fizio.Track;
import fizio.Wall;
import player.Cat;
import player.Human;
import player.Robot;

public class Main {
    /*
    * 1) Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь бегать и
    * прыгать (методы просто выводят информацию о действии в консоль).
    * 2) Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять
    * соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль (успешно пробежал,
    * не смог пробежать и т.д.).
    * 3) Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
    * 4*) У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
    * Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.*/
    public static void main(String[] args) {
        Human[] human = new Human[3];
        human[0] = new Human("Илья",900,1.30);
        human[1] = new Human("Петя",1400,1.50);
        human[2] = new Human("Ваня",150,0.60);

        Robot[] robot = new  Robot[3];
        robot[0] = new Robot("Вертер",5000,2.20);
        robot[1] = new Robot("Терминатор Т900",7000,3.10);
        robot[2] = new Robot("Билли",3000,1.80);

        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Муфаса", 1250,3);
        cat[1] = new Cat("Зевс", 1200,3.01);
        cat[2] = new Cat("Вася", 900,2.1);

        Wall[] wall = new Wall[3];
        wall[0] = new Wall("забор",1.1);
        wall[1] = new Wall("оградка",0.3);
        wall[2] = new Wall("стена",3.1);

        Track[] track = new Track[3];
        track[0] = new Track("Парк",500);
        track[1] = new Track("Стадион",1500);
        track[2] = new Track("Школа",300);
        boolean result = true;
        // Преодолевают трассу люди
        for (int i = 0; i < human.length; i++){
            result = track[i].moving(human[i]);
            if (!result) {
                System.out.println("Полностью трассу пройти не удалось\n");
                continue;
            } else {
                result = wall[i].moving(human[i]);
                if (!result) {
                    System.out.println("Полностью трассу пройти не удалось\n");
                    continue;
                } else System.out.println("Трасса полностью пройдена\n");
            }
        }
        // Преодолевают трассу роботы
        for (int i = 0; i < robot.length; i++){
            result = track[i].moving(robot[i]);
            if (!result) {
                System.out.println("Полностью трассу пройти не удалось\n");
                continue;
            } else {
                result = wall[i].moving(robot[i]);
                if (!result) {
                    System.out.println("Полностью трассу пройти не удалось\n");
                    continue;
                } else System.out.println("Трасса полностью пройдена\n");
            }
        }
        // Преодолевают трассу коты
        for (int i = 0; i < cat.length; i++){
            result = track[i].moving(cat[i]);
            if (!result) {
                System.out.println("Полностью трассу пройти не удалось\n");
                continue;
            } else {
                result = wall[i].moving(cat[i]);
                if (!result) {
                    System.out.println("Полностью трассу пройти не удалось\n");
                    continue;
                } else System.out.println("Трасса полностью пройдена\n");
            }
        }
    }
}
