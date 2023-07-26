#include <iostream>
using namespace std;

// e.g
//n = 5
// ABCDE
// ABCDE
// ABCDE
// ABCDE
// ABCDE

void method1(int n){
	int i = 1;
	char ch;
	while(i<=n){
		int j = 1;
		while(j<=n){
			ch = 65 + j - 1;
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
		while(j<=n){
			char ch ='A' + j - 1; 
			cout << ch;
			j = j + 1;
		}
		cout<<endl;
		i = i + 1;
	}
}

int main(int argc, char const *argv[])
{
	cout << "Pattern 12" << endl;
	int n;
	cin >> n;
	method1(n);
	cout<<endl;
	method2(n);
	return 0;
}

