#include<bits/stdc++.h>
using namespace std;
long long n,ret=1,b,c,a;
char s;

int main(){
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>a;
		if(a==300) cout<<1<<' ';
		else if(a>=275) cout<<2<<' ';
		else if(a>=250) cout<<3<<' ';
		else cout<<4<<' ';
	}
}