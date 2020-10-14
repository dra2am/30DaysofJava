import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arrayListJava {
    public static void main(String[] args) {
        // init
        List<Integer> v0 = new ArrayList<>();
        // v1 = null
        List<Integer> v1;

        // cast an array to a vector
        Integer[] a = { 0, 1, 2, 3, 4 };
        // arrays contains methods for arr manipulation
        // asList returns arr as fixed size list, serialized, implements rand access
        v1 = new ArrayList<>(Arrays.asList(a));

        // make a copy
        List<Integer> v2 = v1;
        // another method of making a copy
        List<Integer> v3 = new ArrayList<>(v1);

        // get length:
        System.out.println("The size of v1 is: " + v1.size());
        // access an element:
        System.out.println("The first element in v1 is " + v1.get(0));
        // iterate the vector:
        System.out.println("[Version 1] The contents of v1 are: ");
        for (int i = 0; i < v1.size(); ++i) {
            System.out.println(v1.get(i));
        }
        // another method of iteration:
        System.out.println("[Version 2] The contents of v1 are: ");
        for (int item : v1) {
            System.out.println(item);
        }

        // modify element:
        // this will mod v1 since v2 = v1
        v2.set(0, 5);
        System.out.println("Now the first element in v1 is: " + v1.get(0));
        v2.set(0, -1);
        System.out.println("Now the first element in v1 is: " + v1.get(0));

        // sort
        Collections.sort(v1);

        // add new element to the end
        v1.add(-1);
        // addition specified by index
        v1.add(1, 6);
        // delete last element, takes an index
        v1.remove(v1.size() - 1);
    }
}