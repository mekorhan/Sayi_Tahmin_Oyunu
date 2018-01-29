import java.util.Random;

public class Sayi_Olusturma {
    static int[] arrayr = new int[4];
    public Sayi_Olusturma(){
        Random r = new Random();
        int bb,ib,ub,db;

        int[] array = new int[4];

        bb=r.nextInt(10);

        ib=r.nextInt(10);
        while(ib==bb){
            ub=r.nextInt(10);
        }

        ub=r.nextInt(10);
        while(ub==bb | ub==ib){
            ub=r.nextInt(10);
        }

        db=r.nextInt(10);
        while(db==bb | db==ib | db==ub | db==0){
            db=r.nextInt(10);
        }

        array[0]=db;
        array[1]=ub;
        array[2]=ib;
        array[3]=bb;


        for(int i = 0;i<4;i++){
            arrayr[i]=array[i];
        }
        System.out.print("Bileceğin sayı: ");
        for(int i = 0;i<4;i++){
            System.out.print(array[i]);
        }
        System.out.print("\n");
        System.out.println("birler basamağı: "+bb);
        System.out.print("\n");
    }
}
