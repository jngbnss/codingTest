#include<bits/stdc++.h>
using namespace std;
long long n,k,cnt,a,b;
string s;
vector<pair<int,int>>v;
int arr[26];
string ret ="";
int main(){
	cin>>s;
	for(auto i:s){
		arr[i-'A']++;
	}
	for(int i=0;i<26;i++){
		if(arr[i]%2!=0){
			cnt++;
			ret+=(i+'A');
//			for(int j=0;j<arr[i];j++){
//				ret+=(i+'A');
//			}
			arr[i]--;
		}
		if(cnt>1){
			cout<<"I'm Sorry Hansoo";
			return 0;
		}
	}
	for(int i=25;i>=0;i--){
		if(arr[i]>0){
			for(int j=0;j<arr[i];j+=2){
				char temp = i+'A';
				ret = temp+ret+temp;
			}
		}
	}
				
				
	cout<<ret;
	
	return 0;	
}