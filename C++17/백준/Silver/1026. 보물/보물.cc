#include<bits/stdc++.h>
using namespace std;
long long n,k,ret,cnt,a,b,temp;
vector<int>v,v1;

int main(){
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>temp;
		v.push_back(temp);
	}
	for(int i=0;i<n;i++){
		cin>>temp;
		v1.push_back(temp);
	}
	sort(v.begin(),v.end());
	sort(v1.rbegin(),v1.rend());
	for(int i=0;i<n;i++){
		ret+= v[i]*v1[i];
	}
	cout<<ret;
			
	
}
	