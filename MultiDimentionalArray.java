public class MultiDimentionalArray{
	public static void main(String[] args){
		
		int[][] numbers = {{5,6,8,9,3},{6,8,2,5,7}}; // initialize
		
		for(int[] row : numbers){
			for(int num : row){
				System.out.printf("%d%n",num);
			}
		}
	}
}