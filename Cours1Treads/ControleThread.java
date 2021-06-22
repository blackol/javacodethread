import java.util.Scanner;
import java.util.Scanner;
import java.util.Date;


public class ControleHorlogeThread extends Thread{

    private HorlogeTread H;
    private boolean arret;
    
    public ControleHorlogeThread(HorlogeTread h) {
        H=h;
        arret = false;
    }
    
    public void run (){

        System.out.println(" Controle de l'horloge: 1 pour modifier le temps de rafraichissement |2 pour modifier le format |3 pour arreter ");
        while(!arret){
            int Choix= new Scanner (System.in).nextInt();
            if (Choix==1) {
                System.out.println(" Entrer le nouveau temps de rafraichissement");
                int newR =new Scanner (System.in).nextInt();
                H.setRafraichissement(newR);
                System.out.println(" Controle de l'horloge: 1 pour modifier le temps de rafraichissement |2 pour modifier le format |3 pour arreter ");
            }
            
            if (Choix==2) {
                System.out.println(" Entrer le nouveau format: : 1 dd/MM/yyyy HH:mm:ss/2 HH:mm:ss");
                int newF =new Scanner (System.in).nextInt();
                H.setFormat(newF);
                System.out.println(" Controle de l'horloge: 1 pour modifier le temps de rafraichissement |2 pour modifier le format |3 pour arreter ");
            }
            
            if (Choix==3) {
                H.setArret(true);
                System.out.println(" L'horloge est arreter");
            }
            
            
    
            //try {
                //sleep(5000);
            //} catch (InterruptedException e) {
                
            //}
            
        }	
        
    }
}

