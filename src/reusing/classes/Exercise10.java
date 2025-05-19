package reusing.classes;

class ModifiedComponent1{
    ModifiedComponent1(int i){
        System.out.println("I am Component1. Instance: " + i);
    }
}

class ModifiedComponent2{
    ModifiedComponent2(int i){
        System.out.println("I am Component2. Instance: " + i);
    }
}

class ModifiedComponent3{
    ModifiedComponent3(int i){
        System.out.println("I am Component3. Instance: " + i);
    }
}

class ModifiedRoot{
    ModifiedComponent1 component1Root;
    ModifiedComponent2 component2Root;
    ModifiedComponent3 component3Root;
    ModifiedRoot(int i){
        System.out.println("I am Root. Instance: " + i);
        component1Root = new ModifiedComponent1(i);
        component2Root = new ModifiedComponent2(i);
        component3Root = new ModifiedComponent3(i);
    }
}

class ModifiedStem extends ModifiedRoot{
    ModifiedComponent1 component1Stem;
    ModifiedComponent2 component2Stem;
    ModifiedComponent3 component3Stem;
    ModifiedStem(int i){
        super(i);
        System.out.println("I am Stem. Instance: " + i);
        component1Stem = new ModifiedComponent1(i);
        component2Stem = new ModifiedComponent2(i);
        component3Stem = new ModifiedComponent3(i);
    }
}

public class Exercise10 {
    public static void main(String[] args) {
        ModifiedStem obj = new ModifiedStem(1);
    }
}

