#include <iostream>
using namespace std;

int main(int argc, char const *argv[])
{
    cout << "Swap Alternative Of Array" << endl;
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int size = sizeof(arr) / sizeof(arr[0]);
    //code 
    for (int i = 0; i < size; i +=2 )
    {
        if(i+1 < size){
            swap(arr[i],arr[i+1]);
        }
    }
    for (int i = 0; i < size; i++)
    {
        cout << arr[i] << " ";
    }
    return 0;
}