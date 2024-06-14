import java.util.Scanner;

public class GiangVien {
    Scanner sc = new Scanner(System.in);
    private static int nextId=100;
    private int idGV;
    private String hoTen;
    private String diaChi;
    private String SDT;
    private String trinhDo;

    public GiangVien(String hoTen,String diaChi,String SDT,String trinhDo){
        this.idGV=nextId++;
        this.hoTen=hoTen;
        this.diaChi=diaChi;
        this.SDT=SDT;
        this.trinhDo=trinhDo;
    }

    public int getIdGV() {
        return idGV;
    }

    public void setIdGV(int idGV) {
        this.idGV = idGV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    @Override
    public String toString(){
        return "Mã giảng viên: " + idGV+" - Họ tên: "+hoTen+" - Địa chỉ: "+diaChi+" -SDT: "+SDT+" -Trình độ: "+trinhDo;
    }
}
