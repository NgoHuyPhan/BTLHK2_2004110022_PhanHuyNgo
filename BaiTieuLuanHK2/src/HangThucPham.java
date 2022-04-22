import java.util.Date;

public class HangThucPham extends HangHoa {
    private Date nSX, hSD;
    private String nhaCC;

    public HangThucPham(){

    }

    public HangThucPham(Date nSX, Date hSD, String nhaCC) {
        this.nSX = nSX;
        this.hSD = hSD;
        this.nhaCC = nhaCC;
    }

    public HangThucPham(int maHang, int sLTonKho, String tenHang, double donGia, Date nSX, Date hSD, String nhaCC) {
        super(maHang, sLTonKho, tenHang, donGia);
        this.nSX = nSX;
        this.hSD = hSD;
        this.nhaCC = nhaCC;
    }

    public Date getnSX() {
        return nSX;
    }

    public void setnSX(Date nSX) {
        this.nSX = nSX;
    }

    public Date gethSD() {
        return hSD;
    }

    public void sethSD(Date hSD) {
        if(nSX != null){
            if(hSD.after(nSX)){
            this.hSD = hSD;
        }else{
            System.out.println("Hạn sử dụng phải trước ngày sản xuất");
            this.hSD = new Date();
        }
        }else{
            System.out.println("Hạn sử dụng không được để trống");
            this.hSD = new Date();
        }
    }


    public String getNhaCC() {
        return nhaCC;
    }

    public void setNhaCC(String nhaCC) {
        if(nhaCC != null){
            this.nhaCC = nhaCC;
        }
        else
            System.out.println("Nhà cung cấp không được để trống");
        
    }
    
    
    @Override
    public String toString() {
        return super.toString()+ "HangThucPham [hSD=" + hSD + ", nSX=" + nSX + ", nhaCC=" + nhaCC + "]" + "Thue VAT" + this.VAT();
    }

    @Override
    public double VAT() {
        // TODO Auto-generated method stub
        double thueVAT = 0;
        thueVAT = this.getDonGia() * 0.05;
        return thueVAT;
    }
    


}




