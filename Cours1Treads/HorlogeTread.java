import java.text.SimpleDateFormat;
import java.util.Date;

public class HorlogeTread extends Thread {
    private int frequence;
    private int format;
    private boolean arret;


    public HorlogeTread(int fe, int fo){
        frequence = fe;
        format=fo;
        arret = false;
    }

    public void run(){
        SimpleDateFormat f1 = new SimpleDateFormat("dd-MM-yy HH:mm:ss");
        SimpleDateFormat f2 = new SimpleDateFormat(" HH:mm:ss");

        while(!arret){
            Date d =new Date();
            if(format==1){
                System.out.println(f1.format(d));
            }
            if(format==2){
                System.out.println(f2.format(d));
            }
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}