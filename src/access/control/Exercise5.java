package access.control;

class MyClass{
    public String public_field = "public_string";
    private String private_field = "private_string";
    protected String protected_field = "protected_string";
    String package_field = "package_field";
    public void public_method(){
        System.out.println("This is a public method");
    }
    private void private_method(){
        System.out.println("This is a private method");
    }
    protected void protected_method(){
        System.out.println("This is a protected method");
    }
    void package_method(){
        System.out.println("This is a package method");
    }
}

public class Exercise5 {

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println(obj.public_field);
        //System.out.println(obj.private_field); private field is not visible
        System.out.println(obj.protected_field);
        System.out.println(obj.package_field);
        obj.public_method();
        //obj.private_method(); private method is not visible
        obj.protected_method();
        obj.package_method();
    }
}
