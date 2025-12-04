#include<bits/stdc++.h>
using namespace std;
int n;
string s,ret;

int main(){
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>s;
		for(auto i:s){
			if(i=='S'){
				ret = s;
			}
		}
		
	}
	cout<<ret;
}