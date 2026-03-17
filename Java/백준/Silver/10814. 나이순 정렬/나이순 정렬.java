import java.io.*;
import java.util.*;
public class Main {
    static int n;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        list = new ArrayList<>();
        for(int i=0;i<n;i++){
            // 나이와 이름이 주어지고
            // 나이 오름차순 같으면 가입한 순
            StringTokenizer st = new StringTokenizer(br.readLine());
            // 자료구조 2개?
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            list.add(new Person(age,name,i));

        }
        Collections.sort(list);
        for(int i=0;i<n;i++){
            System.out.println(list.get(i).age+" "+list.get(i).name);
        }


    }
    static ArrayList<Person>list;
    static class Person implements Comparable<Person>{
        int age;
        String name;
        int cnt;

        public Person(int age, String name, int cnt) {
            this.age = age;
            this.name = name;
            this.cnt = cnt;
        }

        @Override
        public int compareTo(Person o) {
            if(this.age==o.age){
                return this.cnt-o.cnt;
            }
            return this.age-o.age;
        }
    }
}
