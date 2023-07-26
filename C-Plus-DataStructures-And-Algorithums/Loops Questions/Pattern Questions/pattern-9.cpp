#include <iostream>
using namespace std;

// e.g
//n = 5
// 1
// 23
// 345
// 4567
// 56789

void method1(int n){
	int i = 1;
	while(i<=n){
		int j = 1;
		while(j<=i){
			cout << i + j - 1;
			j = j + 1;
		}
		cout<<endl;
		i = i + 1;
	}
}

void method2(int n){
	int i = 1;
	while(i<=n){
		int temp = i;
		int j = 1;
		while(j<=i){
			cout << temp;
			temp = temp + 1;
			j = j + 1;
		}
		cout<<endl;
		i = i + 1;
	}
}

int main(int argc, char const *argv[])
{
	cout << "Pattern 9" << endl;
	int n;
	cin >> n;
	method1(n);
	method2(n);
	return 0;
}

