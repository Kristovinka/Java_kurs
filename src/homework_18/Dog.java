package homework_18;
    /*Написать класс Собака (Dog).

    Каждая Собака обязательно должна иметь имя и высоту прыжка

    Должна уметь прыгать и должна уметь тренироваться.

    За каждую тренировку высота прыжка увеличивается максимум на 10 сантиметров

    Максимальная высота прыжка, которую может натренировать собака,
    не может быть больше, чем двукратная высота первоначального прыжка.

    Также должен быть метод взять jumpBarrier. В параметрах метод принимает высоту барьера.
    Если собака в состоянии преодолеть этот барьер - прыгает. Если не в состоянии,
    нужно проверить помогут ли тренировки (будет ли данная собака в принципе в состоянии взять
     барьер). Если да -> идем тренироваться -> берет барьер
    */

public class Dog {
    private String name;
    private int heightJump ;

    //Тут могло быть 2 задание, но уже поздно и хочется спать (
    // onli jumpBarrier
    public void jump() {

    }

    public void training() {

        this.heightJump = heightJump + 10;
    }

    public void jumpBarrier(int heightBarrier) {

        if (this.heightJump*2 >= heightBarrier){
            while (this.heightJump < heightBarrier){
                training();
            }
            System.out.println(" i can");
            }
        else
            System.out.println(" i can't");
    }


}