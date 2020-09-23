interface queue
{
	void insert(String var);
	void delete(String var);
}

class queueItem implements queue {
	@Override
	public void insert(String item) {
		System.out.println("item inserted into queue -- " + item);		
	}

	@Override
	public void delete(String item) {
		System.out.println("item removed from queue -- " + item);		
	}
}
public class Interface {

	public static void main(String[] args) {
		queueItem qt = new queueItem();
		qt.insert("item1");
		qt.delete("item1");
	}

	

}
