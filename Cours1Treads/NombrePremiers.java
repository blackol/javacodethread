import java.util.ArrayList;
public class NombrePremiers extends Thread {
    private int NbrMax;
    private int Nbrdebut;
    public static ArrayList <Integer> liste =new ArrayList <Integer>();
    


    public NombrePremiers(int nbrdebut,int NbrPrmiers){
        NbrMax = NbrPrmiers;
        Nbrdebut = nbrdebut;

    }

    public void run() {
       

            for( int i = Nbrdebut; i<=NbrMax; i++){
                int nbrDiv=0;
                for ( int j=1; j<=i;j++){
                    if (i%j == 0 ){
                        nbrDiv++;
                    }
                }
                if(nbrDiv ==2){
                    liste.add(i);
                }
             }
            
       
    }


    
}
