/**
 * 
 * @author Hanwen
 * @date 2017年8月28日 下午5:45:48
 * @version
 */
public class SelectSort {
	public static void main(String[] args) {
		int[] array = new int[]{1,4,5,8,9,6,2,3,7,10};
		int[] result = findMinNumber(array);
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i]+ " ");
		}
	}
	
	/**
	 * 选择排序
	 * @param array	数组
	 * @return 排序好的数组(从小到大)
	 */
	private static int[] findMinNumber(int[] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = i+1; j < array.length; j++) {
				if(array[i] > array[j]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		return array;
	}
}