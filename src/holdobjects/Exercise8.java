package holdobjects;

import java.util.ArrayList;
import java.util.Iterator;

class Gerbil8{
    int gerbilNumber;
    Gerbil8(int i){
        gerbilNumber = i;
    }

    void hop(){
        System.out.println("Gerbil number " + gerbilNumber + " is hopping");
    }
}
public class Exercise8 {
    public static void main(String[] args) {
        ArrayList<Gerbil8> gerbils = new ArrayList<Gerbil8>();
        gerbils.add(new Gerbil8(1));
        gerbils.add(new Gerbil8(2));
        gerbils.add(new Gerbil8(3));
        Iterator<Gerbil8> it = gerbils.iterator();
        while (it.hasNext())
            it.next().hop();
    }
}
