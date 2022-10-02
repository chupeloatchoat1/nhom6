package service.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import dao.NhanVienDao;
import entity.NhanVien;
import service.NhanVienService;

public class NhanVienServiceImpl implements NhanVienService{
	private NhanVienDao nhanVienDao;
	
	public NhanVienServiceImpl(Connection con) {
		nhanVienDao = new NhanVienDao(con);
	}

	@Override
	public void themNhanVien(NhanVien nv) throws SQLException {
		// TODO Auto-generated method stub
		nhanVienDao.themNhanvien(nv);
	}

	@Override
	public NhanVien timNhanVien(String maNV) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean xoaNhanVien(String maNV) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean capnhatNhanVien(NhanVien nvNew) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<NhanVien> getDSNhanVien() throws SQLException {
		// TODO Auto-generated method stub
		return nhanVienDao.getDSNhanVien();
	}


}
