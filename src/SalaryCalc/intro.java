package SalaryCalc;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class intro extends JFrame {
	// ������� ���� ������������:
	JFrame frame = new JFrame("����������� ������� ���������� ��������");
	static JPanel panel = new JPanel();
	
	// ������� ������ ��� �������� ��������:
	JButton kopirButton = new JButton("����������");
	static JButton zakazchButton = new JButton("��������");
	JButton exitButton = new JButton("�����");
	JLabel label=new JLabel("�������� ������������:"); //������� � 1
	
	intro() {
		super("����������� ������� ���������� ��������");
		// ���������� ��������� ��� �������� ����:
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setLocationRelativeTo(null); //���������� �� �������� ������ ����� frame 

		// ��������� �������� ���� � ������������ ���������:
		  setSize(500, 200); 
		  panel.setBackground(new Color(255,255,255));   
		  panel.setLayout(new FlowLayout()); 
		  exitButton.setBackground(new Color(255,190,210)); 
		
          panel.add(label);
          panel.add(kopirButton); 
          panel.add(zakazchButton);
          panel.add(exitButton);
          add(panel);
          
          kopirButton.addActionListener(new formalasta());
			zakazchButton.addActionListener(new klient());
		
	exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				}
		}); 
	}
	public static void main(String[] args) {
		// ������� ������ ������ Counter (������������):
	intro rgr = new intro();
		// ��������� ���� ������������:
		rgr.setVisible(true);
	}
}