#include<bits/stdc++.h>
using namespace std;
int n,m,d;
string s;
vector<int>v;

int main(){
	cin>>m>>d;
	if(m==2){
		if(d==18){
			cout<<"Special";
			return 0;
		}else if(d<18){
			cout<<"Before";
			return 0;
		}else {
			cout<<"After";
			return 0;
		}
	}else if(m<2){
		cout<<"Before";
		return 0;
	}else {
		cout<<"After";
		return 0;
	}
		
}