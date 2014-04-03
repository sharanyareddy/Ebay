
public class Message {

	String m;
	int SeqNo;
	
	Message(String m,int SeqNo)
	{
		this.m=m;
		this.SeqNo=SeqNo;
	}

	@Override
	public String toString() {
		return "Message [m=" + m + ", SeqNo=" + SeqNo + "]";
	}
	
	@Override
	public boolean equals(Object obj) {                     // For the HashMap to compare if the messages are equal
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Message other = (Message) obj;
		if (SeqNo != other.SeqNo)
			return false;
		if (m == null) {
			if (other.m != null)
				return false;
		} else if (!m.equals(other.m))
			return false;
		return true;
	}
	
	
}
