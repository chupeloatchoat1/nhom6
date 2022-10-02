package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GraphicsEnvironment;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;

public class FrmNhanVien extends JFrame {
	private boolean flag_TK = false;
	private boolean flag_HD = false;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmNhanVien frame = new FrmNhanVien();
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
	public FrmNhanVien() {
		setTitle("QUAN LY HIEU SACH");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 1109, 786);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setBounds(0,0, GetMaxWidth(), GetMaxHeight());

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//home
		JPanel panelTrangChu = new JPanel();
		panelTrangChu.setBounds(0, 0, GetMaxWidth()/7, GetMaxHeight()/20);
		panelTrangChu.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		contentPane.add(panelTrangChu);
		panelTrangChu.setLayout(null);
		
		JLabel lblHomeIcon = new JLabel("Trang chủ");
		lblHomeIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblHomeIcon.setIcon(new ImageIcon(FrmQuanLy.class.getResource("/gui/icon/house.png")));
		lblHomeIcon.setBounds(10, 11, 220, 28);
		panelTrangChu.add(lblHomeIcon);
		//khachhang
		JPanel panelKhachHang = new JPanel();
		panelKhachHang.setLayout(null);
		panelKhachHang.setBounds(GetMaxWidth()/7,0 , GetMaxWidth()/7, GetMaxHeight()/20);
		panelKhachHang.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		contentPane.add(panelKhachHang);
		
		JLabel lblKhachHangIcon = new JLabel("Quản lý khách hàng");
		lblKhachHangIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblKhachHangIcon.setIcon(new ImageIcon(FrmQuanLy.class.getResource("/gui/icon/rating.png")));
		lblKhachHangIcon.setBounds(10, 11, 220, 28);
		panelKhachHang.add(lblKhachHangIcon);
		//hoadon
		JPanel panelHoaDon = new JPanel();
		panelHoaDon.setLayout(null);
		panelHoaDon.setBounds(GetMaxWidth()*2/7, 0, GetMaxWidth()/7, GetMaxHeight()/20);
		panelHoaDon.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		contentPane.add(panelHoaDon);
		
		JLabel lblHoaDonIcon = new JLabel("Quản lý hóa đơn");
		lblHoaDonIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblHoaDonIcon.setIcon(new ImageIcon(FrmQuanLy.class.getResource("/gui/icon/package.png")));
		lblHoaDonIcon.setBounds(10, 11, 220, 28);
		panelHoaDon.add(lblHoaDonIcon);
		//sanpham
		JPanel panelSanPham = new JPanel();
		panelSanPham.setLayout(null);
		panelSanPham.setBounds(GetMaxWidth()*3/7,0 , 275, GetMaxHeight()/20);
		panelSanPham.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		contentPane.add(panelSanPham);
		
		JLabel lblSanPhamIcon = new JLabel("Quản lý sản phẩm");
		lblSanPhamIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblSanPhamIcon.setIcon(new ImageIcon(FrmQuanLy.class.getResource("/gui/icon/product.png")));
		lblSanPhamIcon.setBounds(29, 11,220, 28);
		panelSanPham.add(lblSanPhamIcon);
		//thongke
		JPanel panelThongKe = new JPanel();
		panelThongKe.setLayout(null);
		panelThongKe.setBounds(GetMaxWidth()*4/7,0, 274, GetMaxHeight()/20);
		panelThongKe.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		contentPane.add(panelThongKe);
		
		JLabel lblThongKeIcon = new JLabel("Thống kê");
		lblThongKeIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblThongKeIcon.setIcon(new ImageIcon(FrmQuanLy.class.getResource("/gui/icon/pie-chart.png")));
		lblThongKeIcon.setBounds(30, 11, 220, 28);
		panelThongKe.add(lblThongKeIcon);

		//trogiup
		JPanel panelTroGiup = new JPanel();
		panelTroGiup.setLayout(null);
		panelTroGiup.setBounds(GetMaxWidth()*5/7, 0, GetMaxWidth()/7, GetMaxHeight()/20);
		panelTroGiup.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		contentPane.add(panelTroGiup);
		
		JLabel lblTroGiupIcon = new JLabel("Trợ giúp");
		lblTroGiupIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblTroGiupIcon.setIcon(new ImageIcon(FrmQuanLy.class.getResource("/gui/icon/help-desk.png")));
		lblTroGiupIcon.setBounds(24, 11,220, 28);
		panelTroGiup.add(lblTroGiupIcon);
		//taikhoan
		JPanel panelTaiKhoan = new JPanel();
		panelTaiKhoan.setLayout(null);
		panelTaiKhoan.setBounds(GetMaxWidth()*6/7, 0, GetMaxWidth()/7, GetMaxHeight()/20);
		panelTaiKhoan.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		contentPane.add(panelTaiKhoan);
		
		JLabel lblTaiKhoanIcon = new JLabel("Tài khoản");
		lblTaiKhoanIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblTaiKhoanIcon.setIcon(new ImageIcon(FrmQuanLy.class.getResource("/gui/icon/user.png")));
		lblTaiKhoanIcon.setBounds(10, 11, 220, 28);
		panelTaiKhoan.add(lblTaiKhoanIcon);
		//menu taikhoan
		JPanel panelMenuTaiKhoan = new JPanel();
		panelMenuTaiKhoan.setBounds(1645, 49, 259, 62);
		contentPane.add(panelMenuTaiKhoan);
		panelMenuTaiKhoan.setLayout(null);
		
		JPanel panelXemThongTin = new JPanel();
		panelXemThongTin.setBounds(0, 0, 259, 31);
		panelMenuTaiKhoan.add(panelXemThongTin);
		panelXemThongTin.setLayout(null);
		panelXemThongTin.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		
		
		JLabel lblXemThongTinTaiKhoan = new JLabel("Xem thông tin ");
		lblXemThongTinTaiKhoan.setBounds(0, 0, 259, 31);
		panelXemThongTin.add(lblXemThongTinTaiKhoan);
		lblXemThongTinTaiKhoan.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblXemThongTinTaiKhoan.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		JPanel panelDangXuat = new JPanel();
		panelDangXuat.setBounds(0, 31, 259, 31);
		panelMenuTaiKhoan.add(panelDangXuat);
		panelDangXuat.setLayout(null);
		panelDangXuat.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		
		JLabel lblDangXuat = new JLabel("Đăng xuất");
		lblDangXuat.setBounds(0, 0, 259, 31);
		panelDangXuat.add(lblDangXuat);
		lblDangXuat.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDangXuat.setHorizontalAlignment(SwingConstants.CENTER);
		//menu hoadon
		JPanel panelMenuHoaDon = new JPanel();
		panelMenuHoaDon.setLayout(null);
		panelMenuHoaDon.setBounds(548, 49, 274, 62);
		contentPane.add(panelMenuHoaDon);
		
		JPanel panelTaoHoaDonMoi = new JPanel();
		panelTaoHoaDonMoi.setBounds(0, 0, 274, 31);
		panelMenuHoaDon.add(panelTaoHoaDonMoi);
		panelTaoHoaDonMoi.setLayout(null);
		panelTaoHoaDonMoi.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		
		JLabel lblQuanLyHoaDon = new JLabel("Quản lý hóa đơn");
		lblQuanLyHoaDon.setBounds(0, 0, 274, 31);
		panelTaoHoaDonMoi.add(lblQuanLyHoaDon);
		lblQuanLyHoaDon.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuanLyHoaDon.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JPanel panelQuanLyHoaDon = new JPanel();
		panelQuanLyHoaDon.setBounds(0, 31, 274, 31);
		panelMenuHoaDon.add(panelQuanLyHoaDon);
		panelQuanLyHoaDon.setLayout(null);
		panelQuanLyHoaDon.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		
		JLabel lbl_HoaDonMoi = new JLabel("Tạo hóa đơn mới");
		lbl_HoaDonMoi.setBounds(0, 0, 274, 31);
		panelQuanLyHoaDon.add(lbl_HoaDonMoi);
		lbl_HoaDonMoi.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_HoaDonMoi.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		//HOADON
		panelMenuHoaDon.setVisible(false);
		panelHoaDon.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

				panelMenuHoaDon.setVisible(true);
				panelMenuTaiKhoan.setVisible(false);
				if (flag_HD == false) {
					flag_HD = true;
					panelMenuHoaDon.setVisible(true);
					panelHoaDon.setBackground(Color.LIGHT_GRAY);
					panelTaiKhoan.setBackground(Color.getColor("#f0f0f0"));
					panelKhachHang.setBackground(Color.getColor("#f0f0f0"));
					panelThongKe.setBackground(Color.getColor("#f0f0f0"));
					panelTroGiup.setBackground(Color.getColor("#f0f0f0"));
					panelSanPham.setBackground(Color.getColor("#f0f0f0"));
					panelTrangChu.setBackground(Color.getColor("#f0f0f0"));
				} else {
					flag_HD = false;
					panelMenuHoaDon.setVisible(false);
					panelHoaDon.setBackground(Color.getColor("#f0f0f0"));
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				//panel_1.setVisible(false);

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
//				panel_1.setVisible(true);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
			
		});
		
		
		
		
		//TAIKHOAN
		panelMenuTaiKhoan.setVisible(false);
		panelTaiKhoan.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

				panelMenuTaiKhoan.setVisible(true);
				panelMenuHoaDon.setVisible(false);

				if (flag_TK == false) {
					flag_TK = true;
					panelMenuTaiKhoan.setVisible(true);
					panelTaiKhoan.setBackground(Color.LIGHT_GRAY);
					panelHoaDon.setBackground(Color.getColor("#f0f0f0"));
					panelKhachHang.setBackground(Color.getColor("#f0f0f0"));
					panelThongKe.setBackground(Color.getColor("#f0f0f0"));
					panelTroGiup.setBackground(Color.getColor("#f0f0f0"));
					panelHoaDon.setBackground(Color.getColor("#f0f0f0"));
					panelSanPham.setBackground(Color.getColor("#f0f0f0"));
					panelTrangChu.setBackground(Color.getColor("#f0f0f0"));
				} else {
					flag_TK = false;
					panelMenuTaiKhoan.setVisible(false);
					panelTaiKhoan.setBackground(Color.getColor("#f0f0f0"));
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				//panel_1.setVisible(false);

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				panelTaiKhoan.setVisible(true);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
		
		contentPane.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				flag_HD=false;
				flag_TK=false;
				panelMenuHoaDon.setVisible(false);
				panelMenuTaiKhoan.setVisible(false);
				
				panelTaiKhoan.setBackground(Color.getColor("#f0f0f0"));
				panelHoaDon.setBackground(Color.getColor("#f0f0f0"));
				panelKhachHang.setBackground(Color.getColor("#f0f0f0"));
				panelThongKe.setBackground(Color.getColor("#f0f0f0"));
				panelTroGiup.setBackground(Color.getColor("#f0f0f0"));
				panelHoaDon.setBackground(Color.getColor("#f0f0f0"));
				panelSanPham.setBackground(Color.getColor("#f0f0f0"));
				panelTrangChu.setBackground(Color.getColor("#f0f0f0"));
				
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
//		
		panelTrangChu.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				flag_HD=false;
				flag_TK=false;
				panelMenuHoaDon.setVisible(false);
				panelMenuTaiKhoan.setVisible(false);
				
				panelKhachHang.setBackground(Color.getColor("#f0f0f0"));
				panelThongKe.setBackground(Color.getColor("#f0f0f0"));
				panelTroGiup.setBackground(Color.getColor("#f0f0f0"));
				panelTaiKhoan.setBackground(Color.getColor("#f0f0f0"));
				panelHoaDon.setBackground(Color.getColor("#f0f0f0"));
				panelSanPham.setBackground(Color.getColor("#f0f0f0"));
				//panelTrangChu.setBackground(Color.getColor("#f0f0f0"));
				panelTrangChu.setBackground(Color.LIGHT_GRAY);
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
		panelKhachHang.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				flag_HD=false;
				flag_TK=false;
				panelMenuHoaDon.setVisible(false);
				panelMenuTaiKhoan.setVisible(false);
				//panelKhachHang.setBackground(Color.getColor("#f0f0f0"));
				panelThongKe.setBackground(Color.getColor("#f0f0f0"));
				panelTroGiup.setBackground(Color.getColor("#f0f0f0"));
				panelTaiKhoan.setBackground(Color.getColor("#f0f0f0"));
				panelHoaDon.setBackground(Color.getColor("#f0f0f0"));
				panelTrangChu.setBackground(Color.getColor("#f0f0f0"));
				panelSanPham.setBackground(Color.getColor("#f0f0f0"));
				panelKhachHang.setBackground(Color.LIGHT_GRAY);
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
		panelSanPham.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				flag_HD=false;
				flag_TK=false;
				panelMenuHoaDon.setVisible(false);
				panelMenuTaiKhoan.setVisible(false);
				panelKhachHang.setBackground(Color.getColor("#f0f0f0"));
				panelThongKe.setBackground(Color.getColor("#f0f0f0"));
				panelTroGiup.setBackground(Color.getColor("#f0f0f0"));
				panelTaiKhoan.setBackground(Color.getColor("#f0f0f0"));
				panelHoaDon.setBackground(Color.getColor("#f0f0f0"));
				panelTrangChu.setBackground(Color.getColor("#f0f0f0"));
				//panelSanPham.setBackground(Color.getColor("#f0f0f0"));
				panelSanPham.setBackground(Color.LIGHT_GRAY);
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
		panelThongKe.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				flag_HD=false;
				flag_TK=false;
				panelMenuHoaDon.setVisible(false);
				panelMenuTaiKhoan.setVisible(false);
				panelKhachHang.setBackground(Color.getColor("#f0f0f0"));
				//panelThongKe.setBackground(Color.getColor("#f0f0f0"));
				panelTroGiup.setBackground(Color.getColor("#f0f0f0"));
				panelTaiKhoan.setBackground(Color.getColor("#f0f0f0"));
				panelHoaDon.setBackground(Color.getColor("#f0f0f0"));
				panelTrangChu.setBackground(Color.getColor("#f0f0f0"));
				panelSanPham.setBackground(Color.getColor("#f0f0f0"));
				panelThongKe.setBackground(Color.LIGHT_GRAY);
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

		panelTroGiup.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				flag_HD=false;
				flag_TK=false;
				panelMenuHoaDon.setVisible(false);
				panelMenuTaiKhoan.setVisible(false);
				panelKhachHang.setBackground(Color.getColor("#f0f0f0"));
				panelThongKe.setBackground(Color.getColor("#f0f0f0"));
				//panelTroGiup.setBackground(Color.getColor("#f0f0f0"));
				panelTaiKhoan.setBackground(Color.getColor("#f0f0f0"));
				panelHoaDon.setBackground(Color.getColor("#f0f0f0"));
				panelTrangChu.setBackground(Color.getColor("#f0f0f0"));
				panelSanPham.setBackground(Color.getColor("#f0f0f0"));
				panelTroGiup.setBackground(Color.LIGHT_GRAY);
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
