package _01_Custom_ArrayList;

import java.util.Arrays;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	
	T[] array = (T[]) new Object[0];
	
	public ArrayList() {
		
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		return array[loc];
		
	}
	int loc = 0;
	
	public void add(T val) {
		T[] array2 = (T[]) new Object[array.length+1];
		
		for(int i = 0; i < array.length; i++) {
			
			array2[i] = array[i];
			
			
		}
		array2[array.length] = val;
		
		array = array2;
		
		/*int count = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[loc] == null) {
				break;
			}
			
			count++;
		}*/
		
		
		
		
		//System.out.println(loc);
		
		/*if(count < array.length) {
		array[loc] = val;
		loc++;
		}
		else {
			T[] array2 = (T[]) new Object[array.length+1];
			array2[array2.length-1] = arra
		}*/
		
		//array = array2;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] array2 = (T[]) new Object[array.length+1];
	//	System.out.println(Arrays.toString(array));
		
		for(int i = 0; i < loc; i++) {
			array2[i] = array[i];
		}
		//System.out.println(Arrays.toString(array2));
		array2[loc] = val;
	//	System.out.println(Arrays.toString(array2));
		for(int i = loc+1; i <= array.length; i++) {
			array2[i] = array[i-1];
			//System.out.println(i+1);
			//System.out.println(Arrays.toString(array2));
		}
		
		
		
		//System.out.println(Arrays.toString(array2));
		array = array2;
		
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		array[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] array2 = (T[]) new Object[array.length-1];
		System.out.println(Arrays.toString(array));
		
		for(int i = 0; i < loc; i++) {
			array2[i] = array[i];
		}
		for(int i = loc+1; i < array.length; i++) {
			array2[i-1] = array[i];
			
			//System.out.println(Arrays.toString(array2));
		}
		
		//System.out.println(Arrays.toString(array2));
		array = array2;
		
	
	}
	
	public boolean contains(T val) {
		for(int i = 0 ; i <  array.length; i++) {
			if(array[i] == val) {
				return true;
			}
		}
		return false;
	}
}