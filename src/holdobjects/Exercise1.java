package holdobjects;
import java.util.*;

class Gerbil{
    int gerbilNumber;
    Gerbil(int i){
        gerbilNumber = i;
    }
    void hop(){
        System.out.println("Gerbil number " + gerbilNumber + " is hopping");
    }
}
public class Exercise1 {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
        gerbils.add(new Gerbil(1));
        gerbils.add(new Gerbil(2));
        gerbils.add(new Gerbil(3));
        for (int i=0; i < gerbils.size(); i++){
            gerbils.get(i).hop();
        }
        //for(Gerbil g : gerbils)
        //    g.hop();
    }
}
