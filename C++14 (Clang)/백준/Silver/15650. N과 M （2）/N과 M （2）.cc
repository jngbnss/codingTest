#include<iostream>
#include<vector>

using namespace std;
int n,m;
vector<int>v;

void go(int start,vector<int>v){
	if(v.size()==m){
		for(auto i:v){
			cout<<i<<' ';
		}cout<<'\n';
	}
	
	for(int i = start+1;i<=n;i++){
		v.push_back(i);
		go(i,v);
		v.pop_back();
	}

	
	
}
int main(){
	cin>>n>>m;
	
	go(0,v);
}