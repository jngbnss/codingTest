#include<bits/stdc++.h>
using namespace std;
int n,m,ret;
vector<int>v;

int main(){
	cin>>n>>m;
	for(int i=1;i<=100;i++){
		if(i*i>=n){
			if(i*i<=m){
				ret+=i*i;
				v.push_back(i*i);
			}
		}
		if(i*i>m) break;
	}
	if(v.empty()){
		cout<<-1;
		return 0;
	}
	cout<<ret<<'\n';
	sort(v.begin(),v.end());
	cout<<v[0];
}