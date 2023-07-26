#include <bits/stdc++.h> 
using namespace std;
void reverseArray(vector<int> &arr , int m)
{
	int s = m+1;
	int e = arr.size() - 1;
	while(s <= e){
		int temp = 0;
    	temp = arr[s];
    	arr[s] = arr[e];
    	arr[e] = temp;

    	s++;
    	e--;
	}
}

int main(){
	vector<int> a = {1, 2, 3, 4, 5 ,6};
	int m = 3;
	reverseArray(a,m);
	for (int i = 0; i < a.size(); ++i)
	{
		cout << a[i];
	}
}