package Anudip;

public class MissingNum {

	public static void main(String[] args) {
		
		int arr[] = {1,2,4,5};
		 int s1=0;
		 for(int i=0;i<arr.length;i++) {
			 s1=s1+arr[i];
		 }
		 int s2=0;
		 for(int i=1;i<=5;i++)
		 {
			 s2=s2+i;
		 }
		 System.out.println("missing num " +(s2-s1));

	}

}
