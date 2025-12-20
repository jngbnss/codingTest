#include<bits/stdc++.h>
using namespace std;
int ret,idx,sum,temp;

int main(){
	for(int i=1;i<=5;i++){
		sum =0;
		for(int j=0;j<4;j++){
			cin>>temp;
			sum+=temp;
		}
		ret = max(ret,sum);
		if(ret==sum){
			idx = i;
		}
	}
	cout<<idx<<' '<<ret;
}

			