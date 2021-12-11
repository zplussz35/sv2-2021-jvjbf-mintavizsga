
package owlcounter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class OwlCounter {
    private List<String> owlCountsByRegions = new ArrayList<>();

    public void readFromFile(Path path){
        List<String> result;
        try{
            result = Files.readAllLines(path);
            this.owlCountsByRegions.addAll(result);
        }
        catch (IOException ioe){
            throw new IllegalStateException("Can not read file.",ioe);
        }
    }




    public int getNumberOfOwls(String region){
        String[] data;
        boolean contains=false;
        for (String s:owlCountsByRegions) {
            data=s.split("=");
            if(data[0].equals(region)){
                contains=true;
            }
        }
        if(!contains){
            throw new IllegalArgumentException("No such county in Hungary!");
        }

        for (String s:owlCountsByRegions) {
             data= s.split("=");
            if(data[0].equals(region)){
                return Integer.parseInt(data[1]);
            }
        }
        return 0;
    }
    public int getNumberOfAllOwls(){
        int result=0;
        String[] data;
        for (String s:owlCountsByRegions) {
            data = s.split("=");
            result+=Integer.parseInt(data[1]);
        }
        return result;
    }
}
