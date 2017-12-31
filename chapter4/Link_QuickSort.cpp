#include <iostream>
using namespace std;

//找出基准元的下标，并且完成元素的分块
//找出基准元的方法很多，取第一个或者最后一个都不是一个好方法
//具体可以自行上网查阅资料
int Sort(int arr[], int left, int right) {
	//取第一个元素为基准元
	int pivotValue = arr[left];

	//使用双向扫描法完成分块
	//基准元的左边都小于他，右边都大于他
	while (left < right) {
		while (left < right && arr[right] >= pivotValue) {
			right--;
		}
		arr[left] = arr[right];
		while(left < right && arr[left] <= pivotValue) {
			left++;
		}
		arr[right] = arr[left];
	}
	arr[left] = pivotValue;
	return left;
}

int quickSort(int arr[], int left, int right) {
	if (left < right)
	{
		//分块后基准元的下标
		int pivot = Sort(arr, left, right);
		//对分块后的部分进行排序
		quickSort(arr, left, pivot - 1);
		quickSort(arr, pivot + 1, right);
	}
}

int main()
{
	int arr[10] = {1,4,5,8,9,6,2,3,7,10};
    int length = sizeof(arr)/sizeof(int);
	quickSort(arr, 0, length-1);

	for(int i = 0; i < length; i++) {
		cout<<arr[i]<<" ";
	}
	cout<<endl;
	return 0;
}
