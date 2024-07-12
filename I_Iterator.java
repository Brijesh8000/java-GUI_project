import java.util.Iterator;
import java.util.Vector;

public class I_Iterator {
    public  static  void main(String []args){
        Vector v1=new Vector();
        v1.add("Brijesh");
        v1.add("Rohit");
        v1.add("Ranjit");
        v1.add("Abdullah");

        Iterator e1=v1.iterator();
        while (e1.hasNext()){
            System.out.println(e1.next());
        }
        e1=v1.iterator();
        while (e1.hasNext()){
           String s1=(String)e1.next();
           if(s1=="Rohit" || s1=="Brijesh"){
               e1.remove();
           }
           else{
               System.out.println(s1);
           }
        }
    }
}
