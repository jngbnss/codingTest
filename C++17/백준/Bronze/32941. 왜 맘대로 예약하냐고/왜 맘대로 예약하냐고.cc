#include<bits/stdc++.h>
using namespace std;
int t,x;
int n,k,temp;
bool ret;

int main(){
	cin>>t>>x;
	cin>>n;
	for(int i=0;i<n;i++){
		ret = 0;
		cin>>k;
		for(int j=0;j<k;j++){
			cin>>temp;
			if(temp==x){
				ret = 1;
//				break;
			}
		}
//		cout<<i<<' '<<ret<<'\n';
		if(ret == 0){
//			cout<<i<<' ';
			cout<<"NO";
			return 0;
		}
	}
	cout<<"YES";
}