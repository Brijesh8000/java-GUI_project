import org.apache.commons.lang3.ObjectUtils;

import java.util.Iterator;
import java.util.Stack;

public class Satack_Collection {
    public static void main(String []arg){
        Stack s1=new Stack();
        s1.push(10);
        s1.push("Brijesh");
        s1.push("Rohit");
        s1.push(20);

        Iterator i1=s1.iterator();


            while (i1.hasNext()){
                System.out.println(i1.next());
            }

        }




    }

