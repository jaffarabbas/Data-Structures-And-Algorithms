#include <iostream>
using namespace std;

// e.g
//n = 5
// 1234554321
// 1234**4321
// 123****321
// 12******21
// 1********1


int main(int argc, char const *argv[])
{
	cout << "Pattern 26" << endl;
	int n;
	cin >> n;
	int i = 1;
	while(i<=n){
		int j = i;
		while(j<=n){
			cout << j - i + 1;
			j = j + 1;
		}
		int s = 1;
		while(s<i){
			cout << "*";
			s = s + 1;
		}
		int s2 = 1;
		while(s2<i){
			cout << "*";
			s2 = s2 + 1;
		}
		int f = n - i + 1;
		while(f){
			cout << f;
			f = f - 1;
		}
		cout<<endl;
		i = i + 1;
	}
	return 0;
}

