package entity;

public class KhachHang {
	private String maKhachHang;
	private String hoTenKhachHang;
	private String sDT;
	private String diaChi;
	
	
	
	public String getMaKhachHang() {
		return maKhachHang;
	}



	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}



	public String getHoTenKhachHang() {
		return hoTenKhachHang;
	}



	public void setHoTenKhachHang(String hoTenKhachHang) {
		this.hoTenKhachHang = hoTenKhachHang;
	}



	public String getsDT() {
		return sDT;
	}



	public void setsDT(String sDT) {
		this.sDT = sDT;
	}



	public String getDiaChi() {
		return diaChi;
	}



	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}



	public KhachHang(String maKhachHang, String hoTenKhachHang, String sDT, String diaChi) {
		super();
		this.maKhachHang = maKhachHang;
		this.hoTenKhachHang = hoTenKhachHang;
		this.sDT = sDT;
		this.diaChi = diaChi;
	}



	public KhachHang() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "KhachHang [maKhachHang=" + maKhachHang + ", hoTenKhachHang=" + hoTenKhachHang + ", sDT=" + sDT
				+ ", diaChi=" + diaChi + "]";
	}
	
}
