import java.util.*;

public class set_interface {
    public  static  void main(String []arg){
        HashSet h1=new HashSet();
        h1.add("Brijeh");
        h1.add("Rohit");
        h1.add("Ranjit");
        h1.add("Abdullah");
        h1.add("Vinay");


        /*
        Display with the help of Iterators
         */

        Iterator i1 =h1.iterator();

        while (i1.hasNext()){
            System.out.println(i1.next() );
        }

        /*
        Display with the help of Enumeration
         */

//        Enumeration i1= Collections.enumeration(h1);
//
//        while (i1.hasMoreElements()){
//            System.out.println(i1.nextElement());
//
//        }






        
    }
}
