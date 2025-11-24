#include<bits/stdc++.h>
using namespace std;
string s;
int arr[26];

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	
	cin>>s;
	for(auto i:s){
		arr[i-'a']++;
	}
	for(auto i:arr){
		cout<<i<<' ';
	}
}