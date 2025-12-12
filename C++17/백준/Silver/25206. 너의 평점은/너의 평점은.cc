#include<bits/stdc++.h>
using namespace std;
double n,cnt;
double m,ret;
vector<double>v,v1;
map<string,double>mp;

int main(){
	mp["A+"] = 4.5;
	mp["A0"] = 4.0;
	mp["B+"] = 3.5;
	mp["B0"] = 3.0;
	mp["C+"] = 2.5;
	mp["C0"] = 2.0;
	mp["D+"] = 1.5;
	mp["D0"] = 1.0;
	mp["F"] = 0;
	for(int i =0;i<20;i++){
		string s,grade;
		cin>>s;
		cin>>m;
		cin>>grade;
		if(grade=="P"){
			continue;
		}else{
			ret += m*mp[grade];
			cnt+=m;
		}
		
	}
	cout<<ret/cnt;
}