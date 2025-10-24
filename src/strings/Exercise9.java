package strings;

public class Exercise9 {
    public static String knights = "Then, when you have found the shrubbery, you must " +
            "cut down the mightiest tree in the forest... " +
            "with... a herring!";
    public static void replace(String regex, String replacement){
        System.out.println(knights.replaceAll(regex, replacement));
    }
    public static void main(String[] args) {
        replace("[aeiou]", "_");
    }
}