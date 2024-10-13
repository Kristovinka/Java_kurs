package homework_22.task_1;

public class MainHuman {
    public static void main(String[] args) {

    Pro_athlete pro = new Pro_athlete();
    Human human1 = pro;
    Human human2 = new Amateur();
    Human human3 = new Human();

    Human[] humans = new Human[3];
    humans[0] = human3;
    humans[1] = human2;
    humans[2] = human1;

        for (int i = 0; i < humans.length; i++) {
            humans[i].run();
        }
    }
}
