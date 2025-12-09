#include<bits/stdc++.h>
using namespace std;
long long n,m,ret=1,cnt,a,b,A=100,B=100;
int main(){
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>a>>b;
		if(a<b) A-=b;
		else if(a>b) B-=a;
	}
	cout<<A<<'\n'<<B;
		
}