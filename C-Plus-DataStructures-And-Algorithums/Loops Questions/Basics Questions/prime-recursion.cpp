#include <iostream>
using namespace std;

void prime(int n,int r){
	bool flag = 0;
	if(flag != 1){
		if(n<r){
			if(r%n==0){
				flag = 1;
				cout << "flag : " << flag;
			}
			n++;
			prime(n,r);
		}
		cout << "Prime";
	}else{
		cout << "Not Prime";
	}
}

int main(int argc, char const *argv[])
{
	int i = 2,j;
	cin >> j;
	prime(i,j);
	return 0;
}