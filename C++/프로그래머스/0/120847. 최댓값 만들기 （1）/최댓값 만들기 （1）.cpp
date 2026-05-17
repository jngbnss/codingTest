#include <string>
#include <vector>
#include <algorithm>


using namespace std;

int solution(vector<int> numbers) {
    int answer = 0;
    for(int i=0;i<numbers.size();i++){
        for(int j=0;j<i;j++){
            answer = max(answer,numbers[i]*numbers[j]);
        }
    }
    
    return answer;
}