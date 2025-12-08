#include<bits/stdc++.h>
using namespace std;

int n;
int v[24];

int main(){
	
	cin>>n;
	
	v[0] = 0;
	v[1] = 1;
	for(int i=2;i<=n;i++){
		v[i] = v[i-1]+v[i-2];
	}
	cout<<v[n];
}
	