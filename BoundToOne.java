public class BoundToOne {
	public static int startingNumber=1233123141;
	public static int dividend=4;
	
	public static void main(String[] args) {
		BoundToOne(startingNumber);
	}
	
	private static int BoundToOne(int x){
		System.out.println(x);
		if(x==1)
			return 1;
		if(x%dividend==0)
			return BoundToOne(x/dividend);
		if(x%dividend<=dividend/2)
			return BoundToOne(x-1);
		if(x%dividend>=dividend/2)
			return BoundToOne(x+1);
		return x;
	}

}
