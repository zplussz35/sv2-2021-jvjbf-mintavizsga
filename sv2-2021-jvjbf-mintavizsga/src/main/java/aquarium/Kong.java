package aquarium;

public class Kong extends Fish{
    private final boolean memoryLoss;
    public Kong(String name, int weight, String color) {
        super(name, weight, color);
        this.memoryLoss=false;
    }

    @Override
    public String getStatus() {
        return name + ", weight: "+weight+", color: "+color+", short-term memory loss: "+memoryLoss;
    }

    @Override
    public void feed() {
        weight+=2;
    }


}
