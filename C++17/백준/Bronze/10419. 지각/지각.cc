#include<bits/stdc++.h>
using namespace std;
int t,d;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>t;
	while(t--){
		cin>>d;
		int ret =0;
		for(int i=0;i<=d;i++){
			if(i+i*i<=d){
				ret = i;
//				cout<<i<<" : "<<i+i*i<<" : "<<ret<<'\n';
				
			}
			else{
//				cout<<i<<" : "<<i+i*i<<" : "<<ret<<'\n';
				break;
			}
		}
		cout<<ret<<'\n';
		}
	
}