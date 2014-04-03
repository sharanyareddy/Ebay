


public class Producer extends Thread{
	private Buffer buffer;
	private Packet[] packets;
	public Producer( Buffer buffer,Packet[] p){
		this.buffer = buffer;
		this.packets=p;
		}
	public void run(){
	int index=0;
		while( true ){
			Packet p = packets[index++];
			buffer.add( p );               //Producer adds each packet into the shared buffer;
			System.out.println( "Produced ");
		}
	}
}
