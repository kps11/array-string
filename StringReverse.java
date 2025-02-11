package java_pratice.array_string;
//https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringReverse {
    public static void main(String[] args) {
        String s = "    The sky is  blue   ";
        String [] array_string = s.split(" ");
        ArrayList <String> al = new ArrayList<>();
        for (int i = 0; i < array_string.length; i++) {
            if (array_string[i] !="") {

                al.add(array_string[i]);
            }
        }
        String result = String.join(" ", al.reversed());



        System.out.print(result);
    }
}
