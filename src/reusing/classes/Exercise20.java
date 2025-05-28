package reusing.classes;

class WithFinals {
    // Identical to "private" alone:
    void f() { System.out.println("WithFinals.f()"); }
    // Also automatically "final":
    void g() { System.out.println("WithFinals.g()"); }
}

class OverridingPrivate extends WithFinals {
    @Override void f() {
        System.out.println("OverridingPrivate.f()");
    }
    @Override void g() {
        System.out.println("OverridingPrivate.g()");
    }
}
class OverridingPrivate2 extends OverridingPrivate {
    @Override void f() {
        System.out.println("OverridingPrivate2.f()");
    }
    @Override void g() {
        System.out.println("OverridingPrivate2.g()");
    }
}
public class Exercise20 {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        OverridingPrivate op = op2;
        op.f();
        op.g();
        WithFinals wf = op2;
        wf.f();
        wf.g();
    }
}