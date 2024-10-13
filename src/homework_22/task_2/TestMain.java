package homework_22.task_2;

public class TestMain {
    public static void main(String[] args) {

    Vehicle vehicle1 = new Car();
    Vehicle vehicle2 = new Bicycle();
    Vehicle vehicle3 = new Motorcycle();

    Vehicle[] vehicles = new Vehicle[3];
    vehicles[0] = vehicle1;
    vehicles[1] = vehicle2;
    vehicles[2] = vehicle3;

    for(int i = 0; i < vehicles.length; i ++){
        vehicles[i].startEngine();
     }
    }
 }