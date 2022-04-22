import java.util.Date;

public class HangSanhSu extends HangHoa {
    private String nhaSanXuat;
    private Date ngayNhapKho;

    public HangSanhSu(){

    }
    
    public HangSanhSu(int maHang, int sLTonKho, String tenHang, double donGia, String nhaSanXuat, Date ngayNhapKho) {
        super(maHang, sLTonKho, tenHang, donGia);
        this.nhaSanXuat = nhaSanXuat;
        this.ngayNhapKho = ngayNhapKho;
    }
    public HangSanhSu(String nhaSanXuat, Date ngayNhapKho) {
        this.nhaSanXuat = nhaSanXuat;
        this.ngayNhapKho = ngayNhapKho;
    }
    public String getNhaSanXuat() {
        return nhaSanXuat;
    }
    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }
    public Date getNgayNhapKho() {
        return ngayNhapKho;
    }
    public void setNgayNhapKho(Date ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }
    @Override
    public String toString() {
        return super.toString()+ "HangSanhSu [ngayNhapKho=" + ngayNhapKho + ", nhaSanXuat=" + nhaSanXuat + "]" + "Thue VAT" + this.VAT();
    }

    @Override
    public double VAT() {
        // TODO Auto-generated method stub
        double thueVAT = 0;
        thueVAT = this.getDonGia() * 0.1;
        return thueVAT;
    }

    
}
