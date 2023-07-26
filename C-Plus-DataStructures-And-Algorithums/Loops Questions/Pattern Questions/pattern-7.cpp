#include <iostream>
using namespace std;

// e.g
//n = 5
// 1
// 22
// 333
// 4444
// 55555

int main(int argc, char const *argv[])
{
	cout << "Pattern 7" << endl;
	int n;
	cin >> n;
	int i = 1;
	while(i<=n){
		int j = 1;
		while(j<=i){
			cout << i;
			j = j + 1;
		}
		cout<<endl;
		i = i + 1;
	}
	return 0;
}