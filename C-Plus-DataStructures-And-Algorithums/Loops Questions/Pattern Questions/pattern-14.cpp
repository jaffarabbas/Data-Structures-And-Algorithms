#include <iostream>
using namespace std;

// e.g
//n = 5
// ABCDE
// BCDEF
// CDEFG
// DEFGH
// EFGHI

void method1(int n){
	int i = 1;
	char ch;
	int count = 1;
	while(i<=n){
		int j = 1;
		while(j<=n){
			ch = 65 + (i + j - 1) - 1;
			cout << ch;
			count = count + 1;
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
		while(j<=n){
			char ch ='A' + (i + j - 1) - 1; 
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
		char ch ='A' + i - j;
		while(j<=n){ 
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
	cout << "Pattern 14" << endl;
	int n;
	cin >> n;
	method1(n);
	cout<<endl;
	method2(n);
	cout<<endl;
	method3(n);
	return 0;
}

