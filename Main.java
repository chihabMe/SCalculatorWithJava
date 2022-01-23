
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main implements ActionListener {

	JButton[] numButtons = new JButton[10];
	JButton[] opButtons = new JButton[8];
	
	JButton PlsButton,MinButton,MulButton,DivButton;
	JButton EqButton,DelButton,ClrButton,DecButton;
	
	Font font = new Font("Ink Free",Font.BOLD,25);
	char operator ;
	double n1=0,n2=0,result=0;

			
	//end of declaration
	
	//creating the window
	JFrame window ;
	
	//consctructor
	Main(){
		window = new JFrame();

		window.setTitle("Mg Calculator");
		window.setSize(400,500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main window = new Main();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
