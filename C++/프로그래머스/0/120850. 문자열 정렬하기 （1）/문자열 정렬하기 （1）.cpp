#include<algorithm>

#include <string>
#include <vector>

using namespace std;

vector<int> solution(string my_string) {
    vector<int> answer;
    for(auto i:my_string){
        if(i-'0'<10){
            answer.push_back(i-'0');
        }
    }
    
    sort(answer.begin(),answer.end());
    return answer;
}