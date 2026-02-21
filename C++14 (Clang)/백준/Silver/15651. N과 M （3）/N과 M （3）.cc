#include<iostream>
#include<vector>

using namespace std;

int n,m;
vector<int>v;
void go(vector<int>v){
	if(v.size()==m){
		for(auto i:v){
			cout<<i<<' ';
		}cout<<'\n';
		return;
	}
	
	for(int i=1;i<=n;i++){
		v.push_back(i);
		go(v);
		v.pop_back();
	}
	
	
}
int main(){
	cin>>n>>m;
	vector<int>v;
	go(v);
}
