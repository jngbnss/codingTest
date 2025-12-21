//combination problem
#include<bits/stdc++.h>
using namespace std;
long long n,a,b,ret;
int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>n;
	while(n--){
		cin>>a>>b;
		ret =1;
		long long mid = min(b-a,a);
		if(mid==0){
			ret =1;
		}else{
			for(long long i = b-mid+1;i<=b;i++){
				ret*=i;
			}
			for(long long i=1;i<=mid;i++){
				ret/=i;
			}
		}
		cout<<ret<<'\n';
	}
}