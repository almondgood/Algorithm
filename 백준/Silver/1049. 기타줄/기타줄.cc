#include <iostream>
#include <vector>
#include <map>
#include <algorithm>
using namespace std;

int main() {
    cin.tie(0)->sync_with_stdio(0);

    int ans = 0;
    int n, m;
    cin >> n >> m;

    vector<int> pack;
    vector<int> each;

    for (int i = 0; i < m; i++) {
        int p, e;
        cin >> p >> e;
        pack.push_back(p);
        each.push_back(e);
    }

    for (int i : each) {
        pack.push_back(i * 6);
    }

    sort(pack.begin(), pack.end());
    sort(each.begin(), each.end());

    ans += (n / 6) * pack.front();
    n %= 6;

    if (pack.front() < n * each.front()) {
        ans += pack.front();
    }
    else {
        ans += n * each.front();
    }

    cout << ans;

    return 0;
}
