import java.util.ArrayList;
import java.util.Collections;

import acm.program.ConsoleProgram;

public class notCont extends ConsoleProgram	{
	public void run(){
	
	}
	private int notContains(int[] array){
		ArrayList<Integer> answ = new ArrayList<Integer>();
		for(int i=0;i<array.length;i++){
			answ.add(array[i]);
		}
		return min(answ);
	}
	private int min(ArrayList<Integer> a){
		int i=1;
		while(true){
			if(a.contains(i)){
				i++;
			}else{
				return i;
			}
		}
	}
}
