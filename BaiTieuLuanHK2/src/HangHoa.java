public abstract class HangHoa {
    private int maHang, sLTonKho;
    private String tenHang;
    private double donGia;

    public HangHoa(){

    }
    public abstract double VAT();
    public int getMaHang() {
        return maHang;
    }
    public void setMaHang(int maHang) {
    if(maHang > 0){
        this.maHang = maHang;
    }
    else
        System.out.println(" Mã Hàng không được sửa, không được để trống !!!");
    }
        
    public int getsLTonKho() {
        return sLTonKho;
    }
    public void setsLTonKho(int sLTonKho) {
        if (sLTonKho >=0){
            this.sLTonKho = sLTonKho;
        }
        else
            System.out.println("Số lượng tồn kho không hợp lệ !!!");
    }
    public String getTenHang() {
        return tenHang;
    }
    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        if(donGia >0){
            this.donGia = donGia;
        }
        else
            System.out.println("Đơn giá không hợp lệ!!!");
    }
    public HangHoa(int maHang, int sLTonKho, String tenHang, double donGia) {
        this.maHang = maHang;
        this.sLTonKho = sLTonKho;
        this.tenHang = tenHang;
        this.donGia = donGia;
    }
    @Override
    public String toString() {
        return "HangHoa [donGia=" + donGia + ", maHang=" + maHang + ", sLTonKho=" + sLTonKho + ", tenHang=" + tenHang
                + "]";
    }






    
   
    

    
}
