package mixed;
import reusing.classes.*;

class InheritedClass extends Exercise15{
    void printHere(){
        print();
    }
}

public class ReusingClassesExercise15 {
    public static void main(String[] args) {
        Exercise15 obj = new Exercise15();
        //obj.print(); print is protected method

        InheritedClass obj2 = new InheritedClass();
        obj2.printHere();
        }
    }
