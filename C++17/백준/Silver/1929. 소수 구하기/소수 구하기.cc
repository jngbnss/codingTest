#include<bits/stdc++.h>
using namespace std;
int n,m;

int main(){
	cin>>n>>m;
	int arr[m+1];
	memset(arr,0,sizeof(arr));
	arr[0]=arr[1] = 1;
	
	for(int i=2;i*i<=m;i++){
		if(arr[i]==0){
			for(int j=i*i;j<=m;j+=i){
				arr[j] = 1;
			}
		}
	}
	
	for(int i=n;i<=m;i++){
		if(arr[i]==0) cout<<i<<'\n';
	}
}
				
		