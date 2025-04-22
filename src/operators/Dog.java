package operators;


public class Dog {
    String name;
    String says;
    void setName(String n){
        name=n;
    }
    void setSays(String s){
        says=s;
    }
    void showDogName(){
        System.out.println(name);
    }
    void speak(){
        System.out.println(says);
    }
}
