package homework_15;

public class mainClass {

    public static void main(String[] args) {

        closet closet1 = new closet("read",33.7,26.5);

        closet1.mobility();
        closet1.getDepth();
        closet1.depth = 35;

        System.out.println("Color: "  + closet1.color);
        System.out.println("Height: "  + closet1.height);
        System.out.println("Width: "  + closet1.width);
        System.out.println("Depth: "  + closet1.depth);

        /////////////////////

        Husband husband = new Husband("Lesha", "engineer", 22);
        System.out.println("-----------------------------");

        System.out.println("Name husband: "  + husband.name);
        System.out.println("profession: "  + husband.profession);
        husband.changeStatus(true);

        /////////////////////
        System.out.println("-----------------------------");

        Table table = new Table();
        table.color = "white";
        table.length = 445;
        table.height = 52.5;
        table.width = 63.7;
        System.out.println("Color table: "  + table.color);

        table.folds();
        table.fill();

    }
}
