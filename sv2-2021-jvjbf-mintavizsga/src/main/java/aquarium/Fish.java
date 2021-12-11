package aquarium;

public abstract class Fish {
    protected String name;
    protected int weight;
    protected String color;


    protected Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }


    public abstract String getStatus();
    public abstract void feed();

}
