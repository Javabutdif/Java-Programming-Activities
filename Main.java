import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		double result = 0;
		int count = 0;
		int num = 0;
		int counter = 0;
		
		JOptionPane frame = new JOptionPane();
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	while(counter != 1) {	
	if(JOptionPane.showConfirmDialog(null, "Fahrenheit and Celsius Conversion" + "\n"+ "\n" + 
	"Do you want to enter the program?  ", null, JOptionPane.YES_NO_OPTION )== JOptionPane.YES_OPTION) 
	{
		while(count != 1 ) {
	try {
		
		 num = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 if Celsius to Fahrenheit. Enter 2 if Fahrenheit to Celsius"));
		 	
			
			if(num == 1) {
				double num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter for Celsius: "));
				result = Fahren.getFahren(num1);//method calculations
				new Fahren(result);//display result
				
					if(JOptionPane.showConfirmDialog(null, " Want to continue? ", null, JOptionPane.YES_NO_OPTION )== JOptionPane.YES_OPTION) {
							//Loop continue
						}
					else {
						count++;// end of loop when this condition started
					}
			}
			if(num == 2) {
				double num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter for Fahrenheit: "));
				result = Cel.getCel(num1);//method calculation
				new Cel(result);//display result
				
				
				 	if(JOptionPane.showConfirmDialog(null, " Want to continue? ", null, JOptionPane.YES_NO_OPTION )== JOptionPane.YES_OPTION) {
				 			//Loop continue
				 		}
				 	else {
				 		count++;// end of loop when this condition started
				 	}
			}
			if(num != 1  && num != 2) {
				JOptionPane.showMessageDialog(null, "Invalid Input!");//error catch for the 2nd input
				
			}
		
	    }catch(Exception e) {
	    	
	    	JOptionPane.showMessageDialog(null, "Please enter a number that corresponding to the choices!");//error catch for the 1st input
	    }
		
		}
			
		}
	
	else {
		
		JOptionPane.showMessageDialog(null, "You have exited the program :D");
		counter++;
	}
	}
	
		
		

	}
	/*
		static double getFahren(double num1) {
			 double result = (num1 * 1.8)+ 32;
			 
			 return result;
		}
		
	
		static void fahren(double result) {
			
				JOptionPane.showMessageDialog(null, result);
				
				if(result > 200 || result > 89) {
					JOptionPane.showMessageDialog(null, "Hot");
				}
				if(result > 61 && result < 89) {
					JOptionPane.showMessageDialog(null, "Normal");
				}
				if(result < 61 || result == 0) {
					JOptionPane.showMessageDialog(null, "Cold");
				}

		}
		static double getCel(double num1) {
			 double result = (num1 - 32)* 1.8;
			 
			 return result;
		}
		
	
		static void cel(double result) {
			
			JOptionPane.showMessageDialog(null, result);
				
				if(result > 100 || result > 37) {
					JOptionPane.showMessageDialog(null, "Hot");
				}
				if(result > 29 && result < 37) {
					JOptionPane.showMessageDialog(null, "Normal");
				}
				if(result < 29 || result == 0) {
					JOptionPane.showMessageDialog(null, "Cold");
				}

		}
		*/
	
	

}
