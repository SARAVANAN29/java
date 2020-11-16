public class Testing {
	
	private static Testing test = null;
	
	private Testing() {
		
	}
	
	public static Testing getInstance() {
		if(test == null) {
			test = new Testing();
			return test;
		}
		return test;
	}
	
	
	
	public void getVoid() {
		System.out.println("Hi world");
	}
	
	

}
