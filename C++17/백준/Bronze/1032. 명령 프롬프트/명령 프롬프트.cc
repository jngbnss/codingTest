#include<bits/stdc++.h>
using namespace std;
long long n,a,b;
string s,ret,temp;
int main(){
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>s;
		if(ret==""){
			ret = s;
			temp =s;
		}
		else{
			for(int i=0;i<s.size();i++){
				if(s[i]==ret[i]){
					temp[i] = s[i];
				}else temp[i] = '?';
			} ret = temp;
		}
	}
	cout<<ret;
}