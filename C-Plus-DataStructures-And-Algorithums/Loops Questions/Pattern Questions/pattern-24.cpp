#include <iostream>
using namespace std;

// e.g
//n = 5
//     1
//    23
//   456
//  78910
// 1112131415


int main(int argc, char const *argv[])
{
	cout << "Pattern 24" << endl;
	int n;
	cin >> n;
	int i = 1;
	int count  = 1;
	while(i<=n){
		//for space space is decressing 
		int space  = n - i;
		while(space){
			cout << " ";
			space = space - 1;
		}
		int j = 1;
		while(j<=i){
			cout << count;
			count = count + 1;
			j = j + 1;
		}
		cout<<endl;
		i = i + 1;
	}
	return 0;
}

