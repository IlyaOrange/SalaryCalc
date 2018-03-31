package SalaryCalc;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class intro extends JFrame {
	// Создаем окно калькулятора:
	JFrame frame = new JFrame("Калькулятор расчета количества символов");
	static JPanel panel = new JPanel();
	
	// Создаем кнопку для подсчета символов:
	JButton kopirButton = new JButton("Копирайтер");
	static JButton zakazchButton = new JButton("Заказчик");
	JButton exitButton = new JButton("Выход");
	JLabel label=new JLabel("Выберите пользователя:"); //надпись № 1
	
	intro() {
		super("Калькулятор расчета количества символов");
		// Завершение программы при закрытии окна:
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setLocationRelativeTo(null); //разместить по середине экрана форму frame 

		// Установка размеров окна и расположение элементов:
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
		// Создаем объект класса Counter (калькулятора):
	intro rgr = new intro();
		// Запускаем окно калькулятора:
		rgr.setVisible(true);
	}
}