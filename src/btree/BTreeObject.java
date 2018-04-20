package btree;
import java.nio.LongBuffer;

public class BTreeObject {

	private long key;
	private long Counter;
	public static int size = 16;
	
	public BTreeObject(long key) {
		this.key = key;
		Counter = 0;
	}
	
	public void IncCounter() {
		Counter++;
	}

	public long getKey() {
		return key;
	}

	public long getCounter() {
		return Counter;
	}

	public String toString() {
		return String.format("%s %s", Long.toString(key), Long.toString(Counter));
	}

	@SuppressWarnings("unchecked")
	public boolean equals(Object o) {
		if (o instanceof BTreeObject) 
		   return key == ((BTreeObject)o).getKey();
		return false;
	}
	
	public void toBuffer(LongBuffer l) {
		l.put(key);
		l.put(Counter);
	}
	
	public void fromBuffer(LongBuffer l) {
		key = l.get();
		Counter = l.get();
	}

}
