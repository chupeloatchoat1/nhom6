package service;

import java.sql.SQLException;
import java.util.List;
import entity.NhanVien;


public interface NhanVienService {
	public void themNhanVien(NhanVien nv) throws SQLException;
	public NhanVien timNhanVien(String maNV) throws SQLException;
	public boolean xoaNhanVien(String maNV) throws SQLException;
	public boolean capnhatNhanVien(NhanVien nvNew) throws SQLException;
	public List<NhanVien> getDSNhanVien() throws SQLException;
}
