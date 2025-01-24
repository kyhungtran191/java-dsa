import java.util.ArrayList;
import java.util.HashMap;

public class collections {
    public static void main(String[] args) {
        /*
        * Array List
        * add(index, element)
        * size()
        * get(index) -- out of bound do nó k có
        * set(index, element)
        * remove(index)
        * remove(Integer.valueOf(value))
        * contains()
        * Collections.sort()
        * Collections.reverse()
        * List.isEmpty()
        * clear
        * indexOf
        * ------------------------------------
        * ----- Map
        * put(key, value)
        * remove(key)
        * get(key)
        * containsKey(key) -> boolean
        * containsValue(value) -> boolean
        * isEmpty()
        * size()
        * ------------Set
        *  add(e)->boolean
        *  addAll
        *  clear()
        * contains()
        * containsAll()
        * isEmpty()
        * remove()
        *
        * */


        //1. Init
        ArrayList<Integer> list = new ArrayList<Integer>();
        //2. Add
        list.add(12);
        list.add(1,13);
        list.add(14);
        list.add(15);
        // Hash map
        HashMap<Integer, Integer> hm = new HashMap<>();
    }
}
