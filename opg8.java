package ch11;

/* Write a method minLength that accepts a set of strings as a parameter and that returns the length of the shortest string in the list.
If your method is passed an empty set, it should return 0. */

import java.util.HashSet;
import java.util.Set;

public class opg8
{
    public static void main(String[] args)
    {
        Set<String> set1 = new HashSet<>();

        set1.add("ble");
        set1.add("kartofler");
        set1.add("kontorstol");
        set1.add("vindue");
        set1.add("popcorn");
        set1.add("bo");

        System.out.println(minLength(set1));
    }

    public static int minLength (Set<String> setOfStrings)
    {
        if (setOfStrings.isEmpty())
        {
            return 0;
        }

        int shortest = 100;

        for (String str : setOfStrings)
        {
            if (str.length() < shortest)
            {
                shortest = str.length();
            }
        }
        return shortest;
    }
}
