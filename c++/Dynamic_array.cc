//https://www.hackerrank.com/challenges/dynamic-array/submissions/code/42851413


#include <algorithm>
#include <cmath>
#include <cstdio>
#include <iostream>
#include <iterator>
#include <map>
#include <queue>
#include <regex>
#include <set>
#include <sstream>
#include <stack>
#include <string>
#include <vector>

using namespace std;

int main(int argc, char *argv[]) {
    int N, Q;
    cin >> N >> Q;
    vector<vector<int>> nums(N);

    int last = 0;
    for (int q = 1; q <= Q; q++) {
        int op, x, y;
        cin >> op >> x >> y;
        if (op == 1) {
            nums[(x ^ last) % N].push_back(y);
        } else {
            vector<int> list = nums[(x ^ last) % N];
            last = list[y % list.size()];
            cout << last << endl;
        }
    }

    return 0;
}
