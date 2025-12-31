#include<bits/stdc++.h>
using namespace std;
int n,ret,sum;
vector<int>v;
int main(){
	
	for(int i=0;i<9;i++){
		cin>>n;
		v.push_back(n);
		sum+=n;
	}
	sort(v.begin(),v.end());
	
	int a,b;
	bool check = false;
	for(int i=0;i<9;i++){
		for(int j=i+1;j<9;j++){
			if(sum-v[i]-v[j]==100){
				a =i,b=j;
				check = true;
			}
			if(check) break;
		}if(check) break;
	}
	for(int i=0;i<9;i++){
		if(i==a||i==b) continue;
		cout<<v[i]<<'\n';
	}
}
		
			
			