#include <bits/stdc++.h>
using namespace std;
 
int main()
{
  long long n;
  cin >> n;
  int z [n];
  long long i,j,k,l,m;
  for (i =0; i<n; i++){
      long long a,b;
      cin >> a >> b;
      int x[a];
      for (j = 0; j<a; j++){
        cin >> x[j];}
    int y[a+1];
    y[0] = x[0];
    for (k = 1; k<a;k++){
        y[k] = x[k] - x[k-1];
    }
    
    long long end = (b-x[a-1]) * 2;
    if (a == 1){
       y[1] = end;
    }
    else{
        y[a] = end;
    }
    
    
    long long max = y[0];
    for( l = 1;l<=a;l++){
        if (y[l] >= max){
            max = y[l];
        }
    }
    z[i] = max;

	    
  }
	 
 	for ( m  = 0;m<n;m++){
      cout << z[m] << "\n";
  }
}
