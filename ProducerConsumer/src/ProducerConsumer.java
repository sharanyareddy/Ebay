
public class ProducerConsumer {

	public static void main(String[] args) {
	Buffer b=new Buffer();
	
	Packet[] p = null;             // Have to send the packets
	Thread prodThread1 = new Thread(new Producer(b,p));
	Thread prodThread2 = new Thread(new Producer(b,p));
    Thread consThread = new Thread(new Consumer(b));
    
    prodThread1.start();
    prodThread2.start();
    consThread.start();

	}

}
