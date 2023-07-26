#include <iostream>
using namespace std;

void reverse(int arr[],int size){
    int s = 0;
    int e = size - 1;
    while(s <= e){
    	int temp = 0;
    	temp = arr[s];
    	arr[s] = arr[e];
    	arr[e] = temp;

    	s++;
    	e--;
    }
}

int main(int argc, char const *argv[])
{
	int arr[5] = {1,2,3,4,5};
	int arr2[4] = {1,2,3,4};
	for (int i = 0; i < 5; ++i)
	{
		cout << arr[i];
	}
    reverse(arr,5);
    cout << "\n";
    for (int i = 0; i < 5; ++i)
	{
		cout << arr[i];
	}
    cout << "\n";
	for (int i = 0; i < 4; ++i)
	{
		cout << arr2[i];
	}
    reverse(arr2,4);
    cout << "\n";
    for (int i = 0; i < 4; ++i)
	{
		cout << arr2[i];
	}
}