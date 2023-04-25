import javax.swing.JOptionPane;

public class Facto {

	public static void main(String[] args) {
		int nombre= 0;
		long factoriel=1;
		String message = "le factoriel de ";
		
		try{
			nombre=Integer.
					parseInt(JOptionPane.showInputDialog(
							"Taper un entier "));
			message += nombre + " est ";
		}catch(Exception e) {
			System.err.println("erreur "+ e);
			
		}
		
		if(nombre > 0) {
			while(nombre >1) {
				factoriel *= nombre--;
			}
		}
		
		
		message += factoriel;
		JOptionPane.showInputDialog(null,message);

	}
	
}
