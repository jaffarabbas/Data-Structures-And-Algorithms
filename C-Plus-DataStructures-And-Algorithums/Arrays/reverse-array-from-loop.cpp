#include <iostream>
using namespace std;

int main(int argc, char const *argv[])
{
	cout << "Reverse Of Array" << endl;
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int sum = 0;
    int size = sizeof(arr)/sizeof(arr[0]);
    for (int i = size - 1; i >= 0; i--)
    {
        cout << arr[i] << endl;
    }
    
    return 0;
}