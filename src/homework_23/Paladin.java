package homework_23;

public class Paladin extends GameCharacter{

    @Override
    void attack() {

            System.out.printf("паладин атакует светом: -%d xp", getDamage());
            printHealth();

    }
}
