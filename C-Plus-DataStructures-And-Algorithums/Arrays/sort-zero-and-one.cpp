#include <bits/stdc++.h>

// void sort012(int *arr, int n)
// {
// 	int i =0;
// 	int j = n - 1;
// 	while(i<j){
// 		while(arr[i] == 0 && i < j){
// 			i++;
// 		}
// 		while(arr[j] == 1 && i < j){
// 			j--;
// 		}
// 		if(i < j){
// 		    swap(arr[i],arr[j]);
// 	    	i++;j--;
// 		}
// 	}
// }

void sort012(int *arr, int n){
	int i = 0;
	int j = n -1;
	int m = 0;
	while(m <= j){
		if(arr[mid] == 0){
			swap(arr[i],arr[m]);
			i++;
			m++;
		}else if(arr[m] == 1){
			m++;
		}else if(arr[m] == 2){
			swap(arr[m],arr[j]);
			j--;
		}
	}
}
int main(){

}