package easy;

public class PalindromeNumber {

	public boolean isPalindrome(int x) {
		String aux1="", aux2 ="";
        String xStr = Integer.toString(x);
        char array[] = xStr.toCharArray();
        for(int i=0; i<array.length; i++){
            aux1 += array[i];
        }
        for(int j=array.length-1; j>=0; j--){
            aux2 += array[j];
        }
        boolean palindrome = (aux1.equals(aux2) ? true : false);
        return palindrome;
    }
	
}
