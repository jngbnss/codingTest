#include<bits/stdc++.h>
using namespace std;
long long n,m,a,c,d,e,cnt,ret,temp;
char b;
vector<long long>v;
int main(){
	cin>>n>>m;
	temp = min(n,m);
	for(int i=1;i<=temp;i++){
		if(n%i==0&&m%i==0){
			cout<<i<<' '<<n/i<<' '<<m/i<<'\n';
		}
	}
}
