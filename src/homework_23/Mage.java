package homework_23;

public class Mage extends GameCharacter{

    @Override
    void attack() {

            System.out.printf("маг использует магические заклинания: -%d xp", getDamage());
            printHealth();

    }
}
