
public class Problem2 {

	public static void main(String args[])
	{
		
	Priyanka1 p = new Priyanka1();
	p.abc();
	}
}
	class Priyanka1
	{
		void abc() {

		char arr [] = {'a','a','a','b','b','b','c','c','c','c'};
		int[] freq = new int[arr.length];  
        int i, j;  
           
          
        for(i = 0; i <arr.length; i++) {  
            freq[i] = 1;  
            for(j = i+1; j <arr.length; j++) {  
                if(arr[i] == arr[j]) {  
                    freq[i]++;  
                      
                  
                    arr[j] = '0';  
                }  
            }  
        }  
           
        for(i = 0; i <freq.length; i++) {  
            if(arr[i] != ' ' && arr[i] != '0')  
                System.out.println(arr[i] + "-" + freq[i]);  
        }  
    }  
 
		
		
		
		}
	