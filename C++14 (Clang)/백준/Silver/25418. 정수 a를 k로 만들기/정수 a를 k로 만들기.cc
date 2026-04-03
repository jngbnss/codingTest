#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
ll a,k;
ll memo[1000004];

ll dp(int idx){
	if(idx==a){
		return memo[idx] = 0;
	}
	if(idx<=a){
		return memo[idx] = 1e9;
	}
	
	if(memo[idx] != -1){
		return memo[idx] ;
	}
	
	memo[idx] = dp(idx-1)+1;
	if(idx%2==0){
		memo[idx] =  min(memo[idx],dp(idx/2)+1);
	}
	return memo[idx];
}

int main(){
	cin>>a>>k;
	fill(memo,memo+1000004,-1);
	dp(k);
	cout<<memo[k];
}