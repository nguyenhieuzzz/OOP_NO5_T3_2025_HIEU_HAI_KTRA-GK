public class khachHang {
    private String maKhachHang;
    private String hoTen;
    private String soDienThoai;
    private String hangThanhVien;

    public khachHang(String maKhachHang, String hoTen, String soDienThoai, String hangThanhVien) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.hangThanhVien = hangThanhVien;
    }

    // Getters & Setters
    public String getMaKhachHang() { return maKhachHang; }
    public void setMaKhachHang(String maKhachHang) { this.maKhachHang = maKhachHang; }

    public String getHoTen() { return hoTen; }
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }

    public String getSoDienThoai() { return soDienThoai; }
    public void setSoDienThoai(String soDienThoai) { this.soDienThoai = soDienThoai; }

    public String getHangThanhVien() { return hangThanhVien; }
    public void setHangThanhVien(String hangThanhVien) { this.hangThanhVien = hangThanhVien; }

    @Override
    public String toString() {
        return "Khách hàng: " + hoTen + " (" + maKhachHang + "), SĐT: " + soDienThoai + ", Hạng: " + hangThanhVien;
    }
}
