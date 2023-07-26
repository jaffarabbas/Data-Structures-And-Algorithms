#include <iostream>
#include <climits>

using namespace std;

int getMax(int arr[] , int size){
	int maxi = INT_MIN;
	for (int i = 0; i < size; ++i)
	{
		maxi = max(maxi,arr[i]);
		// if(arr[i] > max){
		// 	max = arr[i];
		// }
	}

	return maxi;
}


int getMin(int arr[] , int size){
	int mini = INT_MAX;
	for (int i = 0; i < size; ++i)
	{
		mini = min(mini,arr[i]);
		// if(arr[i] < min){
		// 	min = arr[i];
		// }
	}

	return mini;
}
int main(){
	int size;
	cin >> size;

	int arr[100];

	for (int i = 0; i < size; ++i)
	{
		cin >> arr[i];
	}
	//max
	cout << getMax(arr,size) << endl;
	cout << getMin(arr,size) << endl;
}
