import java.lang.reflect.Array;
import java.util.*;

//LinkedList
public class Main {
    public static void main(String[] args) {


        LinkedList L =  new LinkedList<>(Arrays.asList(10, 20, 30, 40, 3.4));
        System.out.println(L);//[10, 20, 30, 40, 3.4]

        LinkedList M = (LinkedList) L.clone();
        System.out.println(M);//[10, 20, 30, 40, 3.4]

        LinkedList N =  new LinkedList<>(Arrays.asList(10, 20, 30, 40, 3.4));

        System.out.println(L.equals(M));//true
        System.out.println(L.equals(N));//true
        System.out.println(L==M);//false
        System.out.println(L==N);//false


       /* equals() compares the contents of the lists,
       which is why L.equals(M) and L.equals(N) return true.
       == compares the object references (memory addresses),
       so L == M and L == N return false because M and N are different objects from L.*/

        for(int i=0; i<L.size(); i++)
            System.out.println(L.get(i));
        /*10
        20
        30
        40
        3.4*/
        L.add(111);
        System.out.println(L); //[10, 20, 30, 40, 3.4, 111]
        L.add(3, 333);
        System.out.println(L);//[10, 20, 30, 333, 40, 3.4, 111]
        L.addFirst(9999);
        System.out.println(L);//[9999, 10, 20, 30, 333, 40, 3.4, 111]
        L.addLast(8888);
        System.out.println(L);//[9999, 10, 20, 30, 333, 40, 3.4, 111, 8888]
        System.out.println(L.poll());//9999
        System.out.println(L);//[10, 20, 30, 333, 40, 3.4, 111, 8888]
    }
}