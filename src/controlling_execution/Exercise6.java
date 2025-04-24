package controlling_execution;

public class Exercise6 {
    static int test(int testval, int begin, int end) {
        if(end < begin) {
            System.out.println("End < begin !! ");
            return 0;
        }
        if((testval >= begin) && (testval <= end))
            return +1;
        if((testval < begin) || (testval > end))
            return -1;
        return 100;
    }
    public static void main(String[] args) {
        System.out.println(test(10, 5, 11));
        System.out.println(test(5, 6, 3));
        System.out.println(test(5, 5, 5));
    }
}
