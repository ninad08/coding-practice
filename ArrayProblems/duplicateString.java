//Find the duplicate values of an array of string values

package ArrayProblems;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class duplicateString {

    public static void main(String[] args) {
        String[] arr = {"ninad","hello", "vishal", "ninad", "hello", "world"};

        Set<String> hs = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if(hs.contains(arr[i])){
                System.out.println("duplicate elemenet : " + arr[i]);
            }else {
                hs.add(arr[i]);
            }

        }
    }
}
