package settergetter;

public class SubClass {
    //variabel
    private double panjang;
    private double lebar;
    protected double luas;
    
    //setter untuk variabel panjang
    public void setPanjang(double panjang){
        this.panjang = panjang;
    }
    
    //setter untuk variabel lebar
    public void setLebar(double lebar){
        this.lebar = lebar;
    }
    
    //getter untuk variabel panjang 
    public double getPanjang(){
        return panjang;
    }
    
    //getter untuk variabel lebar
    public double getLebar(){
        return lebar;
    }
    
    //setter untuk variabel luas
    public void setLuas(){
        luas = panjang*lebar;
    }
    
    //getter untuk variabel luas
    public double getLuas(){
        return luas;
    }
}
