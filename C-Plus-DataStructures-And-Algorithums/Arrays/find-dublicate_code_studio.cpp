#include <bits/stdc++.h>
using namespace std;

int findDuplicate(vector<int> &arr, int n){
    vector<int> count(n, 0);

    for (int num : arr) {
        count[num]++;
        if (count[num] > 1) {
            return num;
        }
    }

    return -1;  // Ret
}

int main(){
    vector<int> a = {1, 1, 3, 4, 5 ,6};
    cout << findDuplicate(a,a.size());
}