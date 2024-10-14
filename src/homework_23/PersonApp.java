package homework_23;

import lesson_22.animals.Animal;

public class PersonApp {
    public static void main(String[] args) {
        Paladin paladin = new Paladin();
        paladin.attack();
        paladin.upgrade();
        paladin.printinfo();

        Archer archer = new Archer();
        Warrior warrior = new Warrior();
        Mage mage = new Mage();

        GameCharacter[] gameCharacters = new GameCharacter[4];
        gameCharacters[0] = archer;
        gameCharacters[1] = mage;
        gameCharacters[2] = paladin;
        gameCharacters[3] = warrior;

        for (int i = 0; i < gameCharacters.length; i++) {
            CharacterTest(gameCharacters[i]);
        }

    }
    public static  void  CharacterTest(GameCharacter character) {
        character.attack();

    }
}
