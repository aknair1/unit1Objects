import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Test
{
        public static void main(String[] args) throws Exception
        {
                URL imageLocation = new URL(
                    "http://img.morphthing.com/i/27341/2/0/76bac43b/Shrek.jpeg");
                    JOptionPane.showMessageDialog(null, "Hello", "Title",
                        JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
                    
           }
    

}
