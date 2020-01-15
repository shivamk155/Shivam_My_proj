
public class StringPermutation{
	
	private static class A{
		public void add(Number n){
			System.out.println("In a class add method");
		}
	}
	
	private static class B extends A{
		public void add(Long a){
			System.out.println("In B class add method");
			
		}
	}
	
	private static void compute (Integer i) {
		++i;
	}
	
	public static void main(String[] args) {
		//B ankita = new StringPermutation.B();
		//ankita.add(5);
		Integer i =new Integer(5);
		compute(i);
		System.out.println(i);
		
	}

}


