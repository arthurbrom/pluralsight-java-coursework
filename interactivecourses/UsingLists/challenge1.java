package interactivecourses.UsingLists;

import java.util.*;

public class challenge1 {
    /**
     * Using Lists
     * A Collection is an Interface, like a Blueprint, that says you MUST implement
     * these methods to be a Collection:
     * Examples:
     *      - add()
     *      - remove()
     *      - size()
     *      - contains()
     *      - clear()
     *      - isEmpty()
     *      - ... and more!
     *
     * The following are two subtypes of Collection and there's many more...
     *  - A List is an ordered group of values that are indexed numerically
     *      - List is also an interface. A List must also implement methods of a Collection
     *      - We need a non-abstract (non-interface) implementation of a List to initialize.
     *          * Build our own?
     *          * ArrayList <-- most commonly used
     *          * LinkedList
     *          * Vector
     *          * Stack
     *  - A Set is a group of unique values without an index
     *
     */
    ArrayList<String> myList = new ArrayList<>();
    /*
        ^ This is not wrong, but using a general List on the left lets us switch out
        the type of list without changing any other code!
        List<String> languages = new LinkedList<>();
        List<String> languages = new MyList<>();
    */
    List<String> languages = new ArrayList<>();


}
