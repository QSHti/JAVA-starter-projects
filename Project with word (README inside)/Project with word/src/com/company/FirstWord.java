package com.company;

public class FirstWord {
    public static void main(String[] args) throws Exception
        {
            String words = "John makes his first steps";
            System.out.println(firstWord(words));
        }
        public static String firstWord(String input) {

            for(int i = 0; i < input.length(); i++)
            {
                if(input.charAt(i) == ' ')
                {
                    return input.substring(0, i);
                }
            }

            return input;
        }
}
