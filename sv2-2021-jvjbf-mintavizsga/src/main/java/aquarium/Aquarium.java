package aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private List<Fish> fishes= new ArrayList<>();
    public static final int CAPACITY = 20;

    public void addFish(Fish fish){
        if(CAPACITY-((fishes.size()+1)*5)>-1){
            this.fishes.add(fish);
        }
        else{
            throw new IllegalStateException("Can not add fish because there is no more space.");
        }
    }
    public void feed(){
        for (Fish f:fishes) {
            f.feed();
        }
    }
    public void removeFish(int maxWeight){
        List<Fish> fishesToRemove= new ArrayList<>();
        for (Fish f:fishes) {
            if(f.weight>maxWeight){
                fishesToRemove.add(f);
            }
        }
        fishes.removeAll(fishesToRemove);
    }

    public List<String> getStatus(){
        List<String> result= new ArrayList<>();
        for (Fish f:fishes) {
            result.add(f.getStatus());
        }
        return result;
    }
    public int getNumberOfFishWithMemoryLoss(){
        int counter=0;
        for (Fish f:fishes) {
            if(f instanceof Tang){
                counter++;
            }
        }
        return counter;
    }
    public boolean isThereFishWithGivenColor(String color){
        for (Fish f:fishes) {
            if(color.equals(f.color)){
                return true;
            }
        }
        return false;
    }
    public Fish getSmallestFish(){
        int minWheight=Integer.MAX_VALUE;
        Fish minWheightFish=null;
        for (int i = 0; i < fishes.size()||minWheightFish==null; i++) {
            if(fishes.get(i).weight<minWheight){
                minWheight=fishes.get(i).weight;
                minWheightFish=fishes.get(i);
            }
        }
        return minWheightFish;
    }
}
