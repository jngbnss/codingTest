#include<bits/stdc++.h>
using namespace std;
long long n,k,ret,cnt,a,b,temp,sum,w;
vector<int>v,v1;
int arr[]={500,100,50,10,5,1};

int main(){
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>w;
		v.push_back(w);
		sum+=w;
		
	}
	sort(v.begin(),v.end());
	for(int i=0;i<n;i++){
		sum = v[i]*(n-i);
		ret = max(ret,sum);
	}
	cout<<ret;
	
}
	