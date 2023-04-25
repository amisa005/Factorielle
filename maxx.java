
public class maxx {

	public static void main(String[] args) {
		int largeArray[]= {8,24,12,13,2,25,65,34,1,99,76,87,109,54}; //les elements du tableau
		
		int smallest= largeArray[0];
		int largest=  largeArray[0];
		
		for(int i=0; i<=13; i++) {
			if ( largeArray[i] < smallest) smallest = largeArray[i];
			if ( largeArray[i] > largest) largest = largeArray[i]; 
		}
		System.out.println("le minimum est: "+smallest);
		System.out.println("le maximum est: "+largest);
	}

}
