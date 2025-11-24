//18511sol
#include<bits/stdc++.h>
using namespace std;
long long n;
int k;
vector<int>v;
long long answer = -1;

void dfs(long long curr){
	if(curr>n) return;
	answer = max(answer,curr);
	for(int x:v){
		dfs(curr*10+x); 
		//1 
		//11 15 17
		//111 151 171
		//1111 1511 1711
		//5
		//51 55 57
	}
}

int main(){
	cin>>n>>k;
	v.resize(k);
	for(int i=0;i<k;i++){
		cin>>v[i];
	}
	
	dfs(0);
	cout<<answer;
}