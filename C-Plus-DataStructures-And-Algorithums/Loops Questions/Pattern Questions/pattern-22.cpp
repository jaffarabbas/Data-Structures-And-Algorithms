#include <iostream>
using namespace std;

// e.g
//n = 5
//     1
//    22
//   333
//  4444
// 55555


int main(int argc, char const *argv[])
{
	cout << "Pattern 22" << endl;
	int n;
	cin >> n;
	int i = 1;
	while(i<=n){
		//for space space is decressing 
		int space  = n - i;
		while(space){
			cout << " ";
			space = space - 1;
		}
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

