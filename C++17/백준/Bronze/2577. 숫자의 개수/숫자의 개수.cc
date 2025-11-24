#include<bits/stdc++.h>
using namespace std;
int n,idx,mn=1e9,mx=-1e9,temp,cnt;
long long a,b,c;
double sum;
string s;
vector<int>v;
set<int>st;
int arr[10];

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	string s;
	cin>>a>>b>>c;
	long long ret= a*b*c;
	while(ret>0){
		arr[ret%10]++;
		ret/=10;
	}
	for(auto i:arr){
		cout<<i<<'\n';
	}
	
	
}