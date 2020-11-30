package application;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Calculator {

	private JFrame ramka = new JFrame("Kalkulator");
	private JTextArea klawiatura = new JTextArea();
	private JTextArea ekran = new JTextArea();
	
	private JButton button1 = new JButton("0");
	private JButton button2 = new JButton("1");
	private JButton button3 = new JButton("2");
	private JButton button4 = new JButton("3");
	private JButton button5 = new JButton("4");
	private JButton button6 = new JButton("5");
	private JButton button7 = new JButton("6");
	private JButton button8 = new JButton("7");
	private JButton button9 = new JButton("8");
	private JButton button10 = new JButton("9");
	
	private JButton przyciskDzielenia = new JButton("/");
	private JButton przyciskMnozenia = new JButton("*");
	private JButton przyciskDodawania = new JButton("+");
	private JButton przyciskOdejmowania = new JButton("-");
	private JButton przyciskRownania = new JButton("=");
	private JButton przyciskCzyszczenia = new JButton("C");
	
	public Calculator() {		
			ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // default close operation
			ramka.setSize(400,550); // calculator size
			ramka.setResizable(false);
			ramka.setLayout(null); 						
			
			klawiatura.setSize(380,50);
			klawiatura.setLocation(7,5);
			
			
			
			przyciskRownania.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String rownanie;
					int liczba1,liczba2;					
					rownanie = klawiatura.getText();
					rownanie = rownanie.replaceAll("\\s+","");
		            String[] ciagRownanie = rownanie.split(""); 
		            liczba1 = Integer.parseInt(ciagRownanie[0]);
		            liczba2 = Integer.parseInt(ciagRownanie[2]);
		            if(ciagRownanie[1].equals("+"))
		               {                    
		                     Dodawanie d = new Dodawanie();
		                     d.setLiczba1(liczba1);
		                     d.setLiczba2(liczba2);
		                     d.liczRownanie();
		               }
					
				}
			});
			
			stworzPrzyciski();
			pokazPrzyciski();
			dodajPrzyciski();
			
			
			ramka.setVisible(true);
	}
	
private void stworzPrzyciski() {
		
			button1.setSize(100,50);
			button1.setLocation(169,299);
			button2.setSize(100,50);
			button2.setLocation(169,450);
			button3.setSize(100,50);
			button3.setLocation(69,450);
			button4.setSize(100,50);
			button4.setLocation(270,399);
			button5.setSize(100,50);
			button5.setLocation(169,399);
			button6.setSize(100,50);
			button6.setLocation(69,399);
			button7.setSize(100,50);
			button7.setLocation(270,349);
			button8.setSize(100,50);
			button8.setLocation(169,349);
			button9.setSize(100,50);
			button9.setLocation(69,349);
			button10.setSize(100,50);
			button10.setLocation(270,299);
			przyciskCzyszczenia.setSize(100,50);
			przyciskCzyszczenia.setLocation(69, 299);
			przyciskDzielenia.setSize(100,50);;
			przyciskDzielenia.setLocation(270,220);
			przyciskMnozenia.setSize(100,50);
			przyciskMnozenia.setLocation(169,220);
			przyciskDodawania.setSize(100,50);
			przyciskDodawania.setLocation(69,220);
			przyciskOdejmowania.setSize(100,50);
			przyciskOdejmowania.setLocation(270,170);	
			przyciskRownania.setSize(100,50);
			przyciskRownania.setLocation(270,450);
					
			
	}

private void dodajPrzyciski() {
		
	ramka.add(klawiatura);
	ramka.add(ekran);
	ramka.add(przyciskCzyszczenia);
	ramka.add(przyciskRownania);
	ramka.add(button1);
	ramka.add(button2);
	ramka.add(button3);
	ramka.add(button4);
	ramka.add(button5);
	ramka.add(button6);
	ramka.add(button7);
	ramka.add(button8);
	ramka.add(button9);
	ramka.add(button10);
	ramka.add(przyciskDzielenia);
	ramka.add(przyciskMnozenia);
	ramka.add(przyciskDodawania);
	ramka.add(przyciskOdejmowania);
			
}

private void pokazPrzyciski() {
	
	button10.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			klawiatura.append("9");
		}
	});
	
	
	button9.addActionListener(new ActionListener() {
		
		
		public void actionPerformed(ActionEvent e) {
			klawiatura.append("8");
		}
	});
	
	
	button8.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			klawiatura.append("7");
		}
	});
	
	
	button7.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			klawiatura.append("6");
		}
	});
	
		button6.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			klawiatura.append("5");
		}
	});
		
		button5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				klawiatura.append("4");
			}
		});
		
		
		button4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				klawiatura.append("3");
			}
		});
		
		
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				klawiatura.append("2");
			}
		});
		
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				klawiatura.append("1");
			}
		});
		
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				klawiatura.append("0");
			}
		});
		
		
		przyciskDzielenia.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				klawiatura.append("/");
			}
		});
		
		
		przyciskMnozenia.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				klawiatura.append("*");
			}
		});
		
		
		przyciskDodawania.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				klawiatura.append("+");
			}
		});
		
		
		przyciskDzielenia.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				klawiatura.append("-");
			}
		});
				
		przyciskCzyszczenia.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				klawiatura.setText("");
			}
		});
		
		
		};					
			
	
	
public static void main(String[] args) {
		
		new Calculator(); 

	}
}
