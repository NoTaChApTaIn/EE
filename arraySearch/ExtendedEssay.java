public class ExtendedEssay {
	
	public static void main(String args[]){
		
		long startTime = System.nanoTime();
		//Pi1
		System.out.println("Program Initialized by Pi#1: 192.168.0.22");
		
		int num[] = {5,78,22,4,7,8674,5,346,7,94,369,35,83,464,889,9,6545,345673,85,88,8998};
		int target = 9;
		//initialize the program here
		
		
		//summary Pi1
		long p1 = System.nanoTime();
		long p1Time = p1 - startTime;
		double Seconds = p1Time/1000000;
		System.out.println("Packet Recieved @ time: " + Seconds + "ms");
		
		//Pi2
		System.out.println("Packet Recieved by Pi#2: 192.***.0.24");
		
		//binary search/sort 1
		
		
		//summary Pi2
		long p2 = System.nanoTime();
		long p2Time = p2 - startTime;
		Seconds = p2Time/1000000;
		System.out.println("Packet Recieved @ time: " + Seconds + "ms");
		
		//Pi3
		System.out.println("Packet Recieved by Pi#3: 192.***.0.25");
		
		//binary search/sort 2 b  
		
		
			
		
		//summary Pi3
		long p3 = System.nanoTime();
		long p3Time = p3 - startTime;
		Seconds = p3Time/1000000;
		System.out.println("Packet Recieved @ time: " + Seconds + "ms");
		
		//Pi4
		System.out.println("Packet Recieved by Pi#4: 192.***.0.26");
		long endTime = System.nanoTime();
		
		//Total Time
		long totalTime = endTime - startTime;
		Seconds = totalTime/1000000;
		System.out.println("The speed is: " + Seconds + "ms");
		
	
	
		}
	
	}
