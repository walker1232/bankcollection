package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class CreateComboBox {
	JPanel centerPan;
	JComboBox<?> combo;
	String[] menu = {"����� ���","���� �߰�"};
	public void create() {
		centerPan = new JPanel();
		combo = new JComboBox<>(menu);
		centerPan.add(combo);
	}
}
