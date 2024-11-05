package homework_38;

public class Sportsman implements Comparable<Sportsman> {
    private String name;
    private int age ;
    private String score ;

    public Sportsman(String name, int age, String score) {
        this.score = score;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "\nSportsman{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score='" + score + '\'' +
                '}';
    }

    @Override
    public int compareTo(Sportsman o) {
        return this.age - o.age;
    }

//    @Override    string
//    public int compareTo(Sportsman sportsman) {
//        return this.getName().compareTo(sportsman.getName());
//    }
}
