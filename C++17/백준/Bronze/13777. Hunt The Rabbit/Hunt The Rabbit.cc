#include<bits/stdc++.h>
using namespace std;
int a,b,n,mid;

int main(){
	
	while(true){
		cin>>n;
		if(n==0) return 0;
		
		a = 1; b = 50;
		while(a<=b){
			mid = (a+b)/2;
		
			
			if(mid == n){
				cout<<mid<<'\n';
				break;
			}
			else if(mid<=n){
				cout<<mid<<' ';
				a = mid+1;
			}
			else if(mid>n){
				cout<<mid<<' ';
				b = mid-1;
			}
		}
	}
}