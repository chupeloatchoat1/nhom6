package gui;

import java.awt.GraphicsEnvironment;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class PnThongKe extends JPanel {

	/**
	 * Create the panel.
	 */
	
	
	public int GetMaxWidth() {
		return GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().width;
	}

	public int GetMaxHeight() {
		return GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().height;
	}
	
	public PnThongKe() {
		setLayout(null);
		setSize(1900, 800);
		JTabbedPane tabbedPaneThongKe = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneThongKe.setFont(new Font("Tahoma", Font.BOLD, 14));
		tabbedPaneThongKe.setBounds(27, 79, 1862, 800);
		add(tabbedPaneThongKe);
		
		JPanel panelThongKeDoanhThu = new JPanel();
		panelThongKeDoanhThu.setBackground(new Color(0, 206, 209));
		tabbedPaneThongKe.addTab("Thống kê doanh thu", null, panelThongKeDoanhThu, null);
		panelThongKeDoanhThu.setLayout(null);
		
		JLabel lblFrom = new JLabel("Từ ngày: ");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFrom.setBounds(60, 80, 77, 32);
		panelThongKeDoanhThu.add(lblFrom);
		
		JLabel lblTo = new JLabel("Đến ngày: ");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTo.setBounds(320, 80, 92, 32);
		panelThongKeDoanhThu.add(lblTo);
		
		JLabel lblLocTheo = new JLabel("Lọc theo: ");
		lblLocTheo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblLocTheo.setBounds(60, 163, 77, 32);
		panelThongKeDoanhThu.add(lblLocTheo);
		
		JPanel panelThongKeKhachHang = new JPanel();
		panelThongKeKhachHang.setBackground(new Color(0, 206, 209));
		tabbedPaneThongKe.addTab("Thống kê khách hàng", null, panelThongKeKhachHang, null);
		panelThongKeKhachHang.setLayout(null);
		
		JPanel panelThongKeSanPham = new JPanel();
		panelThongKeSanPham.setBackground(new Color(0, 206, 209));
		tabbedPaneThongKe.addTab("Thống kê sản phẩm", null, panelThongKeSanPham, null);
		panelThongKeSanPham.setLayout(null);
		
		JLabel txtTieuDe = new JLabel("THỐNG KÊ");
		txtTieuDe.setForeground(new Color(0, 191, 255));
		txtTieuDe.setHorizontalAlignment(SwingConstants.CENTER);
		txtTieuDe.setFont(new Font("Tahoma", Font.BOLD, 26));
		txtTieuDe.setBounds(0, 11, 1920, 51);
		add(txtTieuDe);
		
	}
}
