package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import controller.*;
import domain.*;
import service.*;
import serviceImpl.*;

public class Register extends JFrame{
	private static final long serialVersionUID = 1L;
	JLabel topLab, idLab,passLab, nameLab, phoneLab, 
		addrLab, ssnLab, emailLab;
	JTextField idTxt, passTxt, nameTxt, phoneTxt, addrTxt, 
		ssnTxt, emailTxt;
	JButton addBtn;
	JPanel bottomPan, centerPan, idPan, passPan, 
		namePan, phonePan, addrPan, ssnPan, emailPan;
	JComboBox<?> combo;
	String[] menu = {"����� ���","���� �߰�"};
	public Register() {
		makeGui(); //ȭ�鱸��
		this.setSize(400, 300);
		this.setVisible(true);
	}
	// uid,pass,name,ssn,phone,email,addr;
	public void makeGui() {
		topLab = new JLabel("ȸ������", JLabel.CENTER);
		
		combo = new JComboBox<>(menu);
		idLab = new JLabel("I D : ", JLabel.CENTER);
		idTxt = new JTextField(15);
		idPan = new JPanel();
		idPan.add(idLab);
		idPan.add(idTxt);
		
		passLab = new JLabel("��й�ȣ : ");
		passTxt = new JTextField(15);
		passPan = new JPanel();
		passPan.add(passLab);
		passPan.add(passTxt);

		nameLab = new JLabel("�� �� : ");
		nameTxt = new JTextField(15);
		namePan = new JPanel();
		namePan.add(nameLab);
		namePan.add(nameTxt);
		
		ssnLab = new JLabel("�ֹι�ȣ : ");
		ssnTxt = new JTextField(15);
		ssnPan = new JPanel();
		ssnPan.add(ssnLab);
		ssnPan.add(ssnTxt);

		phoneLab = new JLabel("�� ȭ : ");
		phoneTxt = new JTextField(15);
		phonePan = new JPanel();
		phonePan.add(phoneLab);
		phonePan.add(phoneTxt);
		
		emailLab = new JLabel("�̸��� : ");
		emailTxt = new JTextField(15);
		emailPan = new JPanel();
		emailPan.add(emailLab);
		emailPan.add(emailTxt);

		addrLab = new JLabel("�� �� : ");
		addrTxt = new JTextField(15);
		addrPan = new JPanel();
		addrPan.add(addrLab);
		addrPan.add(addrTxt);

	

		centerPan = new JPanel();
		centerPan.setLayout(new GridLayout(8, 1));
		centerPan.add(combo);
		centerPan.add(idPan);
		centerPan.add(passPan);
		centerPan.add(namePan);
		centerPan.add(ssnPan);
		centerPan.add(phonePan);
		centerPan.add(emailPan);
		centerPan.add(addrPan);
		

		addBtn = new JButton("�߰�");
		addBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				UserBean member = new UserBean();
				member.setUid(idTxt.getText());
				member.setPass(passTxt.getText());
				member.setName(nameTxt.getText());
				member.setSsn(ssnTxt.getText());
				member.setAddr(addrTxt.getText());
				member.setPhone(phoneTxt.getText());
				member.setEmail(emailTxt.getText());
				if(((String) combo.getSelectedItem()).equals(menu[0])) {
					MemberController.getInstance().userAdd(member);
				}else {
					//new AdminController().staffAdd(member);
				}
			}
		});
		

		bottomPan = new JPanel();
		bottomPan.add(addBtn);
		
		add(topLab, "North");
		add(centerPan, "Center");
		add(bottomPan, "South");
	}


}