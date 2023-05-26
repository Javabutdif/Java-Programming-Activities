import javax.swing.JOptionPane;

public class Fahren {
	
	Fahren(double result){
		
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
	static double getFahren(double num1) {
		 double result = (num1 * 1.8)+ 32;
		 
		 return result;
	}

}


