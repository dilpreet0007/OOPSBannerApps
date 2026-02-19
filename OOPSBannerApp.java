
public class OOPSBannerApp{
	public static void main(String[] args){
		
		Pattern pattern = new Pattern();
		
		Pattern.Oops oops = new Pattern().new Oops();
		
		oops.printOOPS();
		
 	}	
} 
class Pattern{
	static String[] arr ={
		"*****  *****  *****  *****",
		"*   *  *   *  *   *  *    ",
		"*   *  *   *  *****  *****",
		"*   *  *   *  *          *",
		"*****  *****  *      *****"
	};
	class Oops{
		 void printOOPS(){ 
			for(int i=0;i<arr.length;i++){
				System.out.println(arr[i]);
			}
		 }
	}
}