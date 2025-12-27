#include<bits/stdc++.h>
using namespace std;
int n,temp,ret,m;
int visited[54];
vector<int>v[54];

void dfs(int start,int pass){
	bool check = true;
	
	for(int next:v[start]){
		if(next==pass) continue;
		check = false;
		dfs(next,pass);
	}
	if(check) ret++;
}
//	visited[start] =0;
//	if(start == pass) return;
//	
//	
//	for(auto i:v[start]){
//		if(i==pass) continue;
//		if(!visited[i]){
//			check = true;
//			dfs(i,pass);
//		}
//		if(!check) ret++;
//	}
//}
	
int main(){
	cin>>n;
	int root;
	for(int i=0;i<n;i++){
		cin>>temp;
		if(temp==-1) root =i;
		v[temp].push_back(i);
//		v[i].push_back(temp);
	}
	cin>>m;
	if(m==root){
		cout<<0;
	}else{
		dfs(root,m);
		cout<<ret;
	}
}