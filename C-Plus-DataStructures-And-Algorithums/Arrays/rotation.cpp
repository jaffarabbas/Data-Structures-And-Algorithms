#include <bits/stdc++.h> 
#include <iostream>
using namespace std;

int main() {
    //Write your code here
    vector<int> arr;
    int n;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    for (int i = 0; i < arr.size(); i++)
    {
        cout << arr[i];
    }
    return 0;
}