#include<iostream>
#include<vector>

using namespace std;

int n,temp;
int visited[1004];
vector<int>v,ret;

void go(int idx){
	if(idx==n){
		for(auto i:ret){
			cout<<i<<" ";
		}cout<<'\n';
		return;
	}
	for(int i=0;i<n;i++){
		if(!visited[i]){
			visited[i] = 1;
			ret.push_back(i+1);
			go(idx+1);
			ret.pop_back();
			visited[i] =0;
		}
	}
}

int main(){
	cin>>n;
	
	for(int i=0;i<n;i++){
		v.push_back(i+1);
	}
	
	go(0);
}
