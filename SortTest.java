

class SortTest{
	
	int[] data;
	// データ数↓
	final int count = 11;
	
	SortTest(){
		init();
			System.out.println("--- BogoSort Test ---");
			System.out.println();
			System.out.println("initialized data:");
			printData();
			System.out.print("sorting...");
			long b = System.currentTimeMillis();
		sort();
			long a = System.currentTimeMillis();
			System.out.print(" MillisTime: " + (a - b) + " ms\n");
			System.out.println();
			System.out.println("sorted data:");
			printData();
			System.out.println();
	}
	
	void init(){
		// ランダムデータ作成
		data = new int[count];
		for(int i = 0; i < data.length; i++){
			data[i] = i + 1;
		}
		randomPermutation();
	}
	
	void sort(){
		while(!isSorted()){
			randomPermutation();
		}
	}
	
	boolean isSorted(){
		for(int i = 1; i < data.length; i++){
			if(data[i - 1] > data[i]){
				return false;
			}
		}
		return true;
	}
	
	void randomPermutation(){
		for(int i = 0; i < data.length; i++){
			int exchange1 = i;
			int exchange2 = ((int)(Math.random() * data.length));
			int temp = data[exchange1];
			data[exchange1] = data[exchange2];
			data[exchange2] = temp;
		}
	}
	
	void printData(){
		for(int i = 0; i < data.length; i++){
			System.out.println(data[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		new SortTest();
	}
}

/*

10-> 2s
11-> 1m
12-> 20m

*/
