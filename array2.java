package ARRAY;

public class array2 {

	public static void main(String[] args) {
		int[] arr= {2,3,4,5,7};
		System.out.println(arr[0]+" "+arr[1]);
		Swap(arr[0],arr[1]);
		System.out.println(arr[0]+" "+arr[1]);
	}
	public static void Swap(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
		
	}

}
