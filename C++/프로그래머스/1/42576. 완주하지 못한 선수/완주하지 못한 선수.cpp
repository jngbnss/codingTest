#include <string>
#include <vector>
#include<map>

using namespace std;
map<string,int>mp1,mp2;

string solution(vector<string> participant, vector<string> completion) {
    
     string answer = "";
    
    
    for(auto i:participant){
        mp1[i]++;
    }
    
      for(auto i:completion){
        mp1[i]++;
    }
    
    //홀수면 아웃이다 이거에오
    
    for(auto i:mp1){
        if(i.second%2!=0){
            answer = i.first;
            break;
        }
    }
    
    
    
    
   
    return answer;
}