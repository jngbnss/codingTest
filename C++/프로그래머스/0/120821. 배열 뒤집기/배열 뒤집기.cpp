#include <string>
#include <vector>
#include<algorithm>
using namespace std;

vector<int> solution(vector<int> num_list) {
    vector<int> answer;
    for(auto i:num_list){
        answer.push_back(i);
    }
    reverse(answer.begin(),answer.end());
    return answer;
}