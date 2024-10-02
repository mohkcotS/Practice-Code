#include <bits/stdc++.h>
using namespace std;
 
int main(){
	int n;
	cin >> n;
	for (int i =0; i<n ;i++){
		int m;
		cin >> m;
		int cu=0,cd=0,cl=0,cr=0;
		int s = 0;
		
		for (int j =0; j<m ;j++){
			int x , y;
			cin >> x >> y;
			if (x > 0){
				cr++;
			}
			if (x < 0){
				cl++;
			}
			if (y > 0){
				cu++;
			}
			if(y < 0){
				cd++;
			}
			
			
		}	
		
		if (cu != 0 && cd != 0 && cr != 0 && cl != 0){
				cout << "NO" << "\n";}
		
		else {
			cout << "YES" << "\n";
		}	
		
			
	}
		
		
			
}
