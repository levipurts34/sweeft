import acm.program.ConsoleProgram;

public class stears extends ConsoleProgram {
	public void run(){
		
	}
	public int findStep(int n){
        if(n==0){
        	return 1;
        }else if(n<0){
        	return 0;
        } else{
        	return findStep(n-2)+findStep(n-1);
        }
    }
}
