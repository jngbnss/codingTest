#include<bits/stdc++.h>
using namespace std;
long long n,k,ret,cnt,a,b,temp;
vector<int>v,v1;
int arr[]={500,100,50,10,5,1};

int main(){
	cin>>temp;
	temp = 1000-temp;
	for(auto i:arr){
		cnt += temp/i;
		temp%=i;
	}
	cout<<cnt;
}
	