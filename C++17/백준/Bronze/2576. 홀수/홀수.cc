#include<bits/stdc++.h>
using namespace std;
int n,sum;
vector<int>v;

int main(){
	for(int i=0;i<7;i++){
		cin>>n;
		if(n%2!=0){
			sum+=n;
			v.push_back(n);
		}
	}
	if(v.size()==0){
		cout<<-1;
		return 0;
	}
	else{
		sort(v.begin(),v.end());
		cout<<sum<<'\n'<<v[0];
	}
}