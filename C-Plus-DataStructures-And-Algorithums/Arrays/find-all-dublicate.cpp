#include <iostream>
#include <bits/stdc++.h>

using namespace std;

vector<int> findDuplicates(vector<int>& nums) {
    map<int,int> m;
    vector<int> ans;
    int count =0;
    while(count < nums.size()){
        if(m[nums[count]] == 0){
            m[nums[count]]++;
        }else{
            ans.push_back(nums[count]);
        }
        count++;
    }
    return ans;
}

int main(int argc, char const *argv[])
{
	vector<int> v = {4,3,2,7,8,2,3,1};;
    vector<int> a = findDuplicates(v);
    for (int i = 0; i < a.size(); ++i)
    {
        cout << a[i];
    }
}