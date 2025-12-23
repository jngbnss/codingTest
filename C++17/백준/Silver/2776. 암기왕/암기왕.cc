#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
ll t,n,temp,m;

int main(){
	cin>>t;
	while(t--){
		cin>>n;
		vector<ll>v(n);
		for(int i=0;i<n;i++){
			cin>>v[i];
		}
		cin>>m;
		vector<ll>v1(m);
		for(int i=0;i<m;i++){
			cin>>v1[i];
		}
		sort(v.begin(),v.end());
		
		for(auto i:v1){
			ll a = 0;
			ll b= n-1;
			bool check = false;
			while(a<=b){
				ll mid = (a+b)/2;
				if(v[mid]==i){
//					cout<<1<<'\n';
					check = true;
					break;
				}else if(v[mid]>i){
					b = mid-1;
				}else a =mid+1;
			}
			if(check==true) cout<<1<<'\n';
			else cout<<0<<'\n';
		}
	}
}