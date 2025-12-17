#include<bits/stdc++.h>
using namespace std;
long long a,b,c,ret;

long long go(long long a,long long b){
	if (b==1) return a%c;
	ret = go(a,b/2);
	ret = (ret*ret)%c;
	if(b%2) ret = ret*a%c;
	return ret;
}

int main(){
	cin>>a>>b>>c;
	cout<<go(a,b);
}