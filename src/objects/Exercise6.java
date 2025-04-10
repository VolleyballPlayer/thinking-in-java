package objects;

public class Exercise6 {

    public static void main (String[] args){
        class StringStorage{
            int storage(String s) {
                return s.length() * 2;
            }
        }

        StringStorage stringStorage = new StringStorage();
        int result = stringStorage.storage("A");
        System.out.println(result);

        int result2 = stringStorage.storage("ABC");
        System.out.println(result2);

    }
}
