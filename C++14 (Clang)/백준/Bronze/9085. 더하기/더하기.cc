#include<bits/stdc++.h>
using namespace std;
int sum1,sum2,a,b,c,d,n,t;
int main(){
	cin>>t;
	while(t--){
		cin>>n;
		sum1 = 0;
		for(int i=0;i<n;i++){
			cin>>a;
			sum1+=a;
		}cout<<sum1<<'\n';
	}
}