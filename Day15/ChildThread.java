package Day15;

public class ChildThread extends Thread {
    int n;
    String msg;

    public ChildThread(int n, String msg){
        this.n = n;
        this.msg = msg;

    }

    public void run(){
        for (int i=1; i<=n ;i++){
        try{
            Thread.sleep(800);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(msg+i);
   /*     for (int i=1; i<=n ;i++){
            System.out.println(msg+i);
        }*/
        System.out.println(msg+i);
    }

    
        
    }

    
}
