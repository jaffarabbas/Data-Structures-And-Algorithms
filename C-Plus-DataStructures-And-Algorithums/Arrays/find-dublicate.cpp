#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int findDuplicate(vector<int> &arr) 
{
    int ans = 0;
    for (int i = 0; i < arr.size(); ++i)
    {
        ans = ans^arr[i];
    }
    for (int i = 0; i < arr.size(); ++i)
    {
        ans = ans^i;
    }
    return ans;
}


int main(int argc, char const *argv[])
{
	vector<int> v = {1 ,1 ,2};
    cout << findDuplicate(v);
}