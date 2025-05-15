package access.control;

import access.control.exercise4.MyStatic;

public class Exercise4 extends MyStatic {

    protected String print() {
        return "Hello World";
    }

    public void dummy() {
    }


    void blabla() {

    }
    protected void myProtectedChild() {
        super.myProtectedChild();
        //Do my own logic
        //CALL REST API or DB Operation
    }

    public static void main(String[] args) {
        MyStatic js = new MyStatic();

    }
}
