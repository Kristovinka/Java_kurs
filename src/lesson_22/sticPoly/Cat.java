package lesson_22.sticPoly;

public class Cat extends Animal{

    public void eat(){
        System.out.println("Cat eat");
    }
    @Override
    public void voice(){
        System.out.println("Cat say MEOW!!!");
    }

    @Override
    public String toString() {
        return "Cat toString";
    }
    //peregruska metoda
    public void voice(String str){
        System.out.println("Cat say" + str);
    }
}
