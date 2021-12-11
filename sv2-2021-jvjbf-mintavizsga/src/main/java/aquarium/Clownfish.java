package aquarium;

public class Clownfish extends Fish{
    private final boolean memoryLoss;

    public Clownfish(String name, int weight, String color) {
        super(name, weight, color);
        this.memoryLoss=false;

    }

    @Override
    public String getStatus() {
        return name + ", weight: "+weight+", color: "+color+", short-term memory loss: "+memoryLoss;
    }

    @Override
    public void feed() {
        weight+=1;
    }
}
