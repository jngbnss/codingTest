#include<bits/stdc++.h>
using namespace std;
int n,x,y,ret,sum,l,a,b,c,d;
vector<int>v,v1;

int main(){
	cin>>l>>a>>b>>c>>d;
	ret = a/c;
	if(a%c) ret++;
	sum = b/d;
	if(b%d) sum++;
	ret = max(ret,sum);
	cout<<l-ret;
}