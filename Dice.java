package JAVA24;

import java.util.*;
public class Dice {
    public static void main(String[] args) {
        Random generator = new Random();
        int value = generator.nextInt();
        System.out.println("Random number is: " + value);
    }
}
