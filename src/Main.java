public class Main {

    public static void main(String[] args){

        Counter counter = new Counter(0);

        IncThread incThread = new IncThread(counter);
        DecThread decThread = new DecThread(counter);

        incThread.start();
        decThread.start();

    }

}
