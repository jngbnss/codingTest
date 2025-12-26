#include<bits/stdc++.h>
using namespace std;
int n,a,b,c,d,ret;
int main(){
	while(true){
		cin>>n;
		if(n==0) return 0;
		ret =0;
		for(int i=1;i<=n;i++){
			ret+=i;
		}cout<<ret<<'\n';
	}
}