package Arrays;

import java.util.Scanner;

public class NegNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter size:");
        int n=obj.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++) {
        	arr[i]=obj.nextInt();
        }
        System.out.print("Negative integer is:{");
        for(int i=0;i<n;i++) {
        	if((arr[i])<0) {
        		System.out.print(arr[i]+",");
        	}
        }
        System.out.print("}");
	}

}
