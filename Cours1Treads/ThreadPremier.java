import java.util.ArrayList;

public class ThreadPremier extends Thread{
    private int debut;
    private int fin;
    public static ArrayList<Integer> list = new ArrayList <Integer>();



    public ThreadPremier(int d,int f){
        debut = d;
        fin = f;
    }

    public void run() {
        for(int i=debut; i<fin; i=i+2){
            int nbDiv = 0;

            for(int j=0;j<=Paith.cqrt(i-1);j++){
                if( i % j==0){
                    nbDiv ++;
                    break;
                }
            }
            if(nbDiv==0){
                list.add(i);
            }
        }
    }
}
