import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;

public class str {
    public static void main(String[] args) {
        String a = "Hello";
        StringBuilder sb = new StringBuilder(a);
        /* String builder
        *  append (add last)
        *  insert (index, item)
        *  delete (startIndex,endIndex)
        *  string.length
        *  indexOf - return index || -1
        *  lastIndexOf
        *  contains
        *  substring (start, end)
        *  replace
        *  replaceFirst
        *  trim
        *  compareTo
        *  compareToIgnoreCase
        *  concat
        *  reverse
        *  split
        *  toLowerCase
        *  toUpperCase
        *  toCharArray
        * */
        System.out.println(sb.toString().toUpperCase());
        System.out.println(sb);
        sb.append("Hello");

    }
}
