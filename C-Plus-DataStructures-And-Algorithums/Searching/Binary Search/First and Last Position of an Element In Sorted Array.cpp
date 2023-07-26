#include <bits/stdc++.h>
using namespace std;


int firstOccurance(int arr[],int size,int key){
	int start = 0;
	int end = size - 1;
	int mid = start + (end - start) / 2;
	int ans= -1;
	while(start <= end){
		if(arr[mid] == key){
			ans = mid;
			end = mid - 1;
		}
		//key is greater then mid value we will go to right or if less then go to left
		else if(key > arr[mid]){
			start = mid + 1;
		}else if(key < arr[mid]){
			end = mid - 1;
		}
		//updating new mid
		mid = start + (end - start) / 2;
	}
	return ans;
}

int lastOccurance(int arr[],int size,int key){
	int start = 0;
	int end = size - 1;
	int mid = start + (end - start) / 2;
	int ans= -1;
	while(start <= end){
		if(arr[mid] == key){
			ans = mid;
			start = mid + 1;
		}
		//key is greater then mid value we will go to right or if less then go to left
		else if(key > arr[mid]){
			start = mid + 1;
		}else if(key < arr[mid]){
			end = mid - 1;
		}
		//updating new mid
		mid = start + (end - start) / 2;
	}
	return ans;
}

int main(){
	int arr[6] = {1 , 2 , 4 , 4 , 5 , 6,7};
	int size = 7;
	int key = 4;
	int value = firstOccurance(arr,size,key);
	int value2 = lastOccurance(arr,size,key);
	cout << value << value2;
}