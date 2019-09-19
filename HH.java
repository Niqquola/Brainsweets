
public class HH {
	public static int[] sequence={1};
	public static int _N=0;
	public static void main(String[] args) {
		System.out.println(HH(sequence) ? "TRUE" : "FALSE");
	}
	
	public static boolean HH(int[] seq){
		System.out.println("START");
		System.out.println("=>"+printSeq(sequence));
		
		while(seq.length>0){
			System.out.println("SORTING DESC");
			seq=sortSeqDesc(seq);
			System.out.println("=>"+printSeq(seq));
			System.out.println("REMOVING ZEROS");
			seq=removeZeros(seq);
			System.out.println("=>"+printSeq(seq));
			if(seq.length==0)
				return true;
			System.out.println("REMOVING FIRST");
			seq=removefirst(seq);
			System.out.println("=>N equals "+_N);
			System.out.println("=>"+printSeq(seq));
			if(_N>seq.length){
				System.out.println("=>N("+_N+") > SEQ("+printSeq(seq)+")");
				return false;
			}
			System.out.println("SUBCTRACTING ONE");
			seq=subN(seq,_N);
			System.out.println("=>"+printSeq(seq));
		}
		return true;
	}
	
	//removes zeros from array[]
	private static int[] removeZeros(int[] seq){
		if(seq.length==0)
			return seq;
		else{
			int c = 0;//lenght of seq without zeros
			for (int i = 0; i < seq.length; i++) {
				c= seq[i]>0 ? c+1 : c;
			}
			int[] newSeq=new int[c];//clone array
			int index=0;
			for (int i = 0; i < c; i++) {
				while(seq[index]==0){
					index++;
				}
				newSeq[i]= seq[index];
				index++;
			}
		return newSeq;
		}
	}
	
	//sorts array of ints, descending
	private static int[] sortSeqDesc(int[] seq){
		int[] newSeq=new int[seq.length];
		for (int i = 0; i < newSeq.length; i++) {
			for (int j = 0; j < seq.length; j++) {
				if(seq[i]>seq[j]){
					seq[i]=seq[i]+seq[j];
					seq[j]=seq[i]-seq[j];
					seq[i]=seq[i]-seq[j];
				}
			}
		}
		newSeq=seq;
		return newSeq;
	}
	
	//remove first
	private static int[] removefirst(int[] seq){
		int[] tmpseq=new int[seq.length-1];
		_N=seq[0];
		for (int i = 1; i < seq.length; i++) {
			tmpseq[i-1]=seq[i];
		}
		return tmpseq;
	}
	
	
	//remove first line and call it _N
	private static String printSeq(int[] seq){
		String res="";
		for (int i = 0; i < seq.length; i++) {
			res +=seq[i]+",";
		}
		return res;
	}
	
	//subtracting 1 from _N lines{
	private static int[] subN(int[] seq,int n){
		int[] tmpseq=new int[seq.length];
		for (int i = 0; i < seq.length; i++) {
			
			tmpseq[i]= i<=n-1 ? seq[i]-1 : seq[i];
		}
		return tmpseq;
	}
	
}
