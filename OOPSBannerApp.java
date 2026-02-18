
public class OOPSBannerApp{
	public static void main(String[] args){
		String[] arr = getPattern();
		
		
		for(String s : arr){
			System.out.println(s);
		}
		
 	}	
	public static String[] getPattern(){
		return new String[]{
			" *** ",
			"*   *",
			"*   *",
			" *** "
		};
	}
} 