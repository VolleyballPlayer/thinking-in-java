package reusing.classes;

class AA{
    AA(String name){
        System.out.println("I am class " + name);
    }
}

class BB{
    BB(String name){
        System.out.println("I am class " + name);
    }
}

class CC extends AA{
    CC(){
        super("AA");
        BB bMember = new BB("BB");
    }
}

public class Exercise7 {
    public static void main(String[] args) {
        CC obj = new CC();
    }
}
