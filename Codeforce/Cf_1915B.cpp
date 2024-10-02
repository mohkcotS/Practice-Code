#include <bits/stdc++.h>
#include <algorithm>
using namespace std;
 
int main(){
	int n;
	cin >> n;
	for (int i =0; i<n ;i++){
		int ca=0,cb=0,cc=0;
		for (int i =0;i<9;i++){
				char a;
				cin >> a;
				if (a == 'A'){
					ca++;	
				}
				else if(a == 'B'){
					cb++;
				}
				else if(a == 'C'){
					cc++;
				}
			}
		if ( ca == 2){
			cout << "A" <<"\n";
		}
		else if (cb == 2){
			cout << "B"  <<"\n";
		}
		if (cc == 2){
			cout << "C"  <<"\n";
		}
}
}
