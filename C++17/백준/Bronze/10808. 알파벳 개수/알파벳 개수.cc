#include<bits/stdc++.h>
using namespace std;
string s;
int arr[26];
int main(){
	cin>>s;
	for(auto i:s){
		arr[i-'a']++;
	}
	for(auto i:arr){
		cout<<i<<' ';
	}
}
