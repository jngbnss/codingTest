#include<bits/stdc++.h>
using namespace std;
int t,n,m;

int main(){
	ios_base::sync_with_stdio(0);
	cin.tie(0);cout.tie(0);
	cin>>t;
	while(t--){
		cin>>n>>m;
		int cnt =0;
		for(int i=1;i<n;i++){
			for(int j=i+1;j<n;j++){
				if( (((i*i + j*j+m)%(i*j)))==0){
//					cout<<(i*i + j*j+m) / (i*j)<<'\n';
					cnt++;
				}
			}
		}
		cout<<cnt<<'\n';
	}
}
				
				