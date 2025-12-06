#include<bits/stdc++.h>
using namespace std;
int n,m,sum,temp;
vector<int>v;
set<int>ret;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>n>>m;
	for(int i=0;i<n;i++){
		cin>>temp;
		v.push_back(temp);
	}
	for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
			for(int k=j+1;k<n;k++){
				sum = v[i]+v[j]+v[k];
//				cout<<sum<<'\n';
				ret.insert(sum);
			}
		}
	}
	//temp = ret[0];
	for(auto i :ret){
		if(i<=m) temp =i;
	}
	cout<<temp;
	
}