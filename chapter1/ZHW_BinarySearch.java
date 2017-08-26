public class BinarySearch {
	public static void main(String[] args) {
		int[] array = new int[]{1,2,3,4};
		int result = BinarySearch(array, 6);
		System.out.println(result);
	}

	/**
	 * 折半查找
	 * @param array int数组
	 * @param item 要查找的数字
	 * @return 如果找到返回对应的下标,下标从1开始。否则返回0
	 */
	private static int BinarySearch(int[] array, int item) {
		int low = 0;
		int high = array.length - 1;
		while(low <= high) {
			int mid = (low + high) / 2;
			if(item == array[mid]) {
				return mid+1;
			}else if(item < array[mid]) {
				high = mid - 1;
			}else {
				low = mid + 1;
			}
		}
		return 0;
	}
}