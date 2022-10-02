package entity;

import java.util.Date;

public class NhanVien {
	private String maNhanVien;
	private String hoTenNhanVien;
	private Date ngaySinh;
	private String cCCD;
	private String diaChi;
	private String sDT;
	private boolean gioiTinh;
	private String email;
	private boolean chucVu;
	private boolean caLamViec;
	private String hinhAnh;
	
	
	public NhanVien() {
		super();
	}
	public NhanVien(String maNhanVien) {
		super();
		this.maNhanVien = maNhanVien;
		
	}
	public String getMaNhanVien() {
		return maNhanVien;
	}
	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}
	public String getHoTenNhanVien() {
		return hoTenNhanVien;
	}
	public void setHoTenNhanVien(String hoTenNhanVien) {
		this.hoTenNhanVien = hoTenNhanVien;
	}
	public NhanVien(String maNhanVien, String hoTenNhanVien, Date ngaySinh, String cCCD, String diaChi, String sDT,
			boolean gioiTinh, String email, boolean chucVu, boolean caLamViec, String hinhAnh) {
		super();
		this.maNhanVien = maNhanVien;
		this.hoTenNhanVien = hoTenNhanVien;
		this.ngaySinh = ngaySinh;
		this.cCCD = cCCD;
		this.diaChi = diaChi;
		this.sDT = sDT;
		this.gioiTinh = gioiTinh;
		this.email = email;
		this.chucVu = chucVu;
		this.caLamViec = caLamViec;
		this.hinhAnh = hinhAnh;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getcCCD() {
		return cCCD;
	}
	public void setcCCD(String cCCD) {
		this.cCCD = cCCD;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getsDT() {
		return sDT;
	}
	public void setsDT(String sDT) {
		this.sDT = sDT;
	}
	public boolean isGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isChucVu() {
		return chucVu;
	}
	public void setChucVu(boolean chucVu) {
		this.chucVu = chucVu;
	}
	public boolean isCaLamViec() {
		return caLamViec;
	}
	public void setCaLamViec(boolean caLamViec) {
		this.caLamViec = caLamViec;
	}
	public String getHinhAnh() {
		return hinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
	@Override
	public String toString() {
		return "NhanVien [maNhanVien=" + maNhanVien + ", hoTenNhanVien=" + hoTenNhanVien + ", ngaySinh=" + ngaySinh
				+ ", cCCD=" + cCCD + ", diaChi=" + diaChi + ", sDT=" + sDT + ", gioiTinh=" + gioiTinh + ", email="
				+ email + ", chucVu=" + chucVu + ", caLamViec=" + caLamViec + ", hinhAnh=" + hinhAnh + "]";
	}
	
	
	
}
