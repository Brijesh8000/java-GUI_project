
import javax.swing.*;

public class Demo {
    public static void main(String []args){
       float amt=1800000,emi=30000,year=15,time=180;
       float w,w1,rate=17/2;
       int n=15;
       
       

       for(int i=1;i<=15;i++){
         for(int j=1;j<12;j++){
         
         amt=amt+(amt*year*rate)/(12*1200);
          amt=amt-emi;
          
          System.out.println(amt);

        }
        System.out.println(i+"year complite ");

        year=year-1;
        System.out.println("year = "+year);
       }



        


    }
}

