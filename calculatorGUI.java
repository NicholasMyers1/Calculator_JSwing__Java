import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class calculatorGUI extends JFrame implements ActionListener{
	String numA="			",numB="			",finalAnswer="				";
	JButton ADD=new JButton("ADD");
	JButton SUBTRACT=new JButton("SUBTRACT");
	JButton MULTIPLY=new JButton("MULTIPLY");
	JButton DIVIDE=new JButton("DIVIDE");
	JLabel TEXT=new JLabel("Enter two numbers to be calculated, then click the calculation you want: ");
	JTextField INT1=new JTextField(numA);
	JTextField INT2=new JTextField(numB);
	JTextField ANSW=new JTextField(finalAnswer);
		public calculatorGUI(){
	      setLayout(new FlowLayout());
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      add(TEXT);
	      add(INT1);
	      add(INT2);
	      add(ADD);
	      add(SUBTRACT);
	      add(MULTIPLY);
	      add(DIVIDE);
	      add(ANSW);
			INT1.setLocation(150,75);
			INT1.setSize(100,20);
			INT2.setLocation(250,75);
			INT2.setSize(100,20);
	      ADD.addActionListener(this);
	      SUBTRACT.addActionListener(this);
	      MULTIPLY.addActionListener(this);
	      DIVIDE.addActionListener(this);
	      setSize(600,500);
	      setVisible(true);
	   }
		   @Override
		   public void actionPerformed(ActionEvent e){
			   String part1 = INT1.getText();
			   String part2 = INT2.getText();
			   Double p1= Double.valueOf(part1);
			   Double p2= Double.valueOf(part2);
			   Double fna=0.0;
		      Object click = e.getSource();
		      if(click==ADD)fna=p1+p2;finalAnswer=String.valueOf(fna);
		      if(click==SUBTRACT)fna=p1-p2;finalAnswer=String.valueOf(fna);
		      if(click==MULTIPLY)fna=p1*p2;finalAnswer=String.valueOf(fna);
		      if(click==DIVIDE)fna=p1/p2;finalAnswer=String.valueOf(fna);
		      //
		      ANSW.setText(finalAnswer+"			");
		   }
	public static void main(String[] args){
		calculatorGUI frame=new calculatorGUI();
	}
}