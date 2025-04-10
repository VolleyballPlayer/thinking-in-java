package objects;

enum Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, VIOLET
}

class AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors;
    void changeTheHueOfTheColor(int newHue) {
        Color[] colors = Color.values();
        System.out.println("Changing color to: " + colors[newHue]);
    }
}

public class Exercise11 {
    public static void main (String[] args) {
        Color[] colors = Color.values();
        AllTheColorsOfTheRainbow obj = new AllTheColorsOfTheRainbow();
        for (Color color : colors) {
            obj.changeTheHueOfTheColor(color.ordinal());
        }
    }
}

//The hue might be the shade number of certain color, in which case this solution would look different