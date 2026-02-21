#include<iostream>
#include<vector>
using namespace std;
int n,m;
vector<int>v;

void go(int idx){
	if(v.size()==m){
		for(auto i:v){
			cout<<i<<' ';
		}cout<<'\n';
		return;
	}
	for(int i=idx;i<=n;i++){
		v.push_back(i);
		go(i);
		v.pop_back();
	}
}
int main(){
	cin>>n>>m;
//	vector<int>v;
	go(1);
}