import javax.swing.*;
import java.awt.*;
import java.lang.ref.Cleaner;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Digital_Clock extends JFrame  {
    JLabel l1,l2;
    SimpleDateFormat d1,d2;
    Digital_Clock(String s1){
        super(s1);

    }
    Digital_Clock(){

    }
    void setComponents(){
        l1 =new JLabel();
        l2 =new JLabel();
        l1.setFont(new Font("verdana",Font.BOLD,40));
        Color c1=Color.RED;
        Color c2=c1.brighter();
        l1.setForeground(c2);
        l1.setBackground(Color.BLACK);

        l2.setFont(new Font("verdana", Font.BOLD,40));
        l2.setForeground(c2);
        l2.setBackground(Color.GREEN);
        l2.setOpaque(true);
        l1.setOpaque(true);
        setLayout(null);

        add(l1);
        add(l2);
        l1.setBounds(50,50,300,100);
        l2.setBounds(50,300,400,100);

        d1=new SimpleDateFormat("hh:mm:ss a");

        String time =d1.format(Calendar.getInstance().getTime());
        l1.setText(time);

        d2=new SimpleDateFormat("dd:MM:YYYY ");

//        String date =d2.format(Calendar.getInstance().getTime());
//        l2.setText(date);

        while (true){
            time=d1.format(Calendar.getInstance().getTime());
            l1.setText(time);
            String date=d2.format(Calendar.getInstance().getTime());
            l2.setText(date);

            try {
                Thread.sleep(1);

            }
            catch(Throwable e1){

            }



        }



    }
    public  static  void main(String []arg){
        Digital_Clock d1=new Digital_Clock("Digital Clock");
        d1.setVisible(true);
        d1.setSize(500,500);
        d1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        d1.setComponents();



    }
}
