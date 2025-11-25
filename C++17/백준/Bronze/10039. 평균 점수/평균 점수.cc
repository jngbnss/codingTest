#include<bits/stdc++.h>
using namespace std;
int t,n,temp,a,b,ret;
string s;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	for(int i=0;i<5;i++){
		cin>>a;
		if(a<40) a= 40;
		ret+=a;
	}cout<<ret/5;
}