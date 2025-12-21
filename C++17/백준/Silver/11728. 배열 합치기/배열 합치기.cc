#include<bits/stdc++.h>
using namespace std;
long long n,m,temp;
set<long long>st;
vector<int>v;
int main(){
	cin>>n>>m;
	for(int i=0;i<n;i++){
		cin>>temp;
		v.push_back(temp);
	}
	for(int i=0;i<m;i++){
		cin>>temp;
		v.push_back(temp);
//		st.insert(temp);
	}
	sort(v.begin(),v.end());
	for(auto i:v){
		cout<<i<<' ';
	}
}