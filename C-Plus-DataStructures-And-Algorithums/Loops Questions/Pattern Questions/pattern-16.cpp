#include <iostream>
using namespace std;

// e.g
//n = 5
// A
// BC
// CDE
// DEFG
// EFGHI

void method1(int n){
	int i = 1;
	char ch;
	while(i<=n){
		int j = 1;
		while(j<=i){
			ch = 65 + (i + j - 1) - 1; 
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
			char ch ='A' + (i + j - 1) - 1; 
			cout << ch;
			j = j + 1;
		}
		cout<<endl;
		i = i + 1;
	}
}

int main(int argc, char const *argv[])
{
	cout << "Pattern 16" << endl;
	int n;
	cin >> n;
	method1(n);
	cout<<endl;
	method2(n);
	return 0;
}

