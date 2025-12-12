#include<bits/stdc++.h>
using namespace std;
long long n,a,b,k,sum,mna=1e9,mnb=1e9,mxa=-1e9,mxb=-1e9;

int main(){
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>a>>b;
		mna = min(mna,a);
		mnb = min(mnb,b);
		mxa = max(mxa,a);
		mxb = max(mxb,b);
	}
//	cout<<mna<<mnb<<mxa<<mxb<<'\n';
	cout<<(mxa-mna)*(mxb-mnb);
		
}