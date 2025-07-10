package interfaces;

import java.util.ArrayList;
import java.util.List;

interface Processor {
    String name();
    Object process(Object input);
}

class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
}

class SwapCharacters {
    String process(String text) {
        List<String> strings = new ArrayList<>();
        int index = 0;
        while (index < text.length()) {
            int minimum = Math.min(index + 2, text.length());
            String text_substring = text.substring(index, minimum);
            if (text_substring.length() == 2)
                text_substring = text_substring.charAt(1) + text_substring.substring(0, 1);
            strings.add(text_substring);
            index += 2;
        }
        return String.join("", strings);
    }
}

class SwapCharactersAdapter implements Processor {
    SwapCharacters swap_characters;

    public SwapCharactersAdapter(SwapCharacters swap_characters) {
        this.swap_characters = swap_characters;
    }

    public String name() {
        return getClass().getSimpleName();
    }

    public String process(Object input) {
        return swap_characters.process((String)input);
    }
}

public class Exercise11 {
    public static void main(String[] args) {
        SwapCharacters string = new SwapCharacters();
        String s1 = string.process("look");
        System.out.println("Before adapter " + s1);
        String s2 = string.process("there");
        System.out.println("Before adapter " + s2);

        Apply.process(new SwapCharactersAdapter(new SwapCharacters()), "look");
        Apply.process(new SwapCharactersAdapter(new SwapCharacters()), "there");
    }
}
