import java.util.Scanner;

public class main {
    public static void main(String[] args){
        int debut;
        String message;
        int fin ;
        
        

    
        System.out.print("Veuillez saisir Le nombre de threads :");
        int maxThreads = new Scanner(System.in).nextInt() ;
        System.out.print("Quels caretère voulez vous :");
        char c = new Scanner(System.in).nextLine().charAt(0);
        System.out.print("Quels caretère voulez vous :");
         message = "Veuillez";

// Optimiser avec une tab de achage
        Long begin = System.currentTimeMillis();

        AfficherNFois tab [] = new AfficherNFois[maxThreads];
			for(int i=0; i<maxThreads; i++){
                fin = (i+1)*message.length()/maxThreads;
                debut = i*message.length()/maxThreads;
				tab[i]= new AfficherNFois(debut, message,fin,c);
			}
			for(int i=0; i<maxThreads; i++){
				tab[i].start();
                try {
                    tab[i].join();
                } catch (InterruptedException e) {
                }
			}
            long end = System.currentTimeMillis();
            float time = ((float) (end-begin))/100;
            System.out.println(time + "seconds");
            System.out.print("Ce caractère est présent :");
            System.out.print(AfficherNFois.nbocu);
            System.out.println(" fois");
        /*
        AfficherNFois a1=new AfficherNFois(26, "Bonjour");
        AfficherAlphabet b2 = new AfficherAlphabet();
        a1.start();
        b2.start(); */
    }
    
}