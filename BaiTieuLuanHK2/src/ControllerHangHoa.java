import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ControllerHangHoa {
    private List<HangHoa> danhSach = new ArrayList<>();
    DanhSachHangHoaQuanLy danhSachHangHoaQuanLy = new DanhSachHangHoaQuanLy();
    Scanner sc = new Scanner(System.in);
    private int thoiGianBh;
    private String nhaCC, nhaSanXuat;
    private Date nSX, hSD, ngayNhapKho;
    SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
    String yn;
    private double congSuat;

    private void nhapNhieuHangHoa() {
        String luaChon = null;
        do {
            HangHoa hangHoa = this.nhapHangHoa();
            danhSachHangHoaQuanLy.themHangHoa(hangHoa);
            System.out.println("Nhập Sản Phẩm Tiếp Không [Yes/No]");
            luaChon = sc.nextLine();
        } while (luaChon.equals("YES") || luaChon.equals("yes"));
    }
    private HangHoa nhapHangHoa() {
        HangHoa hangHoa = null;
        try {
            System.out.println("Nhập tên hàng hoá");
            String tenHang = sc.nextLine();
            System.out.println("Nhập mã hàng hoá");
            int maHang = sc.nextInt();
            System.out.println("Nhập đơn giá hàng hoá");
            double donGia = sc.nextDouble();
            System.out.println("Nhập số lượng tồn kho");
            int sLTonKho = sc.nextInt();
            System.out.println("Lựa chọn của bạn là: [1.Hàng Thực Phẩm] [2.Hàng Sành Sứ] [3.Hàng Điện Máy]");
            int lc = sc.nextInt();
            switch (lc) {
                case 1:
                    System.out.println("Bạn chọn Hàng Thực Phẩm");
                    try {
                        sc.nextLine();
                        System.out.println("Nhập ngày sản xuất của Hàng Hoá: [dd/MM/yyyy]");
                        nSX = sf.parse(sc.nextLine());
                        System.out.println("Nhập hạn sử dụng của Hàng Hoá: [dd/MM/yyyy");
                        hSD = sf.parse(sc.nextLine());
                        System.out.println("Nhập nhà cùng cấp của Hàng Hoá:");
                        nhaCC = sc.nextLine();
                    } catch (Exception e) {

                    }
                    hangHoa = new HangThucPham(maHang, sLTonKho, tenHang, donGia, nSX, hSD, nhaCC);
                    break;
                case 2:
                    System.out.println("Bạn chọn Hàng Sành Sứ");
                    System.out.println("Nhập nhà sản xuất của Hàng Hoá ");
                    String nhaSanXuat = sc.nextLine();
                    try {
                        System.out.println("Nhập ngày nhập kho của Hàng Hoá ");
                        ngayNhapKho = sf.parse(sc.nextLine());
                    } catch (Exception e) {

                    }
                    hangHoa = new HangSanhSu(maHang, sLTonKho, tenHang, donGia, nhaSanXuat, ngayNhapKho);
                    break;
                case 3:
                    System.out.println("Bạn chọn Hàng Điện Máy");
                    System.out.println("Nhập thời gian bảo hành của Hàng Hoá");
                    int thoiGianBH = sc.nextInt();
                    System.out.println("Nhập công suất của Hàng Hoá");
                    double congSuat = sc.nextDouble();
                    hangHoa = new HangDienMay(maHang, sLTonKho, tenHang, donGia, thoiGianBH, congSuat);
                    break;
                default:
                    System.out.println("Lựa chọn của bạn không hợp lệ!!!");
                    break;

            }
        } catch (Exception e) {

        }
        return hangHoa;

    }

    public void dataTest() {
        try {
            SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
            String Date1 = "15/04/2022";
            String Date2 = "1/5/2022";
            String Date3 = "20/04/2022";
            Date date1 = sf.parse(Date1);
            Date date2 = sf.parse(Date2);
            Date date3 = sf.parse(Date3);
            HangHoa hangThucPham1 = new HangThucPham(1, 10, "Bánh Mì", 10000, date1, date2, "HCM");
            HangHoa hangThucPham2 = new HangThucPham(2, 20, "Rau", 5000, date1, date2, "HCM");
            HangHoa hangThucPham3 = new HangThucPham(3, 30, "Thịt Heo", 100000, date1, date2, "HCM");
            HangHoa hangThucPham4 = new HangThucPham(4, 40, "Thịt Bò", 200000, date1, date2, "HCM");
            HangHoa hangSanhSu1 = new HangSanhSu(5, 100, "Bộ Chén Bát", 50000, "HCM", date3);
            HangHoa hangSanhSu2 = new HangSanhSu(6, 200, "Gốm Sứ", 150000, "HCM", date3);
            HangHoa hangSanhSu3 = new HangSanhSu(7, 300, "Dĩa", 30000, "HCM", date3);
            HangHoa hangSanhSu4 = new HangSanhSu(8, 400, "Nồi sứ", 120000, "HCM", date3);
            HangHoa hangDienMay1 = new HangDienMay(9, 1000, "Tủ Lạnh", 5000000, 12, 90);
            HangHoa hangDienMay2 = new HangDienMay(10, 2000, "Máy Lạnh", 6000000, 12, 100);
            HangHoa hangDienMay3 = new HangDienMay(11, 3000, "Máy Giặt", 7000000, 12, 110);
            HangHoa hangDienMay4 = new HangDienMay(12, 4000, "Máy Lọc Nước", 8000000, 12, 120);
            danhSachHangHoaQuanLy.themHangHoa(hangThucPham1);
            danhSachHangHoaQuanLy.themHangHoa(hangThucPham2);
            danhSachHangHoaQuanLy.themHangHoa(hangThucPham3);
            danhSachHangHoaQuanLy.themHangHoa(hangThucPham4);
            danhSachHangHoaQuanLy.themHangHoa(hangSanhSu1);
            danhSachHangHoaQuanLy.themHangHoa(hangSanhSu2);
            danhSachHangHoaQuanLy.themHangHoa(hangSanhSu3);
            danhSachHangHoaQuanLy.themHangHoa(hangSanhSu4);
            danhSachHangHoaQuanLy.themHangHoa(hangDienMay1);
            danhSachHangHoaQuanLy.themHangHoa(hangDienMay2);
            danhSachHangHoaQuanLy.themHangHoa(hangDienMay3);
            danhSachHangHoaQuanLy.themHangHoa(hangDienMay4);
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    public void menuHangHoa() {
        this.dataTest();
        do {
            System.out.println("=================MENU==========================");
            System.out.println("1._______________Thêm Hàng Hoá_________________");
            System.out.println("2._______________Xoá Hàng Hoá__________________");
            System.out.println("3._______________Sửa Hàng Hoá__________________");
            System.out.println("4._______________Tìm kiếm Hàng Hoá_____________");
            System.out.println("5._______________Sắp xếp Hàng Hoá______________");
            System.out.println("6._______________Hiện Thị Danh Sách____________");
            System.out.println("7._______________Thống Kê Hàng Hoá____________");
            System.out.println("=================EXIT==========================");
            System.out.println("Nhập lựa chọn của bạn là:");
            int lc = sc.nextInt();
            sc.nextLine();
            switch (lc) {
                case 0:
                    break;
                case 1:
                    System.out.println("Bạn đã chọn chức năng Thêm Hàng Hoá");
                    this.nhapNhieuHangHoa();
                    break;
                case 2:
                    System.out.println("Bạn đã chọn chức năng Xoá Hàng Hoá");
                    danhSachHangHoaQuanLy.xoaHangHoa();
                    break;
                case 3:
                    System.out.println("Bạn đã chọn chức năng Sửa Hàng Hoá");
                    System.out.println("Nhập Mã Cần Sửa:");
                    int idn = sc.nextInt();
                    this.suaHangHoa(idn);
                    break;
                case 4:
                    System.out.println("Bạn đã chọn chức năng Tìm kiếm Hàng Hoá");
                    System.out.println("Nhập Mã Cần Tìm:");
                    int maTim = sc.nextInt();
                    danhSachHangHoaQuanLy.timKiemHangHoa(maTim);
                    break;
                case 5:
                    System.out.println("Bạn đã chọn chức năng Sắp xếp Hàng Hoá");
                    danhSachHangHoaQuanLy.sapXepHangHoa();
                    break;
                case 6:
                    System.out.println("Bạn đã chọn chức năng Hiện Thị Danh Sách");
                    danhSachHangHoaQuanLy.hienThiHangHoa();
                    break;
                case 7: 
                    System.out.println("Bạn đã chọn chức năng Thống kê hàng hoá");
                    danhSachHangHoaQuanLy.tinhSLHangTonKho();
                    danhSachHangHoaQuanLy.tongSlHangHoaTonKho();
                    danhSachHangHoaQuanLy.tongHangHoa();
                    break;
                default:
                    System.out.println("Lựa chọn của bạn không hợp lệ!!!");
                    break;
            }
            System.out.println("Bạn có muốn nhập tiếp không [Yes/No]");
            yn = sc.nextLine();
        } while (yn.equals("YES") || yn.equals("yes"));
    }
    
   
    private void suaHangHoa(int id) {
        HangHoa hangHoa = null;
        for (HangHoa h : danhSach) {
            if (id == h.getMaHang()) {
                int sLTonKho;
                double donGia;
            }
        }
    }
    
}
