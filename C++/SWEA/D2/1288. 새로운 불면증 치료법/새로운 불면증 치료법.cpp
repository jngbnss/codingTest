#include<iostream>
using namespace std;
int testCase,n,ret;
int arr[10];
int main(){
	ios_base::sync_with_stdio(0);
	cin.tie(0);cout.tie(0);
	cin>>testCase;
	for(int tc = 1;tc<=testCase;tc++){
		cout<<"#"<<tc<<" ";
		
		for(int i=0;i<10;i++){
			arr[i] = 0;
		}
		
		cin>>n;
		
		int idx = 1;
		int temp = n;
		bool flag = false;
		
		while(true){
			if(flag){
				ret = n*(idx-1);
				break;
			}
//			cout<<'\n';
			temp = n*idx++;
//			cout<<temp;	
			
			//logic
			while(temp>0){
				arr[temp%10]++;
				temp/=10;
			}
			
			for(int i=0;i<10;i++){
				flag = true;
				if(arr[i] == 0){
					flag = false;
					break;
				}
			}
			
		}
//		cout<<'\n';
//		cout<<"================\n";
//		for(int i=0;i<10;i++){
//			cout<<arr[i]<<' ';
//		}
		
		cout<<ret<<'\n';
	}
}