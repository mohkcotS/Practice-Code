#include <bits/stdc++.h>
#include <algorithm>
using namespace std;
 
int main(){
	int n;
	cin >> n;
	for (int i =0; i<n ;i++){
		int a,b,c;
		cin >> a >> b >> c;
		if (a == b ){
			cout << c << "\n";
		}	
		
		else if (a == c ){
			cout << b << "\n";
		}
		
		else {
			cout << a << "\n";
		}	
}
}
