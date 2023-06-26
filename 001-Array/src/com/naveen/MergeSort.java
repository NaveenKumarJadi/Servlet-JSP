package com.naveen;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		
		int a[] = {3,7,9,10,15};
		int b[] = {1,5,8,11,17,20,22};
		int c[] = twoWayMerging(a, b);
		System.out.println(Arrays.toString(c));
		
	}
	
	public static int[] twoWayMerging(int a[], int b[]) {
		int m = a.length;//5
		int n = b.length;//7
		
		int c[] = new int[m+n];//12
		int i=0, j=0, k=0;
		
		while(i<m && j<n) {		//0<5 && 0<7
			
			if(a[i]<b[j])		//a[0]<b[0]=>3<1
			{
				c[k]=a[i];
				i++;
			}else {
				c[k]=b[j];		//c[0]=1
				j++;			//1
			}
			k++;				//1
		}
		
		while(i < m) {
			c[k] = a[i];
			k++;
			i++;
		}
		
		while(j < n) {
			c[k] = b[j];
			k++;
			j++;
		}
		return c;
 	}
}
