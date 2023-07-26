#include <iostream>
using namespace std;

// e.g
//n = 5
// E
// DE
// CDE
// BCDE
// ABCDE


void method1(int n){
	int i = 1;
	char ch;
	while(i<=n){
		int j = 1;
		while(j<=i){
			ch = ('A' + n - i) + j - 1; 
			cout << ch;
			j = j + 1;
		}
		cout<<endl;
		i = i + 1;
	}
}

void method2(int n){
	int i = 1;
	while(i<=n){
		int j = 1;
		while(j<=i){
			char ch = ('A' + n - i) + j - 1; 
			cout << ch;
			j = j + 1;
		}
		cout<<endl;
		i = i + 1;
	}
}

void method3(int n){
	int i = 1;
	while(i<=n){
		int j = 1;
		char ch = ('A' + n - i);
		while(j<=i){
			cout << ch;
			ch = ch + 1;
			j = j + 1;
		}
		cout<<endl;
		i = i + 1;
	}
}

int main(int argc, char const *argv[])
{
	cout << "Pattern 17" << endl;
	int n;
	cin >> n;
	method1(n);
	cout<<endl;
	method2(n);
	cout<<endl;
	method3(n);
	return 0;
}

