import acm.program.ConsoleProgram;

public class singleNum extends ConsoleProgram {
	public void run(){
		
	}
	public int singleNumber(int[] nums){
		for(int i=0;i<nums.length;i++){
			if(counter(nums[i],nums)==1){
				return nums[i];
			}
		}
		return 0;
	}
	public int counter(int a,int[] b){
		int count=0;
		for(int i=0;i<b.length;i++){
			if(b[i]==a){
				count++;
			}
		}
		return count;
	}
}
