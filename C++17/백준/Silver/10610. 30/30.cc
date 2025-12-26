#include<bits/stdc++.h>
using namespace std;
vector<int>v;
int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	
	int n;
	string s;
	cin>>s;
	sort(s.begin(),s.end());
	bool check1 = false;
	bool check2 = false;
	if(s[0]=='0')check1 = true;
	else if(s[0]!='0') {
//		cout<<"no 0"<<'\n';
		check1 = false;
	}
	
	int sum = 0;
	for(auto i:s){
		sum+=(i-'0');
	}
	if(sum%3==0) check2 =true;
	else check2 = false;
	reverse(s.begin(),s.end());
	if(check1&&check2) cout<<s;
	else cout<<-1;
}
//		
////	cout<<s;
//	do{
//		n = atoi(s.c_str());
//		if(n%30==0) v.push_back(n);
//	}while(next_permutation(s.begin(),s.end()));
//	reverse(v.begin(),v.end());
//	for(auto i:v){
//		if(i%30==0){
//			cout<<i<<'\n';
//			return 0;
//		}
//	}
//	cout<<-1;
//		
//}