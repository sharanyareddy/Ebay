
public class Packet {
	int StartSeqNo;
	int NoMsg;
	Message[] messages;
	
	Packet(Message[] message,int StartSeqNo,int Nomsg)
	{
		this.messages=message;
		this.StartSeqNo=StartSeqNo;
		this.NoMsg=Nomsg;
	}
	int getStartSeqNo()
	{
		return StartSeqNo;
	}
	
	int getNoMsg()
	{
		return NoMsg;	
	}
	Message	getMsg(int i)
	{
		return messages[i];
	}
	
}
