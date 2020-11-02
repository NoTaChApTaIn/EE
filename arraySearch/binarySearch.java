import java.util.*;

class binarySearch{
	
	int binaryBoi(int arr[], int l, int r, int target){
		if (r>=1){
			int mid = l+(r-l)/2;
			if(arr[mid] == target){
				return mid;
			}
			if(arr[mid] == target){
				return binaryBoi(arr, l, mid-1, target);
			}
			
			return binaryBoi(arr, mid+1, r, target);
			
		}
		return -1;
	}
	public static void main(String[] args){
		//making the array
		System.out.println("Make the array");
		int arr[] = new int [100];
		int n = arr.length;
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		binaryBoi ob = new binaryBoi();
		for(int i = 0; i < arr.length; i++){
			arr[i] = rand.nextInt(100);
		}
		//printing the array
		for(int i = 0; i < arr.length; i++){
				System.out.println("Pos " + i + " = " + arr[i]);
		}
		//target selection
		System.out.print("Choose a value to find: ");
		int target = input.nextInt();
		System.out.println("Find the value: " + target);
		
		//binary search time
		
		int r = ob.binaryBoi(arr, target);
		if (r == -1){
			System.out.println("NOT PRESENT");
		}
		else {
			System.out.println("Element found at pos: " + r);
		}
		
		
		
	}
}
