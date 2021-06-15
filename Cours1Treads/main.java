import java.util.Scanner;

public class main {
    public static void main(String[] args){
        int debut;
        String message;
        int z ;
        int fin ;
        int y = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir Le nombre de threads :");
        int maxThreads = sc.nextInt();

        message = "Veuillezibiibiubiububiuivuiyiviyvyvyviviuvuejiibiububububub";
        
// Optimiser avec une tab de achage

        AfficherNFois tab [] = new AfficherNFois[maxThreads];
			for(int i=0; i<maxThreads; i++){
                
                fin = message.length()/z;
                debut = message.length()/y;

				tab[i]= new AfficherNFois(debut, message,fin);
			}
			for(int i=0; i<maxThreads; i++){
				tab[i].start();
                try {
                    tab[i].join();
                } catch (InterruptedException e) {
                }
			}

        /*
        AfficherNFois a1=new AfficherNFois(26, "Bonjour");
        AfficherAlphabet b2 = new AfficherAlphabet();
        a1.start();
        b2.start(); */
    }
    
}

