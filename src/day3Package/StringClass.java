package day3Package;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String value ="This is java programming";
		//int strLen = value.length();
		
		//For charAt counting starts with 0 as index
		//System.out.println("Character at index number 10 is:" + value.charAt(10));
		
		//Check that whether string contains the value or not using contains function
		//System.out.println("Check if java exists in string is: " +value.contains("java"));
		
		//It will check the occurrence of substring  and it starts with index number '0'
		//System.out.println("Substring 'is' occurs at index# " +value.indexOf("is"));
		
		//split function
		/*String[] arrValue = value.split(" ");
		int count1=0;
		for(String s: arrValue){
			System.out.println("Value at index " + count1 + " is " + s);
			count1++;
			}
			System.out.println("Substring from index 5 is " + value.substring(5,10));*/

	
		int fromIndex=0;
		String str="JavaExamplesJavaCodeJavaProgram";
		String strFind = "Java";
		int count=0;
		while((fromIndex=str.indexOf(strFind, fromIndex)) != -1) 
			{
				System.out.println("Found at Index #" + fromIndex);
				
				fromIndex++;	
				count+=1;
			}
		System.out.println("Occurence #" + count);
		
	}
}