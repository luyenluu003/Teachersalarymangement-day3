import java.util.Scanner;

public class main {
    private static GiangVien[] giangViens = new GiangVien[100];
    private static int soLuongGiangVien =0;
    private static MonHoc[] monHocs = new MonHoc[100];
    private static int soLuongmonHoc = 0;
    private static QuanLyKeKhaiGiangDay[] QLKeKhaiGiangDays = new QuanLyKeKhaiGiangDay[100];
    private static  int soLuongQLKeKhaiGiangDay = 0;



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("\nTeacher Salary Mangement");
            System.out.println("1. Thêm giảng viên");
            System.out.println("2. Hiển thị giảng viên");
            System.out.println("3. Thêm môn học");
            System.out.println("4. Hiển thị môn học");
            System.out.println("5. Lập bảng quản lý kê khai giảng dạy cho giảng viên");
            System.out.println("6. Hiển thị bảng quản lý kê khai giảng dạy");
            System.out.println("7. Sắp xếp theo họ tên giảng viên");
            System.out.println("8. Sắp xếp theo số tiết giảng dạy mỗi môn(Giảm dần)");
            System.out.println("9. Bảng tính tiền công");
            System.out.println("0. Thoát...");
            System.out.print("Lựa chọn của bạn: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    themGiangVien();
                    pause();
                    break;
                case 2:
                    hienThiGiangVien();
                    pause();
                    break;
                case 3:
                    themMonHoc();
                    pause();
                    break;
                case 4:
                    hienThiMonHoc();
                    pause();
                    break;
                case 5:
                    lapBangKeKhaiGiangVien();
                    pause();
                    break;
                case 6:
                    inBangKeKhaiGiangVien();
                    pause();
                    break;
                case 7:
                    sapXepGiangVienTheoTen();
                    pause();
                    break;
                case 8:
                    sapXepTheoTongSoLuongTiet();
                    pause();
                    break;
                case 9:
                    tinhTienCong();
                    pause();
                    break;
                case 0:
                    System.out.println("Thoátttttt...");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ vui lòng thử lại.");
            }
        } while (choice != 0);

        sc.close();

    }

    private static void themGiangVien(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng giảng viên bạn muốn thêm:");
        int n= sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Nhập giảng viên thứ "+(i+1)+":");
            System.out.print("Nhập tên giảng viên:");
            String hoTen = sc.nextLine();
            System.out.print("Nhập địa chỉ:");
            String diaChi = sc.nextLine();
            System.out.print("Nhập số điện thoại:");
            String SDT = sc.nextLine();
            System.out.print("Lựa chọn loại trình độ của giảng viên theo số (1. GS-TS, 2. PGS-TS, 3. Giảng viên chính, 4. Thạc sỹ): ");
            int check =sc.nextInt();
            sc.nextLine();
            String trinhDo="";
            switch (check){
                case 1:
                    trinhDo = "GS-TS";
                    break;
                case 2:
                    trinhDo = "PGS-TS";
                    break;
                case 3:
                    trinhDo = "Giảng viên chính";
                    break;
                case 4:
                    trinhDo = "Thạc sỹ";
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ nên lựa chọn mặc định của giảng viên là 'GS-TS'.");
                    trinhDo = "GS-TS";
            }
            GiangVien newGiangVien= new GiangVien(hoTen,diaChi,SDT,trinhDo);
            giangViens[soLuongGiangVien++]=newGiangVien;

        }
    }

    private static void themMonHoc(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng môn học bạn muốn thêm:");
        int n= sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Nhập môn học thứ "+(i+1)+":");
            System.out.print("Nhập tên môn học:");
            String tenMonHoc = sc.nextLine();
            int tongSoTiet;
            do {
                System.out.print("Nhập tổng số tiết: ");
                tongSoTiet = sc.nextInt();
                sc.nextLine();
                if (tongSoTiet <= 0 || tongSoTiet>200) {
                    System.out.println("Vui lòng nhập tổng số tiến > 0 và <= 200.");
                }
            } while (tongSoTiet <= 0 || tongSoTiet > 200);
            int soTietLyThuyet;
            do {
                System.out.print("Nhập số tiết lý thuyết: ");
                soTietLyThuyet = sc.nextInt();
                sc.nextLine();
                if (soTietLyThuyet <= 0 || soTietLyThuyet> tongSoTiet) {
                    System.out.println("Vui lòng nhập số tiết lý thuyết <= tổng số tiết.");
                }
            } while (soTietLyThuyet < 0 || soTietLyThuyet > tongSoTiet);
            System.out.print("Nhập mức kinh phí:");
            int mucKinhPhi = sc.nextInt();
            sc.nextLine();
            MonHoc newMonHoc= new MonHoc(tenMonHoc,tongSoTiet,soTietLyThuyet,mucKinhPhi);
            monHocs[soLuongmonHoc++]=newMonHoc;

        }
    }

    private static void hienThiGiangVien(){
        System.out.println("Hiển thị danh sách giảng viên:");
        for(int i=0;i<soLuongGiangVien;i++){
            System.out.println(giangViens[i]);
        }
    }

    private static void lapBangKeKhaiGiangVien(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập id của giảng viên:");
        int idGV = sc.nextInt();
        sc.nextLine();
        GiangVien giangVien= timKiemGiangVien(idGV);
        if(giangVien==null){
            System.out.println("Không tìm thấy giảng viên!");
            return;
        }

        System.out.print("Nhập id của môn học: ");
        int idMH = sc.nextInt();
        sc.nextLine();
        MonHoc monHoc = timKiemMonHoc(idMH);
        if(monHoc==null){
            System.out.println("Không tìm thấy môn học!!");
            return;
        }

        System.out.print("Nhập số lớp giảng dạy: ");
        int soLop = sc.nextInt();
        sc.nextLine();

        QuanLyKeKhaiGiangDay quanLyKeKhaiGiangDay = new QuanLyKeKhaiGiangDay(giangVien,monHoc,soLop);
        QLKeKhaiGiangDays[soLuongQLKeKhaiGiangDay++] =quanLyKeKhaiGiangDay;


    }

    private static void inBangKeKhaiGiangVien() {
        System.out.println("Bảng quản lý kê khai giảng viên:");
        for (int i = 0; i < soLuongQLKeKhaiGiangDay; i++) {
            System.out.println(QLKeKhaiGiangDays[i]);
        }
    }

    private static void hienThiMonHoc(){
        System.out.println("Hiển thị danh sách môn học:");
        for(int i=0;i<soLuongmonHoc;i++){
            System.out.println(monHocs[i]);
        }
    }

    private static GiangVien timKiemGiangVien(int findId){
        for(int i=0;i<soLuongGiangVien;i++){
            if(giangViens[i].getIdGV()==findId){
                return giangViens[i];
            }
        }
        return null;
    }

    private static MonHoc timKiemMonHoc(int findId){
        for(int i=0;i<soLuongmonHoc;i++){
            if(monHocs[i].getIdMonHoc()==findId){
                return monHocs[i];
            }
        }
        return null;
    }

    private static void sapXepGiangVienTheoTen(){
        if (soLuongQLKeKhaiGiangDay <= 1) {
            System.out.println("Không có hoặc chỉ có một bản ghi, không cần sắp xếp.");
            return;
        }
        for(int i=0;i<soLuongQLKeKhaiGiangDay-1;i++){
            for(int j=i+1;j<soLuongQLKeKhaiGiangDay;j++){

                if(QLKeKhaiGiangDays[i].getGiangVien().getHoTen().compareTo(QLKeKhaiGiangDays[j].getGiangVien().getHoTen())>0){
                    QuanLyKeKhaiGiangDay temp = QLKeKhaiGiangDays[i];
                    QLKeKhaiGiangDays[i]=QLKeKhaiGiangDays[j];
                    QLKeKhaiGiangDays[j]=temp;
                }
            }
            inBangKeKhaiGiangVien();

        }
    }

    private static void sapXepTheoTongSoLuongTiet(){
        if (soLuongQLKeKhaiGiangDay <= 1) {
            System.out.println("Không có hoặc chỉ có một bản ghi, không cần sắp xếp.");
            return;
        }
        for(int i=0;i<soLuongQLKeKhaiGiangDay-1;i++){
            for(int j=i+1;j<soLuongQLKeKhaiGiangDay;j++){

                if(QLKeKhaiGiangDays[i].tongSoTiet()<QLKeKhaiGiangDays[j].tongSoTiet()){
                    QuanLyKeKhaiGiangDay temp = QLKeKhaiGiangDays[i];
                    QLKeKhaiGiangDays[i]=QLKeKhaiGiangDays[j];
                    QLKeKhaiGiangDays[j]=temp;
                }
            }
            inBangKeKhaiGiangVien();

        }
    }


    private static void tinhTienCong() {
        System.out.println("Bảng tính tiền công:");
        for(int i=0;i<soLuongGiangVien;i++){
            GiangVien giangVien = giangViens[i];
            int tongTienCong =0;
            for(int j=0;j<soLuongQLKeKhaiGiangDay;j++){
                QuanLyKeKhaiGiangDay QL = QLKeKhaiGiangDays[j];
                if(QL.getGiangVien().getIdGV()==giangVien.getIdGV()){
                    tongTienCong+=QL.tongTienCong();
                }
            }
            System.out.println("Giảng viên: " + giangVien.getHoTen() + ": " + tongTienCong + " VND");
        }

    }

    public static void pause() {
        System.out.println("Nhấn phím Enter để tiếp tục...");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
