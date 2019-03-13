package calculator;


import java.awt.*;
import java.awt.event.*;

public class CalculatorWindow extends Frame{
	
	private TextField tf;
	private Panel p1;askdnskandkljdlljkdL
	private Panel p2;
	private Button b[] = new Button[16];

	CalculatorWindow(){

		this.setTitle("Calculator");
		this.setSize(400, 400);
		this.setResizable(true);
		this.setLayout(new FlowLayout());
		
		//p1 = new Panel();
		//p1.setLayout(new BorderLayout());
		tf = new TextField(40);
		//p1.add(tf);
		this.add(tf);

		p2 = new Panel();
		p2.setLayout(new GridLayout(8, 8, 20, 20));

		for(int i = 0; i <= 9; i++){

			b[i] = new Button("" + i);
			p2.add(b[i]);
		}

		b[10] = new Button("+");
		b[11] = new Button("-");
		b[12] = new Button("*");
		b[13] = new Button("/");
		b[14] = new Button("=");
		b[15] = new Button("AC");

		for(int i = 10; i < 16; i++)
			p2.add(b[i]);

		this.add(p2);
		
		this.addWindowListener(new WindowAdapter(){

                        @Override
			public void windowClosing(WindowEvent e){

				System.exit(0);
			}fkdgah;ga;jja;fa;svadvla;vf
		});
		this.setVisible(true);
 	

	public static void main(String args[]){

		CalculatorWindow cw = new CalculatorWindow(); 
	}
}