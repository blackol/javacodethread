import java.util.Scanner;
import java.util.ArrayList;

public class main {
    public static void main(String[] args){

        
        int fe = new Scanner(System.in).nextInt();
        int fo = new Scanner(System.in).nextInt();

        HorlogeTread a1 = new HorlogeTread(fe, fo);
        a1.start();
        

        

















   
/*
        System.out.println("Entrez un nombre");
        int n = new Scanner(System.in).nextInt();
        System.out.print("Veuillez saisir Le nombre de threads :");
        int maxThreads = new Scanner(System.in).nextInt() ;
        // initialisation valeurs debut et fin
        int fin ;
        int debut;
        // taille du tableau
        int taille;
        taille = n;



       
        NombrePremiers tab[] = new NombrePremiers[maxThreads];
        
            for(int i=0; i<maxThreads; i++){
                debut = i*taille/maxThreads;
                fin = (i+1)*taille/maxThreads;
                tab[i]= new NombrePremiers(debut,fin);
            }
            Long begin = System.currentTimeMillis();
            for(int i=0; i<maxThreads; i++){
                tab[i].setPriority(10);  
				tab[i].start();
                try {
                    tab[i].join();
                } catch (InterruptedException e) {
                }
			}
            long end = System.currentTimeMillis();
            float time = ((float) (end-begin))/100;
            System.out.println(time + "seconds");
            
/*
            for(Integer i : NombrePremiers.liste){
                System.out.println(i);
            }
            System.out.println(time + "seconds");

*/
    }

    private static Object HorlogeTread(int fe, int fo) {
        return null;
    }
    
}