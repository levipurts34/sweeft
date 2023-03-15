import acm.program.ConsoleProgram;

public class binaryStr extends ConsoleProgram{
	public void run(){

	}
	private String binary(String a, String b){
		String ans="";
		if(a.length()==b.length()){
			ans=adding(a,b);
		}else{
			if(a.length()>b.length()){
				String temp=fill(a,b);
				println(temp);
				ans=adding(temp,a);
			}else{
				String temp=fill(b,a);
				ans=adding(temp,b);
			}
		}
		return ans;
	}
	private String fill(String a, String b){
		String ans="";
		for(int i=0;i<a.length()-b.length();i++){
				ans+=0;
		}
		ans+=b;
		System.out.print(ans);
		return ans;
	}
	private String adding(String a,String b){
		String answ="";
		int rem=0;
		for(int i=a.length()-1;i>=0;i--){
			int x=Integer.parseInt(a.charAt(i)+"");
			int y=Integer.parseInt(b.charAt(i)+"");
			if(x+y+rem<=1){
				answ=x+y+rem+answ;
				rem=0;
				
			}else{
				answ=(x+y+rem)%2+answ;
				rem=1;
			}
		}
		if(rem>0){
			answ=rem+answ;
		}
		return answ;
	}
}
