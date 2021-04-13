package settergetter;

public class Main {

    public static void main(String[] args) {
        
        //print judul
        System.out.println("Program Data Stadion"+"\n");
        
        //membuat objek ol dari class SubClass
        SubClass ol = new SubClass();
        
        //memanggil method setter dari class SubClass
        ol.setPanjang(200);
        ol.setLebar(100);
        ol.setLuas();
        
        //print data dan menambahkan method getter dari class SubClass
        System.out.println("Panjang Stadion : "+ol.getPanjang()+"m");
        System.out.println("Lebar Stadion   : "+ol.getLebar()+"m");
        System.out.println("Luas Stadion    : "+ol.getLuas()+"m²"+"\n");
        
        //membuat objek ok dari class SubClass
        SubClass ok = new SubClass();
        
        //memanggil method setter dari class SubClass
        ok.setPanjang(100);
        ok.setLebar(50);
        ok.setLuas();
        
        //print data dan menambahkan method getter dari class SubClass
        System.out.println("Panjang Stadion : "+ok.getPanjang()+"m");
        System.out.println("Lebar Stadion   : "+ok.getLebar()+"m");
        System.out.println("Luas Stadion    : "+ok.getLuas()+"m²"+"\n");
    }
    
}
