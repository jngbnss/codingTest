#include<bits/stdc++.h>
using namespace std;
int n;

bool go1(int i){
	if(to_string(i).size()==2){
		return true;
	}
	return false;
	
}

bool go2(int i){
	string s= to_string(i);
	string s1= s;
	reverse(s1.begin(),s1.end());
	if(s1==s) return true;
	else return false;
	
}

bool go3(int i){
	int n = i;
	while(n>0){
		int temp = n%10;
		if(temp%6!=0){
			return false;
		}
		  n/=10;
	}
	return true;
	
}

bool go4(int i){
	string s = to_string(i);
	if(s.find("8")!=string::npos){
		return false;
	}
	return true;
	
}
int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cout<<42;
}
		