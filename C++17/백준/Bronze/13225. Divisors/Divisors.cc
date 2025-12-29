#include<bits/stdc++.h>
using namespace std;
int t,n,ret;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>t;
	while(t--){
		ret = 0;
		cin>>n;
		for(int i=1;i<=n;i++){
			if(n%i==0) ret++;
		}cout<<n<<' '<<ret<<'\n';
	}
}