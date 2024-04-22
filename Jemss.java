import javax.swing.JOptionPane;

public class Jemss {

	public static void main(String[] args) {
		int choice = 0;
		double a =0;
		double b =0;
		double c=0;
		int counter =0;
		
		
		JOptionPane.showMessageDialog(null, "Welcome to Pythagorean Theorem Calculator!");
		while(counter != 1 ) {
		try {
		
		do{
		 choice = Integer.parseInt(JOptionPane.showInputDialog("Press [1] - Find A, [2] - Find B, [3] - Find Hypotenus , [4] to Exit "));
		
		}while(choice != 1 &&choice != 2 &&choice != 3 &&choice != 4 );
		
		 
		
		if(choice == 4) {
			JOptionPane.showMessageDialog(null, "Program Exit!");
			counter++;
		}
		else {
			String out = choice == 1 ? "Leg A" : choice == 2 ? "Leg B" : "Hypotenuse";
			JOptionPane.showMessageDialog(null, "You choose: " + out );
			
			if(choice == 1) {
					b = Double.parseDouble(JOptionPane.showInputDialog("Enter B: "));
					c = Double.parseDouble(JOptionPane.showInputDialog("Enter C: "));
					JOptionPane.showMessageDialog(null, "Answer: \n" +computeMethodLegA(b,c));
					counter++;
			}
			else if(choice == 2) {
				a = Double.parseDouble(JOptionPane.showInputDialog("Enter A: "));
				c = Double.parseDouble(JOptionPane.showInputDialog("Enter C: "));
				JOptionPane.showMessageDialog(null, "Answer: \n" +computeMethodLegB(a,c));
				counter++;
			}
			else {
				a = Double.parseDouble(JOptionPane.showInputDialog("Enter A: "));
				b = Double.parseDouble(JOptionPane.showInputDialog("Enter B: "));
				JOptionPane.showMessageDialog(null, "Answer: \n"+ computeMethodHypotenuse(a,b));
				counter++;
			}

		}
		
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Error!");
		}
		}
		
	}
	
	static double computeMethodLegA(double b, double c) {
		
		return Math.sqrt( (b*b)+ (c*c));
	}
	static double computeMethodLegB(double a, double c) {
		
		return Math.sqrt((c*c)+ (a * a));
	}

	static double computeMethodHypotenuse(double a, double b) {
		
		return Math.sqrt((a*a) + (b*b));
	}	


}
///Comment here
