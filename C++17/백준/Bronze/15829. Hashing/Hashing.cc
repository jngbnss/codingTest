#include<bits/stdc++.h>
using namespace std;
long long ret,n,temp;
char c;
long long MOD = 1234567891;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>n;
	
	long long hash = 0;
	long long power = 1;
	
	for(int i=0;i<n;i++){
		cin>>c;
		hash = (hash+(c-'a'+1) *power) %MOD;
		power = (power*31)%MOD;
	}
	cout<<hash;
	
}