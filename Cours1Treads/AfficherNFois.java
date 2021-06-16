public class AfficherNFois extends Thread {
    public static int nbocu = 0 ;
    private int nb;
    private String meesage;
    private int interation;
    private int w ;
    private char c;

    public AfficherNFois (int commencement, String m, int fin, char c ){
        nb = fin;
        meesage=m;
        interation = 0;
        w = commencement;
    }

    public void run() {
        try{
            for (int i= w; i<nb; i++){
                if(meesage.charAt(i)== c ){
                    nbocu++;
                }
                //sleep(1000);
            }

        }
        catch (Exception e){}
    }
}