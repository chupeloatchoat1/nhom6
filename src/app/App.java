package app;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

import entity.NhanVien;
import service.NhanVienService;
import service.impl.NhanVienServiceImpl;
import db.DBConnection;

public class App {
	public static void main(String[] args) {
		
		Connection con = DBConnection.getInstance().getConnection();
		NhanVienService nhanVienService = new NhanVienServiceImpl(con);
		
		try {
//			NhanVien nv = new NhanVien();
//			nv = new NhanVien("NV150406", "Nguyen Anh Tuan",new Date(2002,29,11),"050200012343","62/20k To 18 Ap 3 Xuan Thoi Thuong","0908917288",true, "nat@gmail.com", false, false,"nat.jpg");
//			nhanVienService.themNhanVien(nv);
			
//			(String maNhanVien, String hoTenNhanVien, Date ngaySinh, String cCCD, String diaChi, String sDT,
//					boolean gioiTinh, String email, boolean chucVu, boolean caLamViec, String hinhAnh) 
			nhanVienService.getDSNhanVien().forEach(nv1 -> System.out.println(nv1));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}