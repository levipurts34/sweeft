import acm.program.ConsoleProgram;

public class coins extends ConsoleProgram{
	public void run(){
		println(minSplit(50));
	}
	int minSplit(int amount){
		int[] coin={1,5,10,20,50};
		int i=coin.length-1;
		int counter=0;
		while(amount>0){
			if(amount>=coin[i]){
				amount-=coin[i];
				counter++;
			}else{
				i--;
			}
		}
		return counter;
	}
}
