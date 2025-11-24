#include<bits/stdc++.h>
using namespace std;
int n,ret,a,b,idx,mn=1e9,mx=-1e9,temp,cnt;
string s;
int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>temp;
		bool check  = false;
		if(temp==1) continue;
		for(int j=2;j<temp;j++){
			if(temp%j==0){
				check = true;
				break;
			}
		}
		if(check) continue;
		else cnt++;
	}
	cout<<cnt;
}