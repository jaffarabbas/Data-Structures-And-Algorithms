#include <iostream>
using namespace std;
# define my_sizeof(type) ((char *)(&type+1)-(char*)(&type))

int main(int argc, char const *argv[])
{
	cout << "Sum Of Array" << endl;
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int sum = 0;
    int size = sizeof(arr)/sizeof(arr[0]);
    for (int i = 0; i < size; i++)
    {
        sum += arr[i];
    }
    cout << "Sum of array is: " << sum << endl;
	return 0;
}