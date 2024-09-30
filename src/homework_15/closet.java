package homework_15;

public class closet {

    String color;
    double height;
    double width;
    double depth;

    public closet (String color, double height, double width){
        this.color = color;
        this.height = height;
        this.width = width;
    }

    public void getDepth(){
        System.out.println("Я заполняюсь!");
    }

    public void mobility(){
        System.out.println("Я еду!");
    }

}
