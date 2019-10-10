public class IncThread extends Thread {

    public Counter counter;

    public IncThread(Counter counter){
        this.counter=counter;
    }

    public void run(){
        for(int i=0;i<10000000;i++){
            counter.inc();
            System.out.println("Inc");
            System.out.println(counter.number);
        }
    }

}
