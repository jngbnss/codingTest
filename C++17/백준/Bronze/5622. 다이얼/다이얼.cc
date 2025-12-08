#include<bits/stdc++.h>
using namespace std;
int n,target,a,b,cnt,temp,prev,ret;
vector<int>v;
string s;

int main(){
	cin>>s;
	for(auto i:s){
		ret+=1;
		if(i<'D'){
			ret+=2;
		}else if(i<'G'){
			ret+=3;
		}
		else if(i<'J'){
			ret+=4;
		}
		else if(i<'M'){
			ret+=5;
		}
		else if(i<'P'){
			ret+=6;
		}
		else if(i<'T'){
			ret+=7;
		}
		else if(i<'W'){
			ret+=8;
		}
		else if(i<='Z'){
			ret+=9;
		}
	}
	cout<<ret;
}