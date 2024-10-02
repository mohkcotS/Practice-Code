#include <bits/stdc++.h>
#include <algorithm>
using namespace std;
 
int main(){
	int n;
	cin >> n;
	for (int i =0; i<n ;i++){
		int m;
		cin >> m;
		string s;
		for (int i =0; i<m;i++){
			char a;
			cin >> a;
				s += a;	
		}	
		
		int dem = 0;
		for (int i =0; i<m;i++){
			cout << s[i];
			dem ++;
			if (dem == 3){
				if(i <m -1){
				
					cout << '.';}
				dem = 0;
			}
			
			else if (s[i+2] == 'a' || s[i+2] == 'e'){
				if(i <m -1){
				
					cout << '.';}
				dem = 0;
			}

			
		}
		cout <<"\n";
}
}
