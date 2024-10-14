package homework_23;

public class Warrior extends GameCharacter{

    @Override
    void attack() {
        System.out.printf("воин атакует мечом: -%d xp", getDamage());
        printHealth();
    }
}
