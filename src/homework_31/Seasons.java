package homework_31;

public enum Seasons {
    WINTER(1.5),
    SPRING(7.5),
    SUMMER(23),
    AUTUMN(19.5);

    private double temperature;

    Seasons(double temperature) {
        this.temperature = temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

}
