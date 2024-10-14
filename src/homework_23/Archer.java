package homework_23;

public class Archer extends GameCharacter{

    @Override
    void attack() {
        {
            System.out.printf("Лучник атакует: -%d xp", getDamage());
            printHealth();
        }
    }
}
