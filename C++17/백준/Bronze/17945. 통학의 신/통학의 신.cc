#include<bits/stdc++.h>
using namespace std;
int a,b;

int main(){
	cin>>a>>b;
	for(int i=-1000;i<1001;i++){
			if(i*i+2*a*i+b==0){
				cout<<i<<' ';
			
		}
	}
}