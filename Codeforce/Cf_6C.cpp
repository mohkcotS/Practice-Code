#include <bits/stdc++.h>
using namespace std;
 
int  main() {
	int n;
	cin >> n;

	int a[n];
	int x=0,y=n-1;
	for (int i = 0 ; i < n ; i++){
		int x; cin >> x;
		a[i] = x;}
		
		
	if (n == 1){
	cout << "1" << " " << "0" ;
	exit(0);}
	
	int e=a[x], f = a[y];
	while ( x <=  y){
		if (e <= f){
			x++;
			e += a [x];
		}	
		else {
			y--;
			f += a[y];
		}
	
	}
	cout << x << " " << n-x;
			
}
