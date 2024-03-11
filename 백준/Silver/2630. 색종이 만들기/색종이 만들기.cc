#include <iostream>

using namespace std;

bool screen[128][128];
int w = 0, b = 0;

void divide(int y, int x, int size) {
	bool pixel = screen[y][x];

	for (int i = y; i < size + y; i++) {
		for (int k = x; k < size + x; k++) {
			if (pixel != screen[i][k]) {
				// 재귀 시행
				// 좌상
				divide(y, x, size / 2);
				// 우상
				divide(y, (size / 2) + x, size / 2);
				// 좌하
				divide((size / 2) + y, x, size / 2);
				// 우하
				divide((size / 2) + y, (size / 2) + x, size / 2);
				// return
				return;
			}
		}
	}

	if (pixel == 1) b++;
	else w++;
	
	return;
}

int main() {

		int n;

		cin >> n;

		for (int i = 0; i < n; i++) {
			for (int k = 0; k < n; k++) {
				cin >> screen[i][k];
			}
		}


		divide(0, 0, n);

		cout << w << '\n' << b;

	return 0;
}