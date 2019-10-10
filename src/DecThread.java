public class DecThread extends Thread {

    public Counter counter;

    public DecThread(Counter counter){
        this.counter=counter;
    }

    public void run(){
        for(int i=0;i<10000000;i++){
            counter.dec();
            System.out.println("dec");
            System.out.println(counter.number);
        }
    }

}
