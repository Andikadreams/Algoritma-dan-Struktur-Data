public class tugas2 {
    
    public static java.util.Scanner in=new java.util.Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    static void menu(){
        System.out.println("PROGRAM MENGHITUNG KECEPATAN/JARAK/WAKTU");
        System.out.println("========================================");
        System.out.println("Ingin menghitung apa ? (kecepatan/jarak/waktu)");
        System.out.print("Masukkan pilihan anda : ");
        String input=in.nextLine();
        if(input.equals("kecepatan")){
            kecepatan();
        }else if(input.equals("jarak")){
            jarak();
        }else{
            waktu();
            }
        }
    static void kecepatan(){
        System.out.print("Masukkan jarak (km): ");
        double s =in.nextInt();
        System.out.print("Masukkan waktu (/jam): ");
        double t=in.nextInt();
        double total=s/t;
        System.out.println("Kecepatan yang di dapat adalah : "+total+" km/jam");
    }
    static void jarak(){
        System.out.print("Masukkan kecepatan (km/jam): ");
        int v=in.nextInt();
        System.out.print("Masukkan waktu (/jam): ");
        int t=in.nextInt();
        int total=v*t;
        System.out.println("Kecepatan yang di dapat adalah : "+total+" km");
    }
    static void waktu(){
        System.out.print("Masukkan jarak (km): ");
        double s =in.nextInt();
        System.out.print("Masukkan kecepatan (km/jam): ");
        double v=in.nextInt();
        double total=s/v;
        System.out.println("Kecepatan yang di dapat adalah : "+total+" jam");
    }
}
