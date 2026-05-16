#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> num_list) {
    vector<int> answer;
    int temp=0;
    for(auto i:num_list){
        if(i%2==0){
            temp++;
        }
    }
    
            answer.push_back(temp);
    answer.push_back(num_list.size()-temp);
    return answer;
}