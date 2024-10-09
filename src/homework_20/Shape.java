package homework_20;

public class Shape {
    private String name ;
    private String color;

    public Shape(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Name shape: " + name);
        System.out.println("color " + name + ": " + color);
    }

    public void setColor(String color){
        this.color = color;
    }
}
