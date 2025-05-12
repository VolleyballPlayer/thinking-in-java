package initialization.and.cleanup;

class StringExample {
    StringExample(String s){
        System.out.println(s);
    }
}

public class Exercise17and18 {
    public static void main(String[] args){
        StringExample[] arr = new StringExample[5];
        for (int i = 0; i < arr.length; i++){
            arr[i] = new StringExample(Integer.toString(i));
        }
    }
}
