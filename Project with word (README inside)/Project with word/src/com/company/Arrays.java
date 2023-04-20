package com.company;

public class Arrays {
    public static void main(String[] args) {

        String cities[] = {"Johannesburg", "Milan", "Tallin", "Nur-Sultan"};
        int index = 0;
        int elementLength = cities[0].length();
        for(int i=1; i< (cities.length); i++) {
            if(cities[i].length() > elementLength) {
                index = i; elementLength = cities[i].length();
            }
        }
        System.out.println(cities[index]);
    }
}
