import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;



public class Calcualtor implements ActionListener {
	
	    boolean isOperatorClicked = false;
	   
	    String oldValue,minusoldValue,multioldValue,divoldValue;
	    
	    int command = 0;
	    
	    JFrame jf;
	    
	    JLabel displayLabel;
	    
	    JButton sevButton,eigButton,nineButton,divisionButton,clearButton;
	    JButton fourButton,fiveButton,sixButton,multiButton;
	    JButton oneButton,twoButton,threeButton,minusButton;
	    JButton pointButton,zeroButton,equalButton,plusButton;
	
	  public Calcualtor() {
		
		jf = new JFrame("CalcualtoR");
		jf.setLayout(null);
		jf.setSize(600, 600);
		jf.setLocation(900, 100);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		  
		displayLabel = new JLabel();
		displayLabel.setBounds(30, 50, 540, 40);
		displayLabel.setBackground(Color.WHITE);  //________________Colour
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.BLACK);
		jf.add(displayLabel);
		
		
		
		sevButton = new JButton("7");
		sevButton.setBounds(30 ,130,80, 80);
		sevButton.addActionListener(this);
		sevButton.setFont(new Font("Robinson", Font.ROMAN_BASELINE, 40));
		sevButton.setBackground(Color.WHITE);
		jf.add(sevButton);
		
		 eigButton = new JButton("8");
		eigButton.setBounds(130,130,80, 80);
		eigButton.addActionListener(this);
		eigButton.setFont(new Font("Robinson", Font.ROMAN_BASELINE, 40));
		eigButton.setBackground(Color.WHITE);
		jf.add(eigButton);
		
		 nineButton = new JButton("9");
		nineButton.setBounds(230,130,80, 80);
		nineButton.addActionListener(this);
		nineButton.setFont(new Font("Robinson", Font.ROMAN_BASELINE, 40));
		nineButton.setBackground(Color.WHITE);
		jf.add(nineButton);
		
		 divisionButton = new JButton("/");
		divisionButton.setBounds(330,130,80, 80);
		divisionButton.addActionListener(this);
		divisionButton.setFont(new Font("Robinson", Font.ROMAN_BASELINE, 40));
		divisionButton.setBackground(Color.WHITE);
		divisionButton.setForeground(Color.orange);
		jf.add(divisionButton);
		
		clearButton = new JButton("CLR");
		clearButton .setBounds(430,130,80, 80);
		clearButton .addActionListener(this);
		clearButton .setFont(new Font("MonospaceSerif", Font.BOLD, 20));
		clearButton .setBackground(Color.WHITE);
		clearButton .setForeground(Color.RED);
		jf.add(clearButton );
		
		
		 fourButton = new JButton("4");
		fourButton.setBounds(30,230,80, 80);
		fourButton.addActionListener(this);
		fourButton.setFont(new Font("Robinson", Font.ROMAN_BASELINE, 40));
		fourButton.setBackground(Color.WHITE);
		jf.add(fourButton);
		
		fiveButton = new JButton("5");
		fiveButton.setBounds(130,230,80, 80);
		fiveButton.addActionListener(this);
		fiveButton.setFont(new Font("Robinson", Font.ROMAN_BASELINE, 40));
		fiveButton.setBackground(Color.WHITE);
		jf.add(fiveButton);
		
		sixButton = new JButton("6");
		sixButton.setBounds(230,230,80, 80);
		sixButton.addActionListener(this);
		sixButton.setFont(new Font("Robinson", Font.ROMAN_BASELINE, 40));
		sixButton.setBackground(Color.WHITE);
		jf.add(sixButton);
		
		multiButton = new JButton("x");
		multiButton.setBounds(330,230,80, 80);
		multiButton.addActionListener(this);
		multiButton.setFont(new Font("Robinson", Font.ROMAN_BASELINE, 40));
		multiButton.setBackground(Color.WHITE);
	    multiButton.setForeground(Color.orange);
		jf.add(multiButton);
		
		oneButton = new JButton("1");
		oneButton.setBounds(30,330,80, 80);
		oneButton.addActionListener(this);
		oneButton.setFont(new Font("Robinson", Font.ROMAN_BASELINE, 40));
		oneButton.setBackground(Color.WHITE);
		jf.add(oneButton);
		
		twoButton = new JButton("2");
		twoButton.setBounds(130,330,80, 80);
		twoButton.addActionListener(this);
		twoButton.setFont(new Font("Robinson", Font.ROMAN_BASELINE, 40));
		twoButton.setBackground(Color.WHITE);
		jf.add(twoButton);
		
		threeButton = new JButton("3");
		threeButton.setBounds(230,330,80, 80);
		threeButton.addActionListener(this);
		threeButton.setFont(new Font("Robinson", Font.ROMAN_BASELINE, 40));
		threeButton.setBackground(Color.WHITE);
		jf.add(threeButton);
		
		minusButton = new JButton("-");
		minusButton.setBounds(330,330,80, 80);
		minusButton.addActionListener(this);
		minusButton.setFont(new Font("Robinson", Font.ROMAN_BASELINE, 40));
		minusButton.setBackground(Color.WHITE);
		minusButton.setForeground(Color.orange);
		jf.add(minusButton);
		
		pointButton = new JButton(".");
		pointButton.setBounds(30,430,80, 80);
		pointButton.addActionListener(this);
		pointButton.setFont(new Font("Robinson", Font.ROMAN_BASELINE, 40));
		pointButton.setBackground(Color.WHITE);
		jf.add(pointButton);
		
		zeroButton = new JButton("0");
		zeroButton.setBounds(130,430,80, 80);
		zeroButton.addActionListener(this);
	    zeroButton.setFont(new Font("Robinson", Font.ROMAN_BASELINE, 40));
	    zeroButton.setBackground(Color.WHITE);
		jf.add(zeroButton);
		
		equalButton = new JButton("=");
		equalButton.setBounds(230,430,80, 80);
		equalButton.addActionListener(this);
		equalButton.setFont(new Font("Robinson", Font.ROMAN_BASELINE, 40));
		equalButton.setBackground(Color.WHITE);
		jf.add(equalButton);
		
		plusButton = new JButton("+");
		plusButton.setBounds(330,430,80, 80);
		plusButton.addActionListener(this);
	    plusButton.setFont(new Font("Robinson", Font.ROMAN_BASELINE, 40));
	    plusButton.setBackground(Color.WHITE);
	    plusButton.setForeground(Color.orange);
		jf.add(plusButton);
		
		
		
		

	}
	  
	  public static void main(String[] args) {
		
		new  Calcualtor();
	}

	@Override
	public  void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==sevButton) {
			
			
			if(isOperatorClicked) {
				displayLabel.setText("7");
				isOperatorClicked = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"7");
			}
			
		}else if(e.getSource() == eigButton) {

			
			if(isOperatorClicked) {
				displayLabel.setText("8");
				isOperatorClicked = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"8");
			}
			
			
		}else if(e.getSource() == nineButton) {

			
			if(isOperatorClicked) {
				displayLabel.setText("9");
				isOperatorClicked = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"9");
			}
			
		}else if(e.getSource() == fourButton) {

			
			if(isOperatorClicked) {
				displayLabel.setText("4");
				isOperatorClicked = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"4");
			}
			
		}else if(e.getSource() == fiveButton) {

			
			if(isOperatorClicked) {
				displayLabel.setText("5");
				isOperatorClicked = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"5");
			}
			
		}else if(e.getSource() == sixButton) {

			
			if(isOperatorClicked) {
				displayLabel.setText("6");
				isOperatorClicked = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"6");
			}
			
		}else if(e.getSource() == oneButton) {

			
			if(isOperatorClicked) {
				displayLabel.setText("1");
				isOperatorClicked = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"1");
			}
			
		}else if(e.getSource() == twoButton) {

			
			if(isOperatorClicked) {
				displayLabel.setText("2");
				isOperatorClicked = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"2");
			}
			
		}else if(e.getSource() == threeButton) {

			
			if(isOperatorClicked) {
				displayLabel.setText("3");
				isOperatorClicked = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"3");
			}
			
		}else if(e.getSource() == zeroButton) {

			
			if(isOperatorClicked) {
				displayLabel.setText("0");
				isOperatorClicked = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"0");
			}
			
		}else if(e.getSource() == pointButton) {

			
			if(isOperatorClicked) {
				displayLabel.setText(".");
				isOperatorClicked = false;
			}else {
				displayLabel.setText(displayLabel.getText()+".");
			}
		}else if(e.getSource() == equalButton) {
				
				switch (command) {
				
				case 1:
					
					String newValue= displayLabel.getText();
					float oldValueF = Float.parseFloat(oldValue);
					float newValueF = Float.parseFloat(newValue);
					float result = oldValueF+newValueF;
					
					displayLabel.setText(result+"");
					
				case 2:

				String minusnewValue = displayLabel.getText();
				float minusoldValueF = Float.parseFloat(minusoldValue);
				float minusnewValueF = Float.parseFloat(minusnewValue);
				float minusresult = minusoldValueF - minusnewValueF;
				
				displayLabel.setText(minusresult+"");
				
				case 3:
					

					String multinewValue = displayLabel.getText();
					float multioldValueF = Float.parseFloat(multioldValue);
					float multinewValueF = Float.parseFloat(multinewValue);
					float multiresult = multioldValueF * multinewValueF;
					
					displayLabel.setText(multiresult+"");
					
				case 4:
					
					String divnewValue = displayLabel.getText();
					float divoldValueF = Float.parseFloat(divoldValue);
					float divnewValueF = Float.parseFloat(divnewValue);
					float divresult = divoldValueF / divnewValueF;
					
					displayLabel.setText(divresult+"");
				
				}
				
			
			
		
			
		
			 //++++++++++++++++++++++++++++++++++++++++++++++++++++++++
			
			

			
		
			
			
			
		}else if(e.getSource() == plusButton) {
			
		   isOperatorClicked   =  true;
		   oldValue = displayLabel.getText();
		   
		   command =1;
		  
			 
		}else if(e.getSource() == minusButton) {
			
			 isOperatorClicked   =  true;
			   minusoldValue = displayLabel.getText();
			   
			   command = 2;
			
		}else if(e.getSource() == multiButton) {
			
			isOperatorClicked   =  true;
			multioldValue = displayLabel.getText();
			
			command = 3;
			
		}else if(e.getSource() == divisionButton) {
			
			isOperatorClicked   =  true;
			divoldValue = displayLabel.getText();
			
			command = 4;
			
			
		}else if (e.getSource() == clearButton) {
			displayLabel.setText(""); 
			
			
		}
			
			
			
		
		
	}
	}


