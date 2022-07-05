import java.util.HashSet;
import java.util.Iterator;
public class Main {
    public static void main(String[] args) {
        // creating
        HashSet <Integer> set= new HashSet<Integer>();

        // Insult
        set.add(1);
        set.add(3);
        set.add(6);

        // find the size of set
        //System.out.println("the size is : "+ set.size());

        // print all element
        //System.out.println(set);
        // contain
    //        if(set.contains(1)){
    //            System.out.println("1 is contain");
    //        }
    //        if (!set.contains(7)){
    //            System.out.println("does not contain");
    //        }
    // For remove or delete
    //        set.remove(1);
    //        if (!set.contains(1)){
    //            System.out.println("We deleted 1");
    //    }

       //Iterator
    Iterator it = set.iterator();
    while (it.hasNext()){
        System.out.println(it.next());

    }
    }
}