package homework_23;

abstract  class GameCharacter {
    private int damage = 15;
    private int health = 200;
//    Создайте абстрактный класс GameCharacter, который представляет базовый класс для игровых персонажей.
//    Определите абстрактный метод attack(), который будет различаться для разных типов персонажей
//    (например, воин атакует мечом, а маг использует магические заклинания).
//    Создайте несколько конкретных подклассов, представляющих разные типы персонажей,
//    такие как Warrior, Mage, Archer, и т. д.
//    Переопределите метод attack() для каждого класса.
//    Создайте массив из игровых персонажей разных типов. Вызовите у каждого метод attack() в цикле.

    abstract void attack();

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public void printHealth() {
        System.out.printf("\nего здоровье: %d xp\n", getHealth());
    }

    public void upgrade(){
        this.damage = damage + 5;
        this.health = health + 15;

    }
    public void printinfo() {
        System.out.println("\nCharacter info, Damage: -" + damage + " Health: " + health);
    }
}
