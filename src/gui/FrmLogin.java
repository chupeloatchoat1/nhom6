package gui;

import java.awt.EventQueue;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;

public class FrmLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtTenDangNhap;
	private JTextField txtMatKhau;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmLogin frame = new FrmLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public int GetMaxWidth() {
		return GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().width;
	}

	public int GetMaxHeight() {
		return GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().height;
	}

	// set the MAXIMUM size....

	public FrmLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setSize();
		setBounds(GetMaxWidth() / 4, GetMaxHeight() / 4, GetMaxWidth() / 2, GetMaxHeight() / 2);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 206, 209));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTieuDe = new JLabel("HỆ THỐNG QUẢN LÝ SÁCH");
		lblTieuDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblTieuDe.setForeground(Color.RED);
		lblTieuDe.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblTieuDe.setBounds(0, 11, 944, 69);
		contentPane.add(lblTieuDe);

		JButton btnDangNhap = new JButton("Đăng nhập");
		btnDangNhap.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDangNhap.setForeground(new Color(255, 255, 0));
		btnDangNhap.setBackground(new Color(30, 144, 255));
		btnDangNhap.setBounds(592, 342, 137, 48);
		contentPane.add(btnDangNhap);

		JButton btnQuenMatKhau = new JButton("Quên mật khẩu");
		btnQuenMatKhau.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnQuenMatKhau.setBackground(new Color(30, 144, 255));
		btnQuenMatKhau.setForeground(new Color(255, 255, 0));
		btnQuenMatKhau.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnQuenMatKhau.setBounds(750, 342, 137, 48);
		contentPane.add(btnQuenMatKhau);

		txtTenDangNhap = new JTextField();
		txtTenDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtTenDangNhap.setForeground(new Color(255, 255, 0));
		txtTenDangNhap.setBackground(new Color(0, 0, 128));
		txtTenDangNhap.setText("Tên đăng nhập");
		txtTenDangNhap.setBounds(650, 136, 237, 55);
		contentPane.add(txtTenDangNhap);
		txtTenDangNhap.setColumns(10);

		txtMatKhau = new JPasswordField();
		txtMatKhau.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtMatKhau.setForeground(new Color(255, 255, 0));
		txtMatKhau.setBackground(new Color(0, 0, 128));
		txtMatKhau.setText("Mật khẩu");
		txtMatKhau.setBounds(650, 236, 237, 55);
		contentPane.add(txtMatKhau);
		txtMatKhau.setColumns(10);

		JPanel panel_UserIcon = new JPanel();
		panel_UserIcon.setBackground(new Color(0, 0, 128));
		panel_UserIcon.setBounds(591, 136, 61, 55);
		contentPane.add(panel_UserIcon);
		panel_UserIcon.setLayout(null);

		JLabel lbl_UserIcon = new JLabel("");
		lbl_UserIcon.setForeground(new Color(0, 0, 0));
		lbl_UserIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_UserIcon.setIcon(new ImageIcon(
				Toolkit.getDefaultToolkit().createImage(FrmLogin.class.getResource("..\\gui\\icon\\woman.png"))));
		lbl_UserIcon.setBounds(10, 11, 41, 33);
		panel_UserIcon.add(lbl_UserIcon);

		JPanel panel_PassIcon = new JPanel();
		panel_PassIcon.setBackground(new Color(0, 0, 128));
		panel_PassIcon.setBounds(592, 236, 60, 55);
		contentPane.add(panel_PassIcon);
		panel_PassIcon.setLayout(null);

		JLabel lbl_PassIcon = new JLabel("");
		lbl_PassIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_PassIcon.setIcon(new ImageIcon(
				Toolkit.getDefaultToolkit().createImage(FrmLogin.class.getResource("..\\gui\\icon\\lock.png"))));
		lbl_PassIcon.setBounds(10, 11, 40, 33);
		panel_PassIcon.add(lbl_PassIcon);

		JLabel lblBackgorund = new JLabel("");
		lblBackgorund.setIcon(
				new ImageIcon(FrmLogin.class.getResource("/gui/icon/open-book-with-nature-landscape_1308-97237.jpg")));
		lblBackgorund.setBounds(24, 79, 540, 384);
		contentPane.add(lblBackgorund);
		
		
		contentPane.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				txtMatKhau.setText("Mật khẩu");
				txtTenDangNhap.setText("Tên đăng nhập");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		txtMatKhau.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				txtMatKhau.setText("");
				if(txtTenDangNhap.getText().trim().equals("")) {
					txtTenDangNhap.setText("Tên đăng nhập");
				}
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		txtTenDangNhap.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				txtTenDangNhap.setText("");
				if(txtMatKhau.getText().trim().equals("")) {
					txtMatKhau.setText("Mật khẩu");
				}
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
