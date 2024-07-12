import java.util.Enumeration;
import java.util.Vector;

public class Cursors {
    public  static void main(String []arg){
        Vector v1=new Vector();
        v1.add("Brijesh");
        v1.add("Rohit");
        v1.add("Ranjit");
        v1.add("Birju");
        Enumeration k1=v1.elements();
        while (k1.hasMoreElements()){
            System.out.println(k1.nextElement());
        }
    }
}
