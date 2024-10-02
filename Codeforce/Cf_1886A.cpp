#include <bits/stdc++.h>
using namespace std;
int main (){
	int z;
	cin >> z;
	string a[z];
	int b[z*3];
	for (int i = 0;i<z;i++){
		int n;
		cin >> n;
		int m = n/3;
		int x = m;
		if (n%3 == 0){
			if (m%3 == 0){
				if (x-5 > 0){
				a[i] = "YES";
				b[i*3] = x-5;
				b[i*3+1] = x-2 ;
				b[i*3+2] = x + 7 ;}
				else{
				a[i] = "NO";}
			}
			
			else if (m%3 == 1){
				if (x-3 > 0){
				a[i] = "YES";
				b[i*3] = x-3;
				b[i*3+1] = x ;
				b[i*3+2] = x + 3 ;}
				else{
				a[i] = "NO";}
			}
			
			else{
				if (x-3 > 0){
				a[i] = "YES";
				b[i*3] = x-3;
				b[i*3+1] = x ;
				b[i*3+2] = x + 3 ;}
				else{
				a[i] = "NO";}
			}
		}
		
		else if (n%3 == 1){
			if (m % 3 == 0){
				if (x-2 > 0){
				a[i] = "YES";
				b[i*3] = x-2;
				b[i*3+1] = x + 1 ;
				b[i*3+2] = x + 2 ;}
				else{
				a[i] = "NO";}
			}
			else if (m % 3 == 1){
				if (x-2 > 0){
				a[i] = "YES";
				b[i*3] = x-2;
				b[i*3+1] = x ;
				b[i*3+2] = x + 3 ;}
				
				else{
				a[i] = "NO";}
			}
			else {
				if (x-1 > 0){
				a[i] = "YES";
				b[i*3] = x-1;
				b[i*3+1] = x ;
				b[i*3+2] = x + 2 ;}
				else{
				a[i] = "NO";}
			}
		}
		else{
			if(m%3 == 0){
			
				if (x-1 > 0){
				a[i] = "YES";
				b[i*3] = x-1;
				b[i*3+1] = x + 1;
				b[i*3+2] = x + 2 ;}
				else{
				a[i] = "NO";}
			}
			
			else if (m % 3 == 1){
				if (x-2 > 0){
				a[i] = "YES";
				b[i*3] = x-2;
				b[i*3+1] = x ;
				b[i*3+2] = x + 4;}
				else{
				a[i] = "NO";}		
			}
			
			else{
				if (x-1 > 0){
				a[i] = "YES";
				b[i*3] = x-1;
				b[i*3+1] = x ;
				b[i*3+2] = x + 3 ;}
				else{
				a[i] = "NO";}		
			}
		}
		
	}

	for (int i = 0;i<z;i++){
		if (a[i] == "YES"){
			cout << a[i] << "\n";
			cout << b[i*3] << " " << b[i*3+1] << " "<< b[i*3+2] << "\n";
		}
		else{
			cout << a[i] << "\n";
		}
	}
	
	
		
}
