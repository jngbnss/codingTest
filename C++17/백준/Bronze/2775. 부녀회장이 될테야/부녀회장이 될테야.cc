#include<bits/stdc++.h>
using namespace std;
int t,k,n;
int arr[16][16];
int main(){
	cin>>t;
	for(int j=0;j<15;j++){
		arr[0][j] = j+1;
	}
	for(int i=0;i<15;i++){
		arr[i][0] = 1;
	}
	
	for(int i=1;i<15;i++){
		for(int j=1;j<15;j++){
			arr[i][j] = arr[i-1][j]+arr[i][j-1];
		}
	}
//	
//	for(int i=0;i<5;i++){
//		for(int j=0;j<5;j++){
//			cout<<arr[i][j]<<' ';
//		}cout<<'\n';
//	}
//			
	while(t--){
		cin>>k>>n;
		cout<<arr[k][n-1]<<'\n';
	}
}
		