#include<iostream>
#include<string>

using namespace std;

int main(){
	int testcase;
	cin>>testcase;
	
	int total = (1<<10)-1;
	
	for(int i=1;i<=testcase;i++){
		int n;
		cin>>n;
		int visited = 0;
		int count = 0;
		
		while(true){
			string s = to_string(n*(++count)); // n*count 값을 문자열로 표현한 것 
			for(char c:s){
				int num = c-'0';
				visited |= (1<<num); // 각 숫자에 대해 등장했다는 의미로 bit를 1로 변경
			}
			if(visited==total) // 모든 숫자가 등장 했다면, 종료
				break;
		}
		
		cout<<"#"<<i<<' '<<n*count<<'\n';
	}
	return 0;
}