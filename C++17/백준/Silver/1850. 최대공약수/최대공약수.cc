#include<bits/stdc++.h>
using namespace std;
long long a,b;
long long gcd(long long a,long long b){
	if(a==0) return b;
	return gcd(b%a,a);
}
int main(){
	cin>>a>>b;
	long long ret = gcd(a,b);
	for(int i=0;i<ret;i++){
		cout<<1;
	}
}