import java.util.Iterator;
import java.util.LinkedList;
// import java.util.ListIterator;

public class javaCollections {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<String>();

        // names.add("Caleb");
        // names.add("Sue");
        // names.add("Sally");

        // Linked list as a Queue
        // Removes from top of Queue
        // System.out.println(names.remove());
        // System.out.println(names.remove());
        // System.out.println(names.remove());

        // Linked list as Stack
        // every pushed item is added to beginning
        names.push("Caleb");
        names.push("Sue");
        names.push("Sally");

        // go through elements in sequence, starts with first
        Iterator<String> it = names.iterator();
        // ListIterator<String> it = names.listIterator();

        // names.add(2, "Susan");

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // for each loop?
        // does the same as above, s is each elem in iteration
        for (String s : names) {
            System.out.println(s);
        }

        // removes sally first and caleb last
        // different methods of removal
        // System.out.println(names.pop());
        // System.out.println(names.remove());
        // System.out.println(names.removeFirst());
    }
}
