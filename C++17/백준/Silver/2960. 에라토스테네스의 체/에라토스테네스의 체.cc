#include<bits/stdc++.h>
using namespace std;
int n,k;
int arr[1004];

int main(){
	cin>>n>>k;
	int cnt=0;
	for(int i=2;i<=n;i++){
			for(int j=i;j<=n;j+=i){
				if(arr[j]==0){
					arr[j] = 1;
					cnt++;
//					cout<<j<<' '<<cnt<<'\n';
					if(cnt==k){
						cout<<j;
						return 0;
					}
				}
			}
		}
	
}