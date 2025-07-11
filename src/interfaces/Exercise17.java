package interfaces;

interface Season {
    String SUMMER="summer";
    String WINTER="winter";
    String AUTUMN="autumn";
    String SPRING="spring";
}

class SeasonGetter implements Season{
    String summer = Season.SUMMER;
    String winter = Season.WINTER;
    String autumn = Season.AUTUMN;
    String spring = Season.SPRING;
}
public class Exercise17{
    public static void main(String[] args) {
        SeasonGetter s = new SeasonGetter();
        System.out.println(s.summer);
        //System.out.println(s.SUMMER);
        //s.SUMMER = "winter";
        System.out.println(Season.WINTER); //access directly from interface
        //Season.WINTER = "summer";
    }
}
