public class tugas1 {
    public static void main(String[] args) {
        int harga=4500;
        String [] pelanggan={"ani","budi","bina","cita"};
        double diskon =0.05;
        double totalpendapatan=0;
        int [] berat={4,15,6,11};
        double [] totalh=new double [4];
        for(int i=0;i<berat.length;i++){
            if(berat[i]>10){
                totalh[i]=(berat[i]*harga)-(berat[i]*harga*diskon);
            }else{
                totalh[i]=berat[i]*harga;
            }
        }
        for(int i=0;i<pelanggan.length;i++){
            System.out.println("Berat cucian "+pelanggan[i]+" = "+berat[i]);
            System.out.println("Total bayar "+pelanggan[i]+" = "+totalh[i]);
        }for(int i=0;i<pelanggan.length;i++){
            totalpendapatan+=totalh[i];
        }
        System.out.println("Total pendapatan laundry : "+totalpendapatan);
    }
}
