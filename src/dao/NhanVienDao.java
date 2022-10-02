package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.NhanVien;


public class NhanVienDao {
	
	private Connection con;
	
	public NhanVienDao(Connection con) {
		this.con = con;
	}
	public void themNhanvien(NhanVien nv) throws SQLException {
		
		String insert = "Insert into NhanVien values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement stmt = con.prepareStatement(insert);
		stmt.setString(1, nv.getMaNhanVien());
		int day = nv.getNgaySinh().getDay();
		int month = nv.getNgaySinh().getMonth();
		int year = nv.getNgaySinh().getYear();
		stmt.setString(4, year + "-" + month + "-" + day);
		stmt.setString(3, nv.getHoTenNhanVien());
		stmt.setString(4, nv.getcCCD());
		stmt.setString(5, nv.getDiaChi());
		stmt.setString(6, nv.getsDT());
		stmt.setBoolean(7, nv.isGioiTinh());
		stmt.setString(8, nv.getEmail());
		stmt.setBoolean(9, nv.isChucVu());
		stmt.setBoolean(10, nv.isCaLamViec());
		stmt.setString(11, nv.getHinhAnh());
		stmt.executeUpdate();
	}
	
	public NhanVien timNhanvien(String maNV) {
		return null;
	}
	public boolean xoaNhanvien(String maNV) {
		
		return false;
	}
	public boolean capnhatNhanvien(NhanVien nvNew) {
		
		return false;
	}
	public List<NhanVien> getDSNhanVien() throws SQLException{
		List<NhanVien> dsnv = new ArrayList<>();
		String sql = "Select * from NhanVien";
		PreparedStatement stmt = con.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			NhanVien nv = new NhanVien(rs.getString("maNhanVien"),
					rs.getString("hoTenNhanVien"), 
					rs.getDate("ngaySinh"), 
					rs.getString("cCCD"), 
					rs.getString("diaChi"),
					rs.getString("sdt"),
					rs.getBoolean("gioiTinh"),
					rs.getString("email"),
					rs.getBoolean("chucVu"),
					rs.getBoolean("caLamViec"),
					rs.getString("hinhAnh"));
			dsnv.add(nv);
		}
		
		return dsnv;
	}
}



