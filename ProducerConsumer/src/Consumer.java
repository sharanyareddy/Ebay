
public class Consumer extends Thread {
	private Buffer buffer;
	public Consumer( Buffer buffer ){
		this.buffer = buffer;
	}
	public void run(){
		while( true ){
			Message m= buffer.remove();                      //Consumer consumes message from the shared buffer
			System.out.println("Consumed :"+m);
		}
	}
}
