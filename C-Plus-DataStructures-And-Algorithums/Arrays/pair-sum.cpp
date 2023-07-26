#include <bits/stdc++.h>
vector<vector<int>> findTriplets(vector<int> arr, int n, int K) {
    vector<vector<int>> triplets;
    sort(arr.begin(), arr.end()); // Sort the array in ascending order

    for (int i = 0; i < n - 2; i++) {
        if (i > 0 && arr[i] == arr[i - 1])
            continue; // Skip duplicates to avoid duplicate triplets

        int target = K - arr[i];
        int left = i + 1;
        int right = n - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                triplets.push_back({arr[i], arr[left], arr[right]});
                left++;
                right--;

                // Skip duplicates to avoid duplicate triplets
                while (left < right && arr[left] == arr[left - 1])
                    left++;
                while (left < right && arr[right] == arr[right + 1])
                    right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }

    return triplets;
}

int main(int argc, char const *argv[])
{
   
   return 0;
}