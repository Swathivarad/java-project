
package project;

import java.util.Arrays;

public class Arrayoperations {
		public static int[] insert(int a[],int ele,int pos) {
	         if(pos<=0 || pos>a.length+1) {
	        	 System.out.println("Insertion not possible");
	         }
	         else {
	        	 int res[]=new int[a.length+1];
	         for(int i=0,j=0;i<res.length;i++) {
	        	 if(pos-1==i) {
	        		 res[i]=ele;
	        	 }
	        	 else {
	        		 res[i]=a[j++];
	        	 }
	        	 
	         }
	         
	         return res;
		}
	         return a;
		}
	
  public static int[] delete(int a[],int del){
	  int ind =firstoccur(a,del);
	  if(a.length==0) {
		  System.out.println("Array is Empty");
	  }else if(ind==-1) {
		  System.out.println("Deleting element is not present");
	  }
	  else {
		  int res[]=new int[a.length-1];
			for(int i=0,j=0;i<a.length;i++) {
				if(i!=ind) 
					res[j++]=a[i];
			}
				return res;
	  }
	  
	return a;
	  }
  
  public static void update(int a[],int new_ele,int old_ele) {
	  int ind=firstoccur(a,old_ele);
	  if(a.length==0) {
		  System.out.println("Array is Empty");
	  }else if(ind==-1) {
		  System.out.println("Replacing element is not present");
	  }else {
		  for(int i=0,j=0;i<a.length;i++) {
			  if(i==ind) 
				  a[i]=new_ele;
			  }
		  }
	  }
  
	  public static int firstoccur(int a[],int ele) {
		  for(int i=0;i<a.length;i++) {
			  if(a[i]==ele) 
				  return i;
			  }
			  return -1;
		  }
	  public static int lastoccur(int a[],int ele) {
		  for(int i=a.length-1;i>=0;i--) {
			  if(a[i]==ele)
				  return i;
		  }
		  return -1;
	  }
	  public static void sort(int a[]) {
		  for(int i=0;i<a.length-1;i++) {
			  int min=i;
			  for(int j=i+1;j<a.length;j++) {
				  if(a[min]>a[j])
					  min=j;
			  }
			  int temp=a[min];
			  a[min]=a[i];
			  a[i]=temp;
		  }
	  }
	  public static int max(int a[]) {
		  int max=a[0];
		  for(int i=0;i<a.length;i++) {
			  if(a[i]>max)
				  max=a[i];
		  }
		  return max;
	  }
	  
	  public static int min(int a[]) {
		  int min=a[0];
		  for(int i=0;i<a.length;i++) {
			  if(a[i]>min)
				  min=a[i];
		  }
		  return min;
	  }
	  
	  public static int[] reverse(int a[]) {
		  int res[]=new int[a.length];
		  for(int i=0,j=a.length-1;i<a.length;i++,j--) {
			  res[i]=a[j];
		  }
		  return res;
	  }
	  
	  public static void display(int a[]) {
		  System.out.println(Arrays.toString(a));
	  }
	  
	  public static boolean isEmpty(int a[]) {
		  return a.length==0;
	  }
	  public static int[] merge(int a[],int b[]) {
		  int res[]=new int[a.length+b.length];
		  for(int i=0;i<a.length;i++) {
			  res[i]=a[i];
		  }
		  for(int i=0,j=a.length;i<b.length;i++,j++) {
			  res[j]=b[i];
		  }
		  return res;
	  }
	  public static int[] clear() {
		  return new int[0];
	  }
	  
	  
	  
	  }
  
  



