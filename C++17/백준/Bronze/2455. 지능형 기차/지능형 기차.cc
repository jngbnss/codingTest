#include<bits/stdc++.h>
using namespace std;
int n,m,ret,mx;

int main(){
	for(int i=0;i<4;i++){
		cin>>n>>m;
		ret-=n;
		ret+=m;
		mx = max(mx,ret);
	}
	cout<<mx;
}