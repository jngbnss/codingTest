#include<bits/stdc++.h>
using namespace std;
long long n1,n2,m1,m2;
string s,a,b;
vector<pair<int,int>>v;
//int arr[26];
string ret,ret1;
char arr[5] = {'K','O','R','E','A'};
char arr1[6] = {'Y','O','N','S','E','I'};
int main(){
	cin>>s;
	int target = 0;
	int target1 = 0;
	for(auto i:s){
		if(i==arr[target%5]){
			ret+=i;
			target++;
		}
		if(i==arr1[target1%6]){
			ret1+=i;
			target1++;
		}
		
		if(ret=="KOREA"){
			cout<<ret;
			return 0;
	}
	else if(ret1=="YONSEI"){ 
		cout<<ret1;
		return 0;
	
	}
	}

	
	return 0;	
}