public class AfficherNFois extends Thread {
    private int nb;
    private String meesage;

    public AfficherNFois (int n, String m){
        nb=n;
        meesage=m;
    }

    public void run() {
        for (int i=0; i<nb; i++){
            System.out.println(meesage);
        }
    }
}