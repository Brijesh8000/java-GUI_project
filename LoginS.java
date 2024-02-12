// package java-GUI_project;
import javax.swing.*;
class loginS extends JFrame {
    loginS(String s1){
        super(s1);
    }
    loginS(){

    }
    void setComponent(){
        JFrame l1=new JFrame(" WELCOME THERE ");
//        JTextField t1= new JTextField();
        setLayout(null);
        l1.setBounds(200, 100, 100, 30);
//        t1.setBounds(200,200,100,30);
//        add(t1);
        add(l1);
    }
    public static void main(String []args){
        loginS s1=new loginS("Welocome There ");

        s1.setVisible(true);
        s1.setSize(700,700);
        s1.setComponent();

        s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}





//
//public class LoginS {
//}
