#include<bits/stdc++.h>
using namespace std;
int n;
string s;

int main(){
	cin>>n;
	cin.ignore();
	for(int i=1;i<=n;i++){
		
		getline(cin,s);
		
		cout<<i<<". "<<s<<'\n';
	}
}