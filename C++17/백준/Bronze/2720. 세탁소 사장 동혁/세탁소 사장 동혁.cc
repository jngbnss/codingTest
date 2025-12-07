#include<bits/stdc++.h>
using namespace std;
long long n,k,ret,cnt,a,b,temp;
vector<int>v,v1;
int arr[]={25,10,5,1};

int main(){
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>temp;
		for(auto i:arr){
			cout<<temp/i<<' ';
			temp%=i;
		}cout<<'\n';
	}
	
}
	