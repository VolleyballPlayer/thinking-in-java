package controlling.execution;

public class Exercise8 {
    public static void main (String[] args){
        for (int i = 0; i < 5; i++){
            switch(i){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4: System.out.println(i); break;
                default: System.out.println(5);
            }
        }
    }
}
