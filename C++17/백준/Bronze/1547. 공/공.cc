#include<bits/stdc++.h>
using namespace std;
long long n,m,ret=1,cnt,a,b;
int main(){
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>a>>b;
		if(a==ret) ret=b;
		else if(b==ret) ret=a;
	}
	cout<<ret;
}