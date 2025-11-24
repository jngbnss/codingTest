#include<bits/stdc++.h>
using namespace std;
int a,b,c,ret,e,mx;
int arr[104];
string s;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>s;
	string s1 = s;
	reverse(s.begin(),s.end());
	if(s==s1) cout<<1;
	else cout<<0;
}