import javax.swing.*;
class Radi {
        Radi(){
            JFrame f=new JFrame();
            JRadioButton r1=new JRadioButton("Male");
            JRadioButton r2=new JRadioButton("Female");
            r1.setBounds(75,50,100,30);
            r2.setBounds(75,100,100,30);
            ButtonGroup bg=new ButtonGroup();
            bg.add(r1);
            bg.add(r2);
            f.add(r1);
            f.add(r2);
            f.setSize(400, 300);
            f.setLayout(null);
            f.setVisible(true);
        }
        public static void main(String args[]){
            Radi v=new Radi();
        }
}

