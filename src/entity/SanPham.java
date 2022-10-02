package entity;

public class SanPham {
	private String maSanPham;
	private int soLuongTon;
	private NhaCungCap nhaCungCap;
	private long giaNhap;
	private String ghiChu;
	private double trongLuong;
	private String donViSanPham;
	private String hinhAnh;
	
	
	public SanPham() {
		super();
		
	}
	public SanPham(String maSanPham) {
		super();
		this.maSanPham = maSanPham;
		
	}
	

	public SanPham(String maSanPham, int soLuongTon, NhaCungCap nhaCungCap, long giaNhap, String ghiChu,
			double trongLuong, String donViSanPham, String hinhAnh) {
		super();
		this.maSanPham = maSanPham;
		this.soLuongTon = soLuongTon;
		this.nhaCungCap = nhaCungCap;
		this.giaNhap = giaNhap;
		this.ghiChu = ghiChu;
		this.trongLuong = trongLuong;
		this.donViSanPham = donViSanPham;
		this.hinhAnh = hinhAnh;
	}
	public String getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}
	public int getSoLuongTon() {
		return soLuongTon;
	}
	public void setSoLuongTon(int soLuongTon) {
		this.soLuongTon = soLuongTon;
	}
	public NhaCungCap getNhaCungCap() {
		return nhaCungCap;
	}
	public void setNhaCungCap(NhaCungCap nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}
	public long getGiaNhap() {
		return giaNhap;
	}
	public void setGiaNhap(long giaNhap) {
		this.giaNhap = giaNhap;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	public double getTrongLuong() {
		return trongLuong;
	}
	public void setTrongLuong(double trongLuong) {
		this.trongLuong = trongLuong;
	}
	public String getHinhAnh() {
		return hinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
	public String getDonViSanPham() {
		return donViSanPham;
	}
	public void setDonViSanPham(String donViSanPham) {
		this.donViSanPham = donViSanPham;
	}
	@Override
	public String toString() {
		return "SanPham [maSanPham=" + maSanPham + ", soLuongTon=" + soLuongTon + ", nhaCungCap=" + nhaCungCap
				+ ", giaNhap=" + giaNhap + ", ghiChu=" + ghiChu + ", trongLuong=" + trongLuong + ", donViSanPham="
				+ donViSanPham + "]";
	}
	
	
}
