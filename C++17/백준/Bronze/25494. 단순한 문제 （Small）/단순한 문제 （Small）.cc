#include<bits/stdc++.h>
using namespace std;
int n,a,b,c,cnt;

int main(){
	cin>>n;
	while(n--){
		cnt =0;
		cin>>a>>b>>c;
		for(int i=1;i<=a;i++){
			for(int j=1;j<=b;j++){
				for(int k=1;k<=c;k++){
					if(i%j==j%k){
						if(j%k==k%i){
//							cout<<i<<' '<<j<<' '<<k<<'\n';
							cnt++;
						}
					}
				}
			}
		}
		cout<<cnt<<'\n';
	}
}