package abcd;

public class Class8 {

	public static void main(String[] args) {
	
	String s="parveen";
	String rev = null;
	
	int len=s.length();
	
	for(int i=len-1;i>=0;i--){
		
	rev= rev +s.charAt(i);
	}
	
	if(s.equals(rev)){
		System.out.println("palindrome");
	}
	else{
		System.out.println("not palindrome");
	}
	}

}
