public class Algoritma {
    int adim=0;
    public Algoritma(){
        Sayi_Olusturma s_o ;
        s_o = new Sayi_Olusturma();
        Tahmin t;
        for(;;){
            if (Tahmin.sayac2==4){
                System.out.println("Tebrikler "+adim+".Adımda bildiniz...");
                break;
            }
            else {
                t = new Tahmin();
                adim++;
                if (adim==6){
                    System.out.println("Hakkınız doldu bilemediniz...");
                    break;
                }
            }
        }
    }
}
