import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public static void main(String[] args) throws Exception {
        Main window= new Main();
        //window.run();
    }

    public class Canvas extends JPanel{
        public Canvas(){
            setPreferredSize(new Dimension(720,720));
        }
    }
    public Main(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }


    // public void run(){

    // }
}