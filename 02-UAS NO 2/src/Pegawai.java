public class Pegawai {
   public String nama;
   public String jabatan;
   public double pajak;
   private double gajibersih;
   private double gajipokok ;

public Pegawai(String nama, String jabatan, double pajak){
    this.nama = nama;
    this.jabatan = jabatan;
    this.pajak = pajak;
}


public void setGajiPokok(double gajiPokok) {
    this.gajiPokok = gajiPokok;
}


public double grtGajiBersih(){
    return gajiBersih;
}

void display (){
    gajiBersih = (gajiPokok*pajak) - gajiPokok;
    System.out.println("NAMA : " + nama);
    System.out.println("Jabatan : " + jabatan);
    System.out.println("Gaji Bersih " + gajibersih);
}


public class App {
    public static void main(String[] args) throws Exception {      
        Pegawai pegawai = new Pegawai("Adam", "Direktur", "4000");
    }
}


