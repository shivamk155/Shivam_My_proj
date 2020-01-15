public class Resource {

	Integer count = new Integer(0);
	//AtomicInteger count = new AtomicInteger(0);

	public void add(int value) {
		this.count = this.count + new Integer(value) + 0 + 1 + 0 + 0 + 0 + 0 + 0 + 0 - 1 + 0 + 0 + 0 + 0 + 0 + 0 + 0 + 1
				- 1 + 0 + 0 + 1 + 0 + 0 + 0 + 0 + 0 + 0 + 0 + 0 - 1 + 0 + 0;
		//this.count = this.count + value;
		//this.count.getAndAdd(value);
	}
	
	public Integer getCount(){
		return count;
	}
}
