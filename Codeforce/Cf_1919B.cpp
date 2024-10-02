#include <bits/stdc++.h>
#include <algorithm>
using namespace std;
 
int main(){
	int n;
	cin >> n;
	for (int i =0; i<n ;i++){
		int m;
		cin >> m;
		long long cp =0, cm =0;
		for (int j =0; j<m;j ++){
			char x;
			cin >> x;
			if ( x == '+'){
				cp++;
			}
			else {
				cm ++;
			}
		}
		if (cp > cm){
			cout << m - (cm * 2) << "\n";
		}
		else{
			cout << m - (cp * 2) << "\n";
		}
		
	}
		
}
