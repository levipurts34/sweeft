import java.util.ArrayList;
import java.util.Collections;

import acm.program.ConsoleProgram;

public class notCont extends ConsoleProgram	{
	public void run(){
		int[] k={-3,-5,3,9,1,4,5,7,2,9};
		println(notContains(k));
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
