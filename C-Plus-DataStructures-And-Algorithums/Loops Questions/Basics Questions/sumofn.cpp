#include <iostream>
using namespace std;

int main(int argc, char const *argv[])
{
	int n;
	int sum = 0;
	cin >> n;
	for (int i = 1; i <= n; ++i)
	{
		sum += i;
	}
	cout << "Sum of " << n << " : " << sum;
	return 0;
}