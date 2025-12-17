#include<bits/stdc++.h>
using namespace std;
int n,a,b,cnt;

int main(){
	cin>>n;
	for(int i=1;i<=500;i++){
		for(int j=i+1;j<=500;j++){
			if(i*i+n==j*j){
//				cout<<i<<' '<<j<<'\n';
				cnt++;
			}
		}
	}
	cout<<cnt;
}
		