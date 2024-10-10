package homework_21;

public class Computer {

    private Processor processor;
    private Memory memory;
    private Storage storage;

    public Computer(Storage storage1) {
        this.storage = storage1;
        this.memory = new Memory("SDRAM");
        this.processor = new Processor("i3-323847Y");
    }

    public String toString() {

        return "Computer: {Processor: " + processor.getNumber() + ", memory: " + memory.getComp_RAM() +
                "; storage: " + storage.getNumber();

    }
}
