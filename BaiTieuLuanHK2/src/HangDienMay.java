public class HangDienMay extends HangHoa{
    private int thoiGianBH;
    private double congSuat;

    public HangDienMay(){

    }
    
    public HangDienMay(int maHang, int sLTonKho, String tenHang, double donGia, int thoiGianBH, double congSuat) {
        super(maHang, sLTonKho, tenHang, donGia);
        this.thoiGianBH = thoiGianBH;
        this.congSuat = congSuat;
    }
    public HangDienMay(int thoiGianBH, double congSuat) {
        this.thoiGianBH = thoiGianBH;
        this.congSuat = congSuat;
    }
    public int getThoiGianBH() {
        return thoiGianBH;
    }
    public void setThoiGianBH(int thoiGianBH) {
        this.thoiGianBH = thoiGianBH;
    }
    public double getCongSuat() {
        return congSuat;
    }
    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }
    @Override
    public String toString() {
        return super.toString()+ "HangDienMay [congSuat=" + congSuat + ", thoiGianBH=" + thoiGianBH + "]" + "Thue VAT" + this.VAT();
    }

    @Override
    public double VAT() {
        // TODO Auto-generated method stub
        double thueVAT = 0;
        thueVAT = this.getDonGia() * 0.1;
        return thueVAT;
    }

    
}
