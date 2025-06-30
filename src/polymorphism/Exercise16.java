package polymorphism;

class AlertStatus {
    public void alert() {}
}

class NormalAlert extends AlertStatus {
    public void alert() {
        System.out.println("Status: Normal"); }
}

class HighAlert extends AlertStatus {
    public void alert() {
        System.out.println("Status: High"); }
}

class LowAlert extends AlertStatus {
    public void alert() {
        System.out.println("Status: Low"); }
}

class Starship {
    private AlertStatus alertStatus = new NormalAlert();
    public void normalAlert() { alertStatus = new NormalAlert(); }
    public void highAlert() { alertStatus = new HighAlert(); }
    public void lowAlert() { alertStatus = new LowAlert(); }
    public void getAlertStatus() { alertStatus.alert(); }
}

public class Exercise16 {
    public static void main(String[] args) {
        Starship s = new Starship();
        s.getAlertStatus();
        s.highAlert();
        s.getAlertStatus();
        s.lowAlert();
        s.getAlertStatus();
        s.normalAlert();
        s.getAlertStatus();
    }
}
