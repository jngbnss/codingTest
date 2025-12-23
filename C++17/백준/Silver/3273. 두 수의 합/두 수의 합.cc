#include<bits/stdc++.h>
using namespace std;
long long n,temp,m,cnt;
vector<long long>v;

int main(){
	cin>>n;
	for(long long i=0;i<n;i++){
		cin>>temp;
		v.push_back(temp);
	}sort(v.begin(),v.end());
	
	cin>>m;
	long long a= 0;
	long long b = n-1;
	
	while(a<b){
		if(v[a]+v[b]==m){
			cnt++;
			a++;
		}else if(v[a]+v[b]>m){
			b--;
		}else a++;
	}
	cout<<cnt;
}