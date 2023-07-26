#include <bits/stdc++.h>
using namespace std;


int binarySearch(int arr[],int size,int key){
	int start = 0;
	int end = size - 1;
	int mid = start + (end - start) / 2;
	while(start <= end){
		if(arr[mid] == key){
			return mid;
		}
		//key is greater then mid value we will go to right or if less then go to left
		if(key > arr[mid]){
			start = mid + 1;
		}else{
			end = mid - 1;
		}
		//updating new mid
		mid = start + (end - start) / 2;
	}
	return -1;
}

int main(){
	int arr[7] = {1 , 2 , 3 , 4 , 5 , 6 , 7};
	int size = 7;
	int key = 5;
	int value = binarySearch(arr,size,key);
	cout << value;
}