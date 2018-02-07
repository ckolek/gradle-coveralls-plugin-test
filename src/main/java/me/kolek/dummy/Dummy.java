package me.kolek.dummy;

public class Dummy {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue(boolean reverse) {
        return reverse ? reverse(value) : value;
    }

    private static String reverse(String s) {
        char[] c = new char[s.length()];
        for (int i = 0; i < c.length; i++) {
            c[i] = s.charAt(c.length - (i + 1));
        }
        return new String(c);
    }
}
