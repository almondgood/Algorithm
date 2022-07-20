#include <iostream>
#include <string>
#include <stack>

using namespace std;

int main() {
	string str = "";
	
	
	while (true) { // n번

		stack<char> s;
		getline(cin, str);
		bool isBalance = true;
		if (str == ".")	break;
		
		for (int i = 0; i < str.length(); i++) {
			if (str[i] == '(' || str[i] == '[') s.push(str[i]);

			else if (str[i] == ')') {
				if (!s.empty() && s.top() == '(') s.pop();
				else isBalance = false;
			}
			else if (str[i] == ']') {
				if (!s.empty() && s.top() == '[') s.pop();
				else isBalance = false;
			}
			if (!isBalance) break;
		}
		
		if (isBalance && s.empty()) cout << "yes" << '\n';
		else cout << "no" << '\n';

	}
	return 0;
}