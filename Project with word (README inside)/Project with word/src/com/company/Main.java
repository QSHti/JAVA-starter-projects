package com.company;

public class Main {
    static final int OUT = 0;
    static final int IN = 1;
    public static void main(String[] args) {
        String str = "Life is beautiful";
        int word_count = 0;
        int i = 0;
        int state = OUT;
        while (i < str.length())
        {
            if (str.charAt(i) == ' ' || str.charAt(i) == '\n' || str.charAt(i) == '\t') {
            state = OUT;

        }else if (state == OUT)
        {
            state = IN;
            ++word_count;
        }
            ++i;
        }
        System.out.println(word_count);
        System.out.println(str.length());
    }
}
