package uniqueCharactersInName;
import java.util.HashSet;

import java.util.*;

public class UniqueCharInName {

    public void charCounter(String name) {
        int l = name.length();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < l-1 ; i++) {
            Character c = name.charAt(i);
            set.add(c);
        }
        System.out.println("The Unique Characters in your name are - ");
        System.out.println(set);
        System.out.println("No. of unique characters in your name - ");
        System.out.println(set.size());
    }

}


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name - ");
        String s = sc.next();
        UniqueCharInName ucin = new UniqueCharInName();
        ucin.charCounter(s);
    }

}