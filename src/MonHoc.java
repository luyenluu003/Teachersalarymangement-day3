import java.util.Scanner;

public class MonHoc {
    Scanner sc = new Scanner(System.in);
    private static int nextId = 100;
    private int idMonHoc;
    private String tenMonHoc;
    private int tongSoTiet;
    private int soTietLyThuyet;
    private float mucKinhPhi;

    public MonHoc(String tenMonHoc, int tongSoTiet,int soTietLyThuyet, float mucKinhPhi) {
        this.idMonHoc = nextId++;
        this.tenMonHoc = tenMonHoc;
        this.tongSoTiet = tongSoTiet;
        this.soTietLyThuyet=soTietLyThuyet;
        this.mucKinhPhi = mucKinhPhi;
    }

    public int getIdMonHoc() {
        return idMonHoc;
    }

    public void setIdMonHoc(int idMonHoc) {
        this.idMonHoc = idMonHoc;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public int getTongSoTiet() {
        return tongSoTiet;
    }

    public void setTongSoTiet(int tongSoTiet) {
        this.tongSoTiet = tongSoTiet;
    }

    public float getMucKinhPhi() {
        return mucKinhPhi;
    }

    public void setMucKinhPhi(float mucKinhPhi) {
        this.mucKinhPhi = mucKinhPhi;
    }

    public int getSoTietLyThuyet() {
        return soTietLyThuyet;
    }

    public void setSoTietLyThuyet(int soTietLyThuyet) {
        this.soTietLyThuyet = soTietLyThuyet;
    }

    @Override
    public String toString() {
        return "Mã môn học: " +idMonHoc+" -Tên môn học: " +tenMonHoc+" -Tổng số tiết: "+tongSoTiet+" -Số tiết lý thuyết: "+soTietLyThuyet+" -Mức kinh phí: "+mucKinhPhi;
    }
}
