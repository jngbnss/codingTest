#include<bits/stdc++.h>
using namespace std;
int a,b,c,d;
int main(){
	cin>>a>>b>>c>>d;
	for(int i=0;i<5001;i++){
		for(int j=0;j<6000;j++){
			if((b-a)+(b*i)==(d-c)+(d*j)){
				cout<<(b-a)+(b*i);
				return 0;
			}
		}
	}
}