import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;


public class Buffer {
	
	private Queue<Message> buffer= new LinkedList<Message>(); ;
	HashMap<Message,Boolean> check=new HashMap<Message,Boolean>();  // to check for duplicate messages
	
	public synchronized void add( Packet p ){
		for(int i=p.getStartSeqNo();i<p.getNoMsg();i++)             // iterate through all the messages in the packet
		{
			if(!check.containsKey(p.getMsg(i)))                   // if the message is not present in HashMap then add it to the buffer thus avoiding duplicates
					{
						buffer.add(p.getMsg(i));
						check.put(p.getMsg(i),true);
					}
		}
		
		notifyAll();                                            // notify other threads after adding the messages into the buffer
	}
	public synchronized Message remove(){
		while( buffer.isEmpty() ){
			try {
				wait();                               			// Wait until the buffer has atleast one message 
			}
			catch( InterruptedException e ){
			}
		}
		Message m = buffer.poll();
		notifyAll();
		return m;
	}
}
