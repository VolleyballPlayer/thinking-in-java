package holdobjects;

import java.util.*;

class Gerbil17{
    int gerbilNumber;
    Gerbil17(int i){
        gerbilNumber = i;
    }
    void hop(){
        System.out.println("Gerbil number " + gerbilNumber + " is hopping");
    }
}
public class Exercise17 {
    public static void main(String[] args) {
        Map<String, Gerbil17> gerbils = new HashMap<String, Gerbil17>();
        gerbils.put("Fuzzy", new Gerbil17(1));
        gerbils.put("Spot", new Gerbil17(2));
        gerbils.put("Bu", new Gerbil17(3));

        Iterator<String> it = gerbils.keySet().iterator();
        while(it.hasNext()) {
            String s = it.next();
            System.out.print(s + ": ");
            gerbils.get(s).hop();
        }
    }
}
