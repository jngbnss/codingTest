#include<bits/stdc++.h>
using namespace std;
long long n,k,ret,cnt;
vector<int>v;

int main(){
	cin>>n>>k;
	for(int i=0;i<n;i++){
		int temp;
		cin>>temp;
		v.push_back(temp);
	}
	sort(v.rbegin(),v.rend());
	
	for(auto i:v){
		if(i<=k){
			cnt+=k/i;
			k%=i;
		}
	}
	cout<<cnt;
	
}
	