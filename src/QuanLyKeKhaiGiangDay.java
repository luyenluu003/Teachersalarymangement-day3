public class QuanLyKeKhaiGiangDay {
    private GiangVien giangVien;
    private MonHoc monHoc;
    private int soLop;

    public QuanLyKeKhaiGiangDay(GiangVien giangVien, MonHoc monHoc, int soLop) {
        if (soLop < 1 || soLop > 3) {
            throw new IllegalArgumentException("Số lớp phải từ 1 đến 3.");
        }
        this.giangVien = giangVien;
        this.monHoc= monHoc;
        this.soLop=soLop;
    }

    public GiangVien getGiangVien() {
        return giangVien;
    }

    public MonHoc getMonHoc() {
        return monHoc;
    }

    public int getSoLop() {
        return soLop;
    }

    public int tongSoTiet() {
        return monHoc.getTongSoTiet() * soLop;
    }

    public float tongTienCong(){
        float tienLyThuyet = monHoc.getSoTietLyThuyet() * monHoc.getMucKinhPhi() * soLop;
        float  tienThucHanh = (monHoc.getTongSoTiet()- monHoc.getSoTietLyThuyet()) * monHoc.getMucKinhPhi() * 0.7f * soLop;
        return tienLyThuyet+tienThucHanh;
    }

    @Override
    public String toString() {
        return
                "Giảng viên:\n" + giangVien +
                ", Môn học:\n" + monHoc +
                ", \nSố lớp:" + soLop +
                ", \ntổng số tiết:" + tongSoTiet() +
                ", \nTiền công:" + tongTienCong() ;
    }
}
