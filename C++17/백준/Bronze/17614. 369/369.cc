#include<bits/stdc++.h>
using namespace std;
int n,cnt;

int main(){
	cin>>n;
	for(int i=0;i<=n;i++){
		string s = to_string(i);
		for(auto c:s){
			if(c=='3'||c=='6'||c=='9') cnt++;
		}
	}
	cout<<cnt;
}
