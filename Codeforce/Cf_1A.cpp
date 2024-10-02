#include <bits/stdc++.h>
using namespace std;
 
int  main() {
	long long n,m,a,x,y,z; 
	cin >> n >> m >> a;
	if ( m % a != 0){
		x = (m/a) + 1 ;}
	else {x = m/a;}	 
	
	if ( n % a != 0){
		y = (n/a) + 1 ;}
	else {y = n/a;}	 
	
	z = x * y;
	cout << z; 


}
