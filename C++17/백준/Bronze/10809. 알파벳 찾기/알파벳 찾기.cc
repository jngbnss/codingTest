#include<bits/stdc++.h>
using namespace std;
string s;
int arr[26];
int main(){
	fill(arr,arr+26,-1);
	
	cin>>s;
	for(int i=0;i<s.size();i++){
		if(arr[ (s[i]-'a') ]==-1){
			arr[(s[i]-'a')] = i;
		}
	}
	
	for(auto i:arr){
		cout<<i<<' ';
	}
}