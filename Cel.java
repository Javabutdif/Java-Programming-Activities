import javax.swing.JOptionPane;

public class Cel {
	
	Cel(double result){
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
	static double getCel(double num1) {
		 double result = (num1 - 32)* 1.8;
		 
		 return result;
	}

}
