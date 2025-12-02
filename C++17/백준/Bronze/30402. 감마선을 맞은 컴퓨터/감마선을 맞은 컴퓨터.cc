#include<bits/stdc++.h>
using namespace std;
long long n,ret=1,b,c,a;
char s;

int main(){
	for(int i=0;i<15;i++){
		for(int j=0;j<15;j++){
			cin>>s;
			if(s=='w'){
				cout<<"chunbae";
				return 0;
			}else if(s=='b'){
				cout<<"nabi";
				return 0;
			}else if(s=='g'){
				cout<<"yeongcheol";
				return 0;
			}
		}
	}
}