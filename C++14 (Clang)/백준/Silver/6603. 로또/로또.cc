#include<iostream>
#include<vector>

using namespace std;

int n,temp,visited[15];
vector<int>v;

void go(int idx,int start){
	if(idx==6){
		for(int i=0;i<n;i++){
			if(visited[i]){
				cout<<v[i]<<' ';
			}
		}cout<<'\n';
		return;
	}
	for(int i=start;i<n;i++){
		visited[i] = 1;
		go(idx+1,i+1);
		visited[i] =0;
	}
}

int main(){
	while(true){
		cin>>n;
		v.clear();
		if(n==0){
			return 0;
		}
		for(int i=0;i<n;i++){
			cin>>temp;
			v.push_back(temp);
		}
		
		go(0,0); // idx, start
		cout<<'\n';
	}
}
			