#include<bits/stdc++.h>
using namespace std;
int n,temp,check;
vector<int>v;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>n;
	for(int i=1;i<=n;i++){
		temp = i;
		check = temp;
		while(temp>0){
			check+=temp%10;
			temp/=10;
		}
//		cout<<i<<" : "<<check<<'\n';
		if(check==n){
			v.push_back(i);
		}
	}
	sort(v.begin(),v.end());
//	for(auto i:v){
//		cout<<i<<'\n';
//	}
	if(v.size()){
		cout<<v[0];
	}else cout<<0;
}