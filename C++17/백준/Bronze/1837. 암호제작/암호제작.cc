#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
const int mx = 1000004;
string p; // p could be too long
ll k;
ll arr[mx+4];
void prime(){
	for(ll i=2;i*i<=k;i++){
		if(arr[i]==0){
			for(ll j=i*i;j<=k;j+=i){
				arr[j] = 1;
			}
		}
	}
}
int main(){
	cin>>p>>k;
	
	prime();
	for(ll i=2;i<k;i++){
		
		if(arr[i]==0){
			int mod = 0;
			for(auto j:p){
				mod = (mod*10 + (j-'0'))%i;
			}
			
			if(mod==0){
				cout<<"BAD "<<i;
				return 0;
			}
		}
	}
	cout<<"GOOD";
}