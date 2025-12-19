#include<bits/stdc++.h>
using namespace std;
int n;
string s,s1;
int arr[26],arr1[26];

int main(){
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>s>>s1;
		memset(arr,0,sizeof(arr));
		memset(arr1,0,sizeof(arr1));
		for(auto i:s){
			arr[i-'a']++;
		}
		for(auto i:s1){
			arr1[i-'a']++;
		}
		bool check = false;
		
		
		for(int i=0;i<26;i++){
			if(arr[i]==arr1[i]){
				check = true;
			}else{
				check = false;
				break;
			}
		}
		if(check) cout<<s<<" & "<<s1<<" are anagrams.\n";
		else cout<<s<<" & "<<s1<<" are NOT anagrams.\n";
	}
}
			