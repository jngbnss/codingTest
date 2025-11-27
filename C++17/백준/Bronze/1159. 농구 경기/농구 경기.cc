#include<bits/stdc++.h>
using namespace std;
int n,temp;
string s,ret;
vector<int>v;
int arr[26];

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>s;
		arr[ s[0]-'a']++;
	}
	for(int i=0;i<26;i++){
		if(arr[i]>4){
			ret+= i+'a';
		}
	}
	if(ret.size()) cout<<ret;
	else cout<<"PREDAJA";
	
		
}