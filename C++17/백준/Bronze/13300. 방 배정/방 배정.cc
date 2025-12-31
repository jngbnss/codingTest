#include<bits/stdc++.h>
using namespace std;
int n,k;
map<int,int>mp;
int arr[10][10];
int ret ;
int main(){
	cin>>n>>k;
	int a,b;
	
	for(int i=0;i<n;i++){
		cin>>a>>b; // gender, grade
		arr[b][a]++;
	}
	for(int i=1;i<=6;i++){
		for(int j=0;j<=1;j++){
			if(arr[i][j]==0) continue;
			ret+=arr[i][j]/k;
			if(arr[i][j]%k)ret++;
		}
	}cout<<ret;
}