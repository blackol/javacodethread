public class AfficherAlphabet extends Thread {
   
    public void run() {
        try{
            for(char c = 'a'; c <='z'; c++){
                System.out.println(c);
            }
        }
        catch (Exception e){}
    }
    
}
