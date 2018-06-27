#include <iostream>
using namespace std;

int main()
{
	int arr[10] = {1,4,5,8,9,6,2,3,7,10};

	int length = sizeof(arr)/sizeof(arr[0]);
	for(int i = 0; i < length; i++) {
		for(int j = i+1; j < length; j++) {
			if(arr[i] > arr[j]) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
	}

	for(int i = 0; i < length; i++) {
		cout<<arr[i]<<" ";
	}
	cout<<endl;

	return 0;
}