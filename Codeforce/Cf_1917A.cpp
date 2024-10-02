#include <bits/stdc++.h>
#include <algorithm>
using namespace std;
 
int main(){
	int n;
	cin >> n;
	for (int i =0; i<n ;i++){
		int cn=0, cp = 0, cz = 0;
		int m;
		cin >> m;
		long long a[m];
		for (int i =0; i<m;i++){
			cin >> a[i];
			if (a[i] > 0){
				cp++;
			}
			else if (a[i]<0){
				cn++;
			}
			else {
				cz ++;
			}
		}
	
		if (cn > 0){
		
			if (cn % 2 == 0 && cz == 0){
				cout << 1 << "\n" << 1 << " " << 0  << "\n";
			}	
			
			else if (cn % 2 != 0 && cz == 0 ){
				cout << 0 << "\n";
			}
			else {
				cout << 0 << "\n";
			}
			
			
		}
		else {
			if (cz > 0) {
				cout << 0 << "\n";
			}
			else {
				cout << 1 << "\n" << 1 << " " << 0  << "\n";
			}
		}
	
	
	
	}
}
