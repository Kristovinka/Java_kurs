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
    static int heightJumpStart ;

    //Тут могло быть 2 задание,  onli jumpBarrier +
    public void jump() {
        heightJumpStart = heightJump;
    }

    public void training() {

        if (heightJump < heightJumpStart * 2 )

            this.heightJump = heightJump + 10;
        else System.out.println(" i can't ");
    }

    public void jumpBarrier(int heightBarrier) {

        if (heightJumpStart * 2 >= heightBarrier){

            while (this.heightJump < heightBarrier){

                training();
            }
            System.out.println(" i can");
            }
        else
            System.out.println(" i can't");
    }


}
