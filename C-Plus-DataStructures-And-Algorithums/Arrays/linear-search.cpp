#include <iostream>
using namespace std;

void search(int arr[],int size,int key){
    for (int i = 0; i < size; i++)
    {
        if (arr[i] == key)
        {
            cout << "Element found at index: " << i << endl;
            return;
        }
    }
    cout << "Element not found" << endl;    
}

int main(int argc, char const *argv[])
{
	cout << "Linear Search Of Array" << endl;
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int sum = 0;
    int size = sizeof(arr)/sizeof(arr[0]);
    search(arr,size,5);
    return 0;
}