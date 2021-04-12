package Java_Programs;

import java.lang.reflect.Field;

public class AutoBot_StringTranslator_Java {

    /*
    * String Language Translator
    * Auto Bots
    * naveen Automation labs YT
     */

    static {
        try {
            Field value = String.class.getDeclaredField("value");
            value.setAccessible(true);
            value.set("Hello Namit", value.get("Hola namit"));
            value.set("Good Morning Namit", value.get("Buenos dias namit"));
            value.set("How are you?", value.get("?Como estas?"));

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("Good Morning Namit");
    }
}
