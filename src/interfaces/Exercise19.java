package interfaces;

interface ObjectToThrow{
    void get_value();
}

interface ObjectToThrowFactory{
    ObjectToThrow toss();
}

class Coin implements ObjectToThrow{
    public void get_value(){
        String result = Math.random() < 0.5 ? "Heads" : "Tails";
        System.out.println("Coin toss result: " + result);
    }
}

class CoinFactory implements ObjectToThrowFactory{
    public ObjectToThrow toss(){
        return new Coin();}
}

class Dice implements ObjectToThrow{
    public void get_value(){
        int min = 0;
        int max = 6;
        int rangeRandom = min + (int)(Math.random() * ((max - min) + 1));
        System.out.println("Dice toss result: " + rangeRandom);
    }
}

class DiceFactory implements ObjectToThrowFactory{
    public ObjectToThrow toss(){
        return new Dice();
    }
}


public class Exercise19 {
    static void play(ObjectToThrowFactory fact){
        ObjectToThrow o = fact.toss();
        o.get_value();
    }

    public static void main(String[] args) {
        play(new CoinFactory());
        play(new DiceFactory());
    }
}
