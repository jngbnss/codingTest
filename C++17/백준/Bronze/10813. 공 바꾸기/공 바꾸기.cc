#include<bits/stdc++.h>
using namespace std;
int a,b,c,n,m;

int main(){
	cin>>n>>m;
	int arr[n+1];
	for(int i=0;i<=n;i++){
		arr[i] = i;
	}
	
	for(int i=0;i<m;i++){
		cin>>a>>b;
		swap(arr[a],arr[b]);
	}
	
	for(int i=1;i<n+1;i++){
		cout<<arr[i]<<' ';
	}
	
		
}