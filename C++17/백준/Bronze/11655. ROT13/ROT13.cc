#include<bits/stdc++.h>
using namespace std;
int n,temp;
string s,ret;
vector<int>v;
int arr[26];

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	
	getline(cin,s);
	
	for(auto i:s){
		if(i<65){
			cout<<i;
		}
		else if(i<97){
			if(i>64){
				if(i<65+13){
					cout<<(char)(i+13);
				}else cout<<(char)(i-13);
			}
		}else{
			if(i<97+26){
				if(i<97+13){
					cout<<(char)(i+13);
				}else cout<<(char)(i-13);
			}
		}
	}
	//65+26
	//97
		
}