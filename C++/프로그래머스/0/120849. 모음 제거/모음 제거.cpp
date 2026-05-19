#include <string>
#include <vector>

using namespace std;

string solution(string my_string) {
    string answer = "";
    for(auto i:my_string){
        if(i=='a'
          ||i=='e'
          ||i=='i'
           ||i=='o'
           ||i=='u'
          
          ) continue;
        else answer+=i;
    }
    return answer;
}