#include<bits/stdc++.h>
using namespace std;
long long n,m,a,b,c,d,e,cnt,ret,temp;
vector<long long>v;
int main(){
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>temp;
		v.push_back(temp);
	}
	temp=0;
	for(auto i:v){
		if(i==0){
			temp -=1;
		}else{
			temp +=1;
		}
//		cout<<temp<<' ';
		ret += temp;
	}
	cout<<ret;
		
		
}
