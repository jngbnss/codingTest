#include<bits/stdc++.h>
using namespace std;
int n,ret,a,b,idx,mn=1e9,mx=-1e9,temp,cnt;
double sum;
string s;
vector<int>v;
set<int>st;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	
	for(int i=0;i<10;i++){
		cin>>temp;
		st.insert(temp%42);
	}cout<<st.size();
}