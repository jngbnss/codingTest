#include<bits/stdc++.h>
using namespace std;
int n,ret,a,b,idx,mn=1e9,mx=-1e9;
int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>a;
	for(int i=0;i<a;i++){
		cin>>n;
		mn = min(mn,n);
		mx = max(mx,n);
		
	}
	cout<<mn<<' '<<mx;
}