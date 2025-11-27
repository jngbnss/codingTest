#include<bits/stdc++.h>
using namespace std;
int n,m;
string s,ret,temp;
vector<int>v;
int arr[26];
map<string,int>nametonum;
map<int,string>numtoname;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>n>>m;
	for(int i=0;i<n;i++){
		cin>>s;
		nametonum[s]=i+1;
		numtoname[i+1] = s;
	}
	for(int i=0;i<m;i++){
		cin>>s;
//		cout<<atoi(s.c_str())<<'\n';
		int check =  atoi(s.c_str());
		if(check==0){
			cout<<nametonum[s]<<'\n';
		}else cout<<numtoname[check]<<'\n';
	}
		
		//int or string check
		
		// if string - > nametonum[] cout<<
		// else numtoname[] cout<< 
	
}

