#include<bits/stdc++.h>
using namespace std;
int n,m,d;
string s;
vector<int>v;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>s;
		for(auto i:s){
			if(i<97){
				cout<<(char)(i+(97-65));
			}else cout<<(char)i;
		}cout<<'\n';
	}
	
		
}