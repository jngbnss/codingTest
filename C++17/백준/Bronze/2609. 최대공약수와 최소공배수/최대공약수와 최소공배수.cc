#include<bits/stdc++.h>
using namespace std;
int a,b;
int gcd(int a,int b){
	if(a==0) return b;
	return gcd(b%a,a);
}

int main(){
	cin>>a>>b;
	cout<<gcd(a,b)<<'\n';
	cout<<a*(b/gcd(a,b));
}