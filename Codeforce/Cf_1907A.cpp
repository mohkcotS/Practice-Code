#include <bits/stdc++.h>
#include <string>
using namespace std;
 
 
int main(){
	int n;
	cin >> n;
	for (int i =0;i<n;i++){
		string s = {"012345678"};
		string s1 ={"abcdefgh"};
		string m;
		cin >> m;
		for (int i=1; i<= 8 ;i++){
			if ( s[i] != m[1]){
			cout << m[0] << i<< "\n";
			}	
		}
		for (int i=1; i<= 8 ;i++){
			if ( s1[i-1] != m[0]){
			cout << s1[i-1] << m[1]<< "\n";
			}	
		}
		
		
 
}
}
