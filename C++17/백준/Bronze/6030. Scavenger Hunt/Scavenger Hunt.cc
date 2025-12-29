#include<bits/stdc++.h>
using namespace std;
int n,k;

int main(){
	cin>>n>>k;
	for(int i=1;i<=n;i++){
		if(n%i==0){
			for(int j=1;j<=k;j++){
				if(k%j==0) cout<<i<<' '<<j<<'\n';
			}
		}
	}
}