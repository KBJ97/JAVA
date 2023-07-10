package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class ComponentsTest {

	private JFrame frame;
	private JTextField txtUid;
	private JTextField txtName;
	private JTextField txtHp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentsTest window = new ComponentsTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ComponentsTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 510);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ComponentsTest");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel.setBounds(12, 10, 144, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btn1 = new JButton("확인");
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1 클릭...");
			}
		});
		
		btn1.setBounds(12, 60, 97, 23);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("확인2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼2 클릭...");
		}});
		btn2.setBounds(156, 60, 97, 23);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("확인3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int answer = JOptionPane.showConfirmDialog(null, "버튼3 클릭...","확인대화상자",JOptionPane.YES_NO_OPTION);
			if(answer == 0) {
				System.out.println("Yes 클릭...");
			}else {
				System.out.println("No 클릭...");
			}
			}
		});
		btn3.setBounds(290, 60, 97, 23);
		frame.getContentPane().add(btn3);
		
		JLabel lblNewLabel_1 = new JLabel("TextField 실습");
		lblNewLabel_1.setBounds(12, 93, 87, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Button 실습");
		lblNewLabel_2.setBounds(12, 31, 97, 29);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("아이디");
		lblNewLabel_3.setBounds(12, 126, 57, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("휴대폰");
		lblNewLabel_3_1.setBounds(12, 176, 57, 15);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("이름");
		lblNewLabel_3_2.setBounds(12, 151, 57, 15);
		frame.getContentPane().add(lblNewLabel_3_2);
		
		txtUid = new JTextField();
		txtUid.setBounds(66, 123, 116, 21);
		frame.getContentPane().add(txtUid);
		txtUid.setColumns(10);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(66, 145, 116, 21);
		frame.getContentPane().add(txtName);
		
		txtHp = new JTextField();
		
		txtHp.setColumns(10);
		txtHp.setBounds(66, 170, 116, 21);
		frame.getContentPane().add(txtHp);
		
		JLabel lbUid = new JLabel("결과 :");
		lbUid.setBounds(265, 126, 122, 15);
		frame.getContentPane().add(lbUid);
		
		JLabel lbName = new JLabel("결과 :");
		lbName.setBounds(265, 151, 122, 15);
		frame.getContentPane().add(lbName);
		
		JLabel lbHp = new JLabel("결과 :");
		lbHp.setBounds(265, 176, 122, 15);
		frame.getContentPane().add(lbHp);
		
		JButton btnUid = new JButton("확인");
		btnUid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uid = txtUid.getText();
				lbUid.setText("결과 : "+ uid);
			}
		});
		btnUid.setBounds(190, 122, 63, 23);
		frame.getContentPane().add(btnUid);
		
		JButton btnName = new JButton("확인");
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = txtName.getText();
				lbName.setText("결과 : "+ name);
			}
		});
		btnName.setBounds(190, 147, 63, 23);
		frame.getContentPane().add(btnName);
		
		JButton btnHp = new JButton("확인");
		btnHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String hp = txtHp.getText();
				lbHp.setText("결과 : "+ hp);
			}
		});
		btnHp.setBounds(190, 172, 63, 23);
		frame.getContentPane().add(btnHp);
		
		JCheckBox chk1 = new JCheckBox("사과");
		chk1.setBounds(12, 225, 57, 23);
		frame.getContentPane().add(chk1);
		
		JCheckBox chk2 = new JCheckBox("딸기");
		chk2.setBounds(73, 225, 57, 23);
		frame.getContentPane().add(chk2);
		
		JCheckBox chk3 = new JCheckBox("포도");
		chk3.setBounds(134, 225, 57, 23);
		frame.getContentPane().add(chk3);
		
		JCheckBox chk4 = new JCheckBox("수박");
		chk4.setBounds(196, 225, 57, 23);
		frame.getContentPane().add(chk4);
		
		JCheckBox chk5 = new JCheckBox("참외");
		chk5.setBounds(258, 225, 57, 23);
		frame.getContentPane().add(chk5);
		
		JLabel lbChkFruit = new JLabel("선택한 과일 :");
		lbChkFruit.setBounds(12, 259, 303, 15);
		frame.getContentPane().add(lbChkFruit);

		JButton btnChkFruit = new JButton("확인");
		btnChkFruit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> fruits = new ArrayList();
				
				if(chk1.isSelected()) {
					fruits.add(chk1.getText());
							
				}
				if(chk2.isSelected()) {
					fruits.add(chk2.getText());
							
				}
				if(chk3.isSelected()) {
					fruits.add(chk3.getText());
							
				}
				if(chk4.isSelected()) {
					fruits.add(chk4.getText());
							
				}
				if(chk5.isSelected()) {
					fruits.add(chk5.getText());
							
				}
				lbChkFruit.setText("선택한 과일 : "+ fruits);
			}
		});
		btnChkFruit.setBounds(324, 225, 63, 23);
		frame.getContentPane().add(btnChkFruit);
		
		JLabel lblNewLabel_4 = new JLabel("CheckBox 실습");
		lblNewLabel_4.setBounds(12, 204, 97, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("RadioButton 실습");
		lblNewLabel_5.setBounds(12, 294, 118, 15);
		frame.getContentPane().add(lblNewLabel_5);
		
		JRadioButton rdMale = new JRadioButton("남자");
		rdMale.setBounds(12, 324, 68, 23);
		frame.getContentPane().add(rdMale);
		
		JRadioButton rdFemale = new JRadioButton("여자");
		rdFemale.setBounds(88, 324, 68, 23);
		frame.getContentPane().add(rdFemale);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdMale);
		bg.add(rdFemale);
		
		
		JLabel lbGender = new JLabel("선택결과 :");
		lbGender.setBounds(12, 364, 97, 15);
		frame.getContentPane().add(lbGender);
		
		JButton btnGender = new JButton("확인");
		btnGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<String> gender = new ArrayList();
				
				if(rdMale.isSelected()) {
					lbGender.setText("선택결과 : " + rdMale.getText());
				}else {
					lbGender.setText("선택결과 : " + rdFemale.getText());
				}
				}});
		btnGender.setBounds(180, 324, 97, 23);
		frame.getContentPane().add(btnGender);
		
		
		
	}
}
