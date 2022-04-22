
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class DanhSachHangHoaQuanLy {

    private List<HangHoa> danhSach = new ArrayList<>();
    private int sLHangThucPham;
    private int sLHangSanhSu;
    private int sLHangDienMay;
    private Scanner sc = new Scanner(System.in);
    private int sum, sumHTP, sumHDM, sumHSS;


    public DanhSachHangHoaQuanLy(){

    }


    public DanhSachHangHoaQuanLy(int sLHangThucPham, int sLHangSanhSu, int sLHangDienMay) {
        this.sLHangThucPham = sLHangThucPham;
        this.sLHangSanhSu = sLHangSanhSu;
        this.sLHangDienMay = sLHangDienMay;
    }

    

    public int getsLHangThucPham() {
        return sLHangThucPham;
    }

    public void setsLHangThucPham(int sLHangThucPham) {
        this.sLHangThucPham = sLHangThucPham;
    }

    public int getsLHangSanhSu() {
        return sLHangSanhSu;
    }

    public void setsLHangSanhSu(int sLHangSanhSu) {
        this.sLHangSanhSu = sLHangSanhSu;
    }

    public int getsLHangDienMay() {
        return sLHangDienMay;
    }

    public void setsLHangDienMay(int sLHangDienMay) {
        this.sLHangDienMay = sLHangDienMay;
    }
    public void xoaHangHoa(HangHoa hangHoa) {
        this.danhSach.remove(hangHoa);
    }
    public void xoaHangHoa() {
        HangHoa hangHoa1 = null;
        System.out.println("Nhập Mã Hàng Muốn Xoá:");
        int maHH = sc.nextInt();
        for (HangHoa hangHoa : danhSach) {
            if (maHH == hangHoa.getMaHang()) {
                hangHoa1 = hangHoa;
                break;
            }
        }
        if (hangHoa1 != null) {
            this.xoaHangHoa(hangHoa1);
            System.out.println("Hàng Hoá Đã Được Xoá");
        } else {
            System.out.println("Hàng Hoá Không Tồn Tại");
        }
    }
    public HangHoa timKiemHangHoa(int maHang) {
        HangHoa hangHoa = null;
        for (HangHoa h : danhSach) {
            if (h.getMaHang() == maHang) {
               hangHoa = h;
               System.out.println(hangHoa);
               break;
            }
        }
        return hangHoa;
    }
    public void themHangHoa(HangHoa hangHoa) {
        danhSach.add(hangHoa);
    }

    public void hienThiHangHoa() {
        for (HangHoa hangHoa : danhSach) {
            System.out.println(hangHoa);
        }
    }
    public void sapXepHangHoa() {
        Collections.sort(danhSach, new Comparator<HangHoa>() {
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if (o1.getsLTonKho() < o2.getsLTonKho()) {
                    System.out.println("Sap Xep Thanh Cong");
                    return 1;
                } else {
                    if (o1.getsLTonKho() == o2.getsLTonKho()) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }

        });
        this.hienThiHangHoa();
    }
    public void tongHangHoa(){
        sum = sumHTP + sumHDM + sumHSS;
        System.out.println("Tổng số hàng còn lại ở trong kho:" + sum);
    }
    public void tongSlHangHoaTonKho(){
        System.out.println("Tổng số lượng Hàng Thực Phẩm tồn kho= " + sumHTP);
        System.out.println("Tổng số lượng Hàng Điện Máy tồn kho= " + sumHDM);
        System.out.println("Tổng số lượng Hàng Sành Sứ tồn kho = " + sumHSS);
    }
    public void tinhSLHangTonKho() {
        for (HangHoa hangHoa : danhSach) {
            if (hangHoa instanceof HangThucPham) {
                sumHTP += hangHoa.getsLTonKho();
                
            }
            if (hangHoa instanceof HangDienMay) {
                sumHDM += hangHoa.getsLTonKho();
                
            } else if (hangHoa instanceof HangSanhSu) {
                sumHSS += hangHoa.getsLTonKho();
                
            }
        }
    }

}

    




    

    
   


