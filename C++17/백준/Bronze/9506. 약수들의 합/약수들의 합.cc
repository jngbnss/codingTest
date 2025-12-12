#include<bits/stdc++.h>
using namespace std;
int n,a,b,k;
map<char,int>mp;


int main(){
	while(true){
		vector<int>v;
		cin>>n;
		if(n==-1) return 0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				v.push_back(i);
			}
		}
		int temp =-n;
		for(auto i:v){
			temp+=i;
		}
		if(n!=temp) cout<<n<<" is NOT perfect."<<'\n';
		else{
			cout<<n<<" = ";
			for(int i=0;i<v.size()-2;i++){
				cout<<v[i]<<" + ";
			}cout<<v[v.size()-2]<<'\n';
		}
			
			
	}
}