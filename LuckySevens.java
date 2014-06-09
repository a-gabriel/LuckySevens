
public class LuckySevens {



	public static void main(String[] args){
		
		System.out.println("Enter the lower end of the range: ");
		int lower = IO.readInt();
		
		System.out.println("Enter the upper end of the range: ");
		int upper = IO.readInt();
		int sevens = 0;
		
		if (upper<lower){
			IO.reportBadInput();
			return;}
		else if (upper==lower){
			IO.reportBadInput();
			return;}
		
		
		
	for(int count = lower; count <= upper; count++){
		int num = count;
		if (num<0){
			num = num*(-1);
			while(num>0){
				if (num%10==7){
					sevens++;
							}
		num = num/10;}}
		else {while(num>0){
			if (num%10==7){
				sevens++;
						}
	num = num/10;}}
}
	IO.outputIntAnswer(sevens);
}
}