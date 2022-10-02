package entity;

import java.util.Date;

public class HoaDon {
	private String maHoaDon;
	private NhanVien nhanVien;
	private KhachHang khachHang;
	private Date ngayLapHoaDon;
	private String ghiChu;
	private float vat;
	private float tienKhachDua;
	private boolean tinhTrang;
	public String getMaHoaDon() {
		return maHoaDon;
	}
	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}
	public NhanVien getNhanVien() {
		return nhanVien;
	}
	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	public KhachHang getKhachHang() {
		return khachHang;
	}
	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	public Date getNgayLapHoaDon() {
		return ngayLapHoaDon;
	}
	public void setNgayLapHoaDon(Date ngayLapHoaDon) {
		this.ngayLapHoaDon = ngayLapHoaDon;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	public float getVat() {
		return vat;
	}
	public void setVat(float vat) {
		this.vat = vat;
	}
	public float getTienKhachDua() {
		return tienKhachDua;
	}
	public void setTienKhachDua(float tienKhachDua) {
		this.tienKhachDua = tienKhachDua;
	}
	public boolean isTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	public HoaDon(String maHoaDon, NhanVien nhanVien, KhachHang khachHang, Date ngayLapHoaDon, String ghiChu, float vat,
			float tienKhachDua, boolean tinhTrang) {
		super();
		this.maHoaDon = maHoaDon;
		this.nhanVien = nhanVien;
		this.khachHang = khachHang;
		this.ngayLapHoaDon = ngayLapHoaDon;
		this.ghiChu = ghiChu;
		this.vat = vat;
		this.tienKhachDua = tienKhachDua;
		this.tinhTrang = tinhTrang;
	}
	public HoaDon() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "HoaDon [maHoaDon=" + maHoaDon + ", nhanVien=" + nhanVien + ", khachHang=" + khachHang
				+ ", ngayLapHoaDon=" + ngayLapHoaDon + ", ghiChu=" + ghiChu + ", vat=" + vat + ", tienKhachDua="
				+ tienKhachDua + ", tinhTrang=" + tinhTrang + "]";
	}
	
	
	
}
