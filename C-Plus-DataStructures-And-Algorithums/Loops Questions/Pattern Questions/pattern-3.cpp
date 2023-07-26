#include <iostream>
using namespace std;

// e.g
//n = 5
// 12345
// 12345
// 12345
// 12345
// 12345

int main(int argc, char const *argv[])
{
	cout << "Pattern 3" << endl;
	int n;
	cin >> n;
	int i = 1;
	while(i<=n){
		int j = 1;
		while(j<=n){
			cout << j;
			j = j + 1;
		}
		cout<<endl;
		i = i + 1;
	}
	return 0;
}