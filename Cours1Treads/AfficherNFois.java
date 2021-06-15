public class AfficherNFois extends Thread {
    private int nb;
    private String meesage;
    private int interation;
    private int w ;

    public AfficherNFois (int commencement, String m, int fin){
        nb = fin;
        meesage=m;
        interation = 0;
        w = commencement;
    }

    public void run() {
        try{
            for (int i= w; i<nb; i++){
                if(meesage.charAt(i)=='e'){
                    interation++;
                }
                //sleep(1000);
            }
            //System.out.println(interation);

        }
        catch (Exception e){}
    }
}