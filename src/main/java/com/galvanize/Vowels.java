package com.galvanize;

public class Vowels {

    public  int getCount(String str) {
        int vowelsCount = 0;
        // your code here
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                    case 'u':
                    vowelsCount++;
                    break;
            }

        }

        return vowelsCount;


    }
    public static void main(String[] args) {
        Vowels name = new Vowels();

        int count = name.getCount("Bruce Black");
        System.out.println(count);

    }
}


