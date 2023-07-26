#include <iostream>
using namespace std;

int main(int argc, char const *argv[])
{
	cout << "Find Unique Of Array" << endl;
    int arr[] = {2 ,3 ,1 ,6 ,3 ,6 ,2};
    int size = sizeof(arr)/sizeof(arr[0]);
    int unique = 0;
    for (int i = 0; i < size; i++)
    {
        unique = unique^arr[i]; 
    }
    cout << "Unique : " << unique << endl;
    return 0;
}