import  java.util.*;


public class list_iterator {
   public static void main (String []args){
       Vector v1 =new Vector();
       v1.add("Brijesh");
       v1.add("Ranjit");
       v1.add("Rohit");
       v1.add("Abdullah");
       v1.add("Vinay");

       /* Display with the help of for loop ang vector .get function
       *  */

//       for(int i=0; i<6;i++){
//
//           try{
//               System.out.println(v1.get(i));
//
//           }
//           catch (ArrayIndexOutOfBoundsException e1){
//
//           }
//
//       }
       /*
       Display with the help of while loop ang ListIterator function

        */

       ListIterator l1 =v1.listIterator();
       try {
           while (l1.hasNext()){

               String s1=(String)l1.next();
               if(s1.equals("Brijesh")){
                   l1.set("Biju");
               }
               else if (s1.equals("Rohit")) {
                   l1.set("Barwa");

               } else if (s1.equals("Ranjit")) {
                   l1.set("Randwa");

               } else if (s1.equals("Abdullah")) {
                   l1.set("Monish Ka Bhatar");

               }
               else  {
                   System.out.println("Element not Found " +(String)s1);
               }




           }
//       l1 =v1.listIterator();
           while (l1.hasPrevious()){
               System.out.println(l1.previous());
           }
       }
       catch (NoSuchElementException e1){

       }









   }
}
