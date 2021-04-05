package JAVA1;

//public class SinhVien {
//     public String hoTen;
//     public double diem;
//}
public class SinhVien {
    private String hoTen;
    private double diem;

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getHoTen() {
        return this.hoTen;
    }

    public void setDiem(double diem){
        if(diem < 0 || diem>10){
            System.out.println("Diem khong hop le");
        }
        else{
            this.diem = diem;
        }
    }
    public double getDiem(){
        return this.diem;
    }
}

