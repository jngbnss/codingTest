#include<iostream>
#include<vector>
#include<cmath>
using namespace std;
int n,temp,ret=-1;
vector<int>v,list;
int visited[10];


void cal(vector<int>list){
	int temp =0;
	for(int i=0;i<n-1;i++){
		temp+=abs(list[i]-list[i+1]);
	}
	ret = max(ret,temp);
}

void go(int idx,vector<int>list){
	if(idx==n){
		cal(list);
	}
	for(int i=0;i<n;i++){
		if(!visited[i]){
			visited[i] = 1;
			list.push_back(v[i]);
			go(idx+1,list);
			list.pop_back();
			visited[i] =0;
		}
	}
	
}

int main(){
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>temp;
		v.push_back(temp);
	}
	go(0,list);
	cout<<ret;
}
