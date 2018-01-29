import java.util.Scanner;

public class Tahmin {
    Scanner input = new Scanner(System.in);

    static int tahmin,bb,ib,ub,db,sayac1=0,sayac2=0;

    int[] arrayt = new int[4];

    public Tahmin(){
        sayac1=0;
        sayac2=0;
        System.out.print("Tahmin Ettiğiniz Sayıyı giriniz: ");

        tahmin=input.nextInt();

        db=tahmin/1000;
        ub=(tahmin/100)%10;
        ib=((tahmin%100))/10;
        bb=(tahmin%100)%10;

        arrayt[0]=db;
        arrayt[1]=ub;
        arrayt[2]=ib;
        arrayt[3]=bb;

        for(int i = 0;i<4;i++){
            for(int j=0;j<4;j++){
                if(arrayt[j]==Sayi_Olusturma.arrayr[i])
                    sayac1++;
            }
        }
        for(int i = 0;i<4;i++){
            if(arrayt[i]==Sayi_Olusturma.arrayr[i])
                sayac2++;
        }

        System.out.println(sayac2+"  yer(basamak) doğru");
        System.out.println(sayac1+"  sayı doğru");
    }
}
