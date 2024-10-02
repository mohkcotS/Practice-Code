#include <bits/stdc++.h>
#include <algorithm>
using namespace std;
 
int main(){
	int n;
	cin >> n;
	for (int i =0; i<n ;i++){
		long long a , b;
		cin >> a >> b;
		if ((a+b) % 2 == 0){
			cout << "Bob" << "\n";
		}	
		else {
			cout << "Alice" << "\n";
		}
	}
		
}
