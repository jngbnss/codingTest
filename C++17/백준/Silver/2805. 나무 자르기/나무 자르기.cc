#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
ll n,m,mid,a,b,mx,mn=1e9,result;
vector<ll>v;

int main(){
	cin>>n>>m;
	for(int i=0;i<n;i++){
		ll temp;
		cin>>temp;
		v.push_back(temp);
		mx = max(mx,temp);
		mn = min(mn,temp);
	}
	
	a = 0;
	b = mx;
	ll mid = (a+b)/2;
	ll ret = 0;
	while(a<=b){
		ret = 0;
		mid = (a+b)/2;
		for(auto i:v){
			if(i-mid>0){
				ret+=i-mid;
			}
		}
		if(ret>=m){ // have to low then mid up
		result = mid;
			a = mid+1;
			
		}else if(ret<m){// have to upper then mid down
			b = mid-1;
		}
	}
	cout<<result;
}
			
			