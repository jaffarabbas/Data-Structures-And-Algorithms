#include <iostream>
#include <bits/stdc++.h>

using namespace std;

bool uniqueOccurrences(vector<int>& arr) {
     unordered_map<int, int> countMap;

    // Count the occurrences of each value in the array
    for (int num : arr) {
        countMap[num]++;
    }

    unordered_set<int> occurrenceSet;

    // Check if the number of occurrences is unique
    for (const auto& pair : countMap) {
        if (occurrenceSet.find(pair.second) != occurrenceSet.end()) {
            return false; // Duplicate occurrence found
        }
        occurrenceSet.insert(pair.second);
    }

    return true;
}

int main(int argc, char const *argv[])
{
    vector<int> arr = {1,2};
    cout << uniqueOccurrences(arr);
    return 0;
}