public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("sp");

        khachHang kh = new khachHang("KH01", "Nguyễn Văn A", "0123456789", "Vàng");
        System.out.println("Mã KH: " + kh.getMaKhachHang());

        Book.test(); // Gọi phương thức test của Book
    }
}
