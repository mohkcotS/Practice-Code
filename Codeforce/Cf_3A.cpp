#include <bits/stdc++.h>
using namespace std;
 
int  main() {
	string s,t;
	int x,y; 
	cin >> s >> t;
	x = s[0] - t[0];
	y = s[1] - t[1]; 
	
	if ( abs(x) > abs(y)){cout <<  abs(x) << '\n';}  
	else {cout <<  abs(y) << '\n'; } 
	
	while ( x||y ){
		if (x>0){cout << "L"; x--;} 
		if (x<0){cout << "R"; x++;}
		if (y>0){cout << "D"; y--;} 
		if (y<0){cout << "U"; y++;} 
		cout << '\n'; 
	}		
}
