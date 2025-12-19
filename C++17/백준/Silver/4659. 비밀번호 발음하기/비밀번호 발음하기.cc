#include<bits/stdc++.h>
using namespace std;
bool check = true;

bool check1(string s){
	for(auto i:s){
		if(i=='a'||
		i=='e'||
		i=='i'||
		i=='o'||
		i=='u') return true;
	}
	return false;
}
bool mocheck(char i){
		if(i=='a'||
		i=='e'||
		i=='i'||
		i=='o'||
		i=='u') return true;
	return false;
}

bool check2(string s){
	int mo =0;
	int ja =0;
	for(int i=0;i<s.size();i++){
		if(mocheck(s[i])){
			ja=0;
			mo++;
		}else{
			mo=0;
			ja++;
		}
		if(mo==3||ja==3){
			return false;
		}
	}
	return true;
}

bool check3(string s){
	char prev =s[0];
	for(int i=1;i<s.size();i++){
		if(s[i]==prev){
			if(s[i]=='e'||s[i]=='o') continue;
			else{
				return false;
			}
		}
		prev = s[i];
	}
	return true;
}
		
			
	

int main(){
	while(true){
		string s;
		cin>>s;
		if(s=="end") return 0;
		
		check = true;
		
		if(check1(s) && check2(s)&&check3(s)){
			cout<<"<"<<s<<"> is acceptable."<<'\n';
		}
		else{
			cout<<"<"<<s<<"> is not acceptable."<<'\n';
		}
	}
}
	