#include<bits/stdc++.h>
using namespace std;
long long a,b,c,d;

int main(){
	for(long long i=2;i<=100;i++){
		for(long long j=2;j<i;j++){
			for(long long k=j+1;k<i;k++){
				for(long long t=k+1;t<i;t++){
					if(i*i*i==(j*j*j)+(k*k*k)+(t*t*t)){
						cout<<"Cube = "<<i<<", Triple = ("<<j<<','<<k<<','<<t<<')'<<'\n';
					}
				}
			}
		}
	}
}