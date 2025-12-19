//1 2 1 2
//
//1 2 1 2 3
//
//1 2 3 4 5 6 7
//1 2 1 2 1 2 3

#include<bits/stdc++.h>
using namespace std;
int n;
int main(){
	cin>>n;
	if(n%2==0){
		for(int i=0;i<n;i++){
			if(i%2!=0){
				cout<<2<<' ';
			}else cout<<1<<' ';
		}
	}else{
		for(int i=0;i<n-1;i++){
			if(i%2!=0){
				cout<<2<<' ';
			}else cout<<1<<' ';
		}
		cout<<3;
	}
		
}