package access.control;

class ProtectedData{
    protected String s = "first_string";
}

public class Exercise6 {
    static void manipulate(ProtectedData obj){
        System.out.println(obj.s + " and " + "second_string");
    }

    public static void main(String[] args) {
        ProtectedData firstString = new ProtectedData();
        System.out.println(firstString.s);
        Exercise6.manipulate(firstString);
    }

}
