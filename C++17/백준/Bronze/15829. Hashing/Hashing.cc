#include<bits/stdc++.h>
using namespace std;
long long ret,n,temp;
string s;
char c;
int arr[26];

int main(){
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>c;
		temp = pow(31,i)*(c-96);
//		cout<<temp<<' ';
		ret+=temp;
	}
	cout<<ret;
}