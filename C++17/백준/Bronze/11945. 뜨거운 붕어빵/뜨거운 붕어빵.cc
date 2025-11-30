#include<bits/stdc++.h>
using namespace std;
int n,m,d,a,b;
string s;
vector<int>v;
int arr[15][15];

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>n>>m;
	for(int i=0;i<n;i++){
		cin>>s;
		reverse(s.begin(),s.end());
		cout<<s<<'\n';;
	}
}