#include<bits/stdc++.h>
using namespace std;
long long n,m,k,sum,temp,mx=-4001,mn=4001;
vector<int>ret;
deque<int>v;
map<int,int>mp;
int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>n>>k;
	for(int i=1;i<=n;i++){
		v.push_back(i);
	}
//	for(auto i:v){
//		cout<<i<<' ';
//	}cout<<'\n';
	
	while(v.size()){
//	for(int j=0;j<3;j++){
		for(int i=1;i<k;i++){
			temp = v.front();
			v.push_back(temp);
			v.pop_front();
		}
		
//		for(auto i:v){
//			cout<<i<<' ';
//		}cout<<'\n';
//		cout<<v[0]<<'\n';
		ret.push_back(v[0]);
		
		
		v.pop_front();
	}
	cout<<'<';
	for(int i=0;i<ret.size()-1;i++){
		cout<<ret[i]<<", ";
	}
	cout<<ret[ret.size()-1];
	cout<<'>';

	
		
}
