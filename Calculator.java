import java.awt.Color;
import java.awt.Font;
import java.awt.color.ColorSpace;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.text.AttributeSet.ColorAttribute;


public class Calculator implements ActionListener{
	
    public static void main(String srgs[]) {
		
		new Calculator();
		
	}

	JFrame jk;
	JLabel ShowLabel,ShowLabel2,shownote;
	JButton Button7;
	JButton Button8;
	JButton Button9;
	JButton Button4;
	JButton Button5;
	JButton Button6;
	JButton Button1;
	JButton Button2;
	JButton Button3;
	JButton zero;
	JButton dot;
	JButton divison;
	JButton plus;
	JButton multiply;
	JButton minus,clear,equalto;
	int expression;
	float answer=0;
	
	float value;
	
	Boolean operator=(false);

	public Calculator() {
		
	jk=new JFrame("Jaison's Calculator");
	jk.setSize(600,650);
	jk.setLayout(null);
	jk.setVisible(true);
	jk.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jk.setLocation(450, 150);
	
	shownote=new JLabel("Only two term operations Please");
	shownote.setBounds(375,585,200,25);
	shownote.setOpaque(true);
	shownote.setHorizontalAlignment(SwingConstants.RIGHT);
	jk.add(shownote);
	
	ShowLabel=new JLabel("");
	ShowLabel.setBackground(Color.darkGray);
	ShowLabel.setOpaque(true);
	ShowLabel.setForeground(Color.white);
	ShowLabel.setBounds(30,50,540,40);
	ShowLabel.setHorizontalAlignment(SwingConstants.RIGHT);
	ShowLabel.setFont(new Font("Serif", Font.PLAIN, 25));
	jk.add(ShowLabel);
	
	ShowLabel2=new JLabel("Welcome");
	ShowLabel2.setFont(new Font("Serif", Font.PLAIN, 25));
	ShowLabel2.setBackground(Color.white);
	ShowLabel2.setOpaque(true);
	ShowLabel2.setBounds(300,15,270,30);
	ShowLabel2.setHorizontalAlignment(SwingConstants.CENTER);
	jk.add(ShowLabel2);
	
	Button7=new JButton("7");
	Button7.setBounds(30,130, 80,80);
	Button7.setBackground(Color.lightGray);
	Button7.setFont(new Font("Dialog", Font.PLAIN, 30));
	Button7.addActionListener(this);
	jk.add(Button7);
	
	Button8=new JButton("8");
	Button8.setBounds(140,130, 80,80);
	Button8.setBackground(Color.lightGray);
	Button8.setFont(new Font("Dialog", Font.PLAIN, 30));
	Button8.addActionListener(this);
	jk.add(Button8);
	
	Button9=new JButton("9");
	Button9.setBounds(250,130, 80,80);
	Button9.setBackground(Color.lightGray);
	Button9.setFont(new Font("Dialog", Font.PLAIN, 30));
	Button9.addActionListener(this);
	jk.add(Button9);
	
	Button4=new JButton("4");
	Button4.setBounds(30,260, 80,80);
	Button4.setBackground(Color.lightGray);
	Button4.setFont(new Font("Dialog", Font.PLAIN, 30));
	Button4.addActionListener(this);
	jk.add(Button4);
	
	Button5=new JButton("5");
	Button5.setBounds(140,260, 80,80);
	Button5.setBackground(Color.lightGray);
	Button5.setFont(new Font("Dialog", Font.PLAIN, 30));
	Button5.addActionListener(this);
	jk.add(Button5);
	
	Button6=new JButton("6");
	Button6.setBounds(250,260, 80,80);
	Button6.setBackground(Color.lightGray);
	Button6.setFont(new Font("Dialog", Font.PLAIN, 30));
	Button6.addActionListener(this);
	jk.add(Button6);
	
	Button1=new JButton("1");
	Button1.setBounds(30,390, 80,80);
	Button1.setBackground(Color.lightGray);
	Button1.setFont(new Font("Dialog", Font.PLAIN, 30));
	Button1.addActionListener(this);
	jk.add(Button1);
	
	Button2=new JButton("2");
	Button2.setBounds(140,390, 80,80);
	Button2.setBackground(Color.lightGray);
	Button2.setFont(new Font("Dialog", Font.PLAIN, 30));
	Button2.addActionListener(this);
	jk.add(Button2);
	
	Button3=new JButton("3");
	Button3.setBounds(250,390, 80,80);
	Button3.setBackground(Color.lightGray);
	Button3.setFont(new Font("Dialog", Font.PLAIN, 30));
	Button3.addActionListener(this);
	jk.add(Button3);
	
	
	dot=new JButton(".");
	dot.setBounds(30,500, 80,80);
	dot.setBackground(Color.lightGray);
	dot.addActionListener(this);
	dot.setFont(new Font("Dialog", Font.PLAIN, 30));
	jk.add(dot);
	
	zero=new JButton("0");
	zero.setBounds(140,500, 80,80);
	zero.setBackground(Color.lightGray);
	zero.setFont(new Font("Dialog", Font.PLAIN, 30));
	zero.addActionListener(this);
	jk.add(zero);
	
	equalto=new JButton("=");
	equalto.setBounds(250,500, 80,80);
	equalto.setFont(new Font("Dialog", Font.PLAIN, 30));
	equalto.addActionListener(this);
	jk.add(equalto);
	
	divison=new JButton("/");
	divison.setBounds(360,130, 80,80);
	divison.setFont(new Font("Dialog", Font.PLAIN, 30));
	divison.addActionListener(this);
	jk.add(divison);
	
	clear=new JButton("CC");
	clear.setBounds(470,130, 80,80);
	clear.addActionListener(this);
	clear.setFont(new Font("Dialog", Font.PLAIN, 30));
	jk.add(clear);
	
	plus=new JButton("+");
	plus.setBounds(360,260, 80,80);
	plus.setFont(new Font("Dialog", Font.PLAIN, 30));
	plus.addActionListener(this);
	jk.add(plus);
	
	multiply=new JButton("*");
	multiply.setBounds(360,390, 80,80);
	multiply.addActionListener(this);
	multiply.setFont(new Font("Dialog", Font.PLAIN, 30));
	jk.add(multiply);
	
	minus=new JButton("-");
	minus.setBounds(360,500, 80,80);
	minus.addActionListener(this);
	minus.setFont(new Font("Dialog", Font.PLAIN, 30));
	jk.add(minus);
	
	}
	
	
	public void actionPerformed(ActionEvent e) {
	      if (e.getSource() == Button7) {
	    	  
	    	  if(operator==true) {
	    			ShowLabel.setText("");
	    			operator=false;
	    		}
	    		ShowLabel.setText(ShowLabel.getText()+"7");
	    		
	      }
	      
	      else if(e.getSource() == Button8) {
	    	  
	    	  if(operator==true) {
	    			ShowLabel.setText("");
	    			operator=false;
	    		}
	    		ShowLabel.setText(ShowLabel.getText()+"8");
	    		
	      }
	      
	      else if (e.getSource() == Button9) {
	    	  
	    	  if(operator==true) {
	    			ShowLabel.setText("");
	    			operator=false;
	    		}
	    		ShowLabel.setText(ShowLabel.getText()+"9");
	    		
	      }
	      
	      else if (e.getSource() == Button4) {
	    	  
	    	  if(operator==true) {
	    			ShowLabel.setText("");
	    			operator=false;
	    		}
	    		ShowLabel.setText(ShowLabel.getText()+"4");
	    		
	      }
	      
	      else if (e.getSource() == Button5) {
	    	  
	    	  if(operator==true) {
	    			ShowLabel.setText("");
	    			operator=false;
	    		}
	    		ShowLabel.setText(ShowLabel.getText()+"5");
	    		
	      }
	      
	      else if (e.getSource() == Button6) {
	    	  
	    	  if(operator==true) {
	    			ShowLabel.setText("");
	    			operator=false;
	    		}
	    		ShowLabel.setText(ShowLabel.getText()+"6");
	    		
	      }
	      
	      else if (e.getSource() == Button1) {
	    	  
	    	  if(operator==true) {
	    			ShowLabel.setText("");
	    			operator=false;
	    		}
	    		ShowLabel.setText(ShowLabel.getText()+"1");
	    		
	      }
	      
	      else if (e.getSource() == Button2) {
	    	  
	    	  if(operator==true) {
	    			ShowLabel.setText("");
	    			operator=false;
	    		}
	    		ShowLabel.setText(ShowLabel.getText()+"2");
	    		
	      }
	      else if (e.getSource() == Button3) {
	    	  
	    	  if(operator==true) {
	    			ShowLabel.setText("");
	    			operator=false;
	    		}
	    		ShowLabel.setText(ShowLabel.getText()+"3");
	    		
	      }
	      
	      else if(e.getSource() == zero) {
	    	  
	    	  if(operator==true) {
	    			ShowLabel.setText("");
	    			operator=false;
	    		}
	    		ShowLabel.setText(ShowLabel.getText()+"0");
	    		
	      }
	      
	      else if(e.getSource() == dot) {
	    	  
	    	  if(operator==true) {
	    			ShowLabel.setText("");
	    			operator=false;
	    		
	    		ShowLabel.setText(ShowLabel.getText()+".");
	    		}
	    	  
	      }
	      
	      
	      else if(e.getSource() == clear) {
	    	  operator=false;
	    	  value=0;
	    	  expression=0;
	    	  answer=0;
	    		ShowLabel.setText("");
	    		ShowLabel2.setText("Welcome");
	      }
	      
	      else if(e.getSource() == divison) {
	    	  value=Float.parseFloat(ShowLabel.getText());
	    		operator=true;
	    		expression=1;
	    		
	      }
	      else if(e.getSource() == minus) {
	    	  value=Float.parseFloat(ShowLabel.getText());
	    		operator=true;
	    		expression=2;
	      }
	      else if(e.getSource() == multiply) {
	    	  value=Float.parseFloat(ShowLabel.getText());
	    		operator=true;
	    		expression=3;
	      }
	      else if(e.getSource() == plus) {
	    	  value=Float.parseFloat(ShowLabel.getText());
	    		operator=true;
	    		expression=4;
	      }
	      
	      else if(e.getSource() == equalto) {
	    	  
	    	  
	    	  switch(expression) {
	    	  case 1:
	    		  answer=value/Float.parseFloat(ShowLabel.getText());
	    		  ShowLabel2.setText("Division");
		    		ShowLabel.setText("The answer is "+answer);
	    	    break;
	    	  case 2:
	    		  answer=value-Float.parseFloat(ShowLabel.getText());
	    		  ShowLabel2.setText("Substraction");
		    		ShowLabel.setText("The answer is "+answer);
	    	    break;
	    	  case 3:
	    		  answer=value*Float.parseFloat(ShowLabel.getText());
	    		  ShowLabel2.setText("Multiplication");
		    		ShowLabel.setText("The answer is "+answer);
	    	    break;
	    	  case 4:
	    		  answer=value+Float.parseFloat(ShowLabel.getText());
	    		  ShowLabel2.setText("Addition");
		    		ShowLabel.setText("The answer is "+answer);
	    	    break;
	    	  default:
	    		  ShowLabel.setText("");
	    		  
	    	}
	    	  
	      }
}
	
}
