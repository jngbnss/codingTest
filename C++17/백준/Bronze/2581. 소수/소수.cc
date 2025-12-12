#include<bits/stdc++.h>
using namespace std;
long long n,a,b,k,sum;
vector<long long>v;

int main(){
	cin>>a>>b;
	for(int i=a;i<=b;i++){
		if(i==1) continue; //
		bool check = true;
		for(int j=2;j<i;j++){
			if(i%j==0){
				check = false;
				break;
			}
		}
		if(check){
			v.push_back(i);
			sum+=i;
		}
	}
	if(v.empty())cout<<-1;
	else{
		cout<<sum<<'\n'<<v[0];
	}
}