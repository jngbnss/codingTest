#include<bits/stdc++.h>
using namespace std;

int n;
string s;
vector<string>v;

bool cmp(string a, string b){
	if(a.size()==b.size()){
		return a<b;
	}
	return a.size()<b.size();
}

string check(string temp){
	int i =0;
	while(i<temp.size()&&temp[i] =='0') i++;
	if(i==temp.size()) return "0";
	return temp.substr(i);
}
int main(){
	cin>>n;
	while(n--){
		cin>>s;
		//bool check = false;
		string temp ="";
		for(int i=0;i<s.size();i++){
			if(isdigit(s[i])){	
				temp+=s[i];
				//check = true;
			}
			else{
				if(temp!=""){
					string ret = check(temp);
					v.push_back(ret);
				}
				temp="";
			}	
		}
		if(temp!=""){
			string ret = check(temp);
			v.push_back(ret);
		}
	}
	sort(v.begin(),v.end(),cmp);
	for(auto i:v) cout<<i<<'\n';
}
			