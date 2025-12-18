#include<bits/stdc++.h>
using namespace std;
int n,c;
vector<int>v;
map<int,int>cnt,order;

bool cmp(int a,int b){
	if(cnt[a]==cnt[b]){
		return order[a]<order[b];
	} return cnt[a]>cnt[b];
}

int main(){
	cin>>n>>c;
	
	for(int i=0;i<n;i++){
		int temp;
		cin>>temp;
		v.push_back(temp);
		cnt[temp]++;
		if(order[temp]==0) order[temp] = i+1;
	}
	
	sort(v.begin(),v.end(),cmp);
	for(auto i:v){
		cout<<i<<' ';
	}
}