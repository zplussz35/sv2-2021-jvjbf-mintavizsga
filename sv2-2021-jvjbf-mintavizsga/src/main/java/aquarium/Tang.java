package aquarium;

public class Tang extends Fish {
    private final boolean memoryLoss;
    public Tang(String name, int weight, String color) {
        super(name, weight, color);
        this.memoryLoss=true;
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
