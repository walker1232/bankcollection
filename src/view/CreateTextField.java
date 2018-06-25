package view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreateTextField {
	JTextField idTxt;
	JPanel idPan;
	public void create() {
		idTxt = new JTextField();
		idPan = new JPanel();
		idPan.add(idTxt);
		
	}
}
