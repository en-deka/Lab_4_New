
public class Exercise1_Box {

int size = 0;
	
	void printBox() {
		
		for (int row = 0; row < size; row ++) {
			for (int columns = 0; columns < size; columns ++) { 
			System.out.print("c");
	}
			System.out.println();
	}
}
	void printBox(String c) {

		for (int row = 0; row < size; row ++) {
			for (int columns = 0; columns < size; columns ++) { 
			System.out.print(c);
	}
			System.out.println();
	}
}
	public static void main(String[] args) {
		Exercise1_Box boxsize = new Exercise1_Box();
		boxsize.size = 5;
		boxsize.printBox();
		
		

	}

	
	}


