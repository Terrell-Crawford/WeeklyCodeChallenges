package YourNameIsMine;

public class YourNameIsMine {
    public static void main(String[] args) {
        yourNameIsMine(4, "john johanna","ira ira","kayla Jayla", "Shangrila Shangrila","dude dudenstien");

    }

    //This is the code to solve the challenge
    static void yourNameIsMine(int amountOfCases, String ... testCases){
        for(String s : testCases){
            int i=0;
            String name1 ="";
            String name2 ="";
            while(s.charAt(i) != ' '){
                name1 += s.charAt(i);
                i++;
            }
            i++;
            while(i<s.length()){
                name2 += s.charAt(i);
                i++;
            }
            int charsThatMatch = 0;
            if(name1.length()<name2.length()){
                char lastmach=' ';
                for(int j=0; j<name2.length(); j++){
                    for(int k=0; k<name1.length(); k++){
                        if((name1.charAt(k)==name2.charAt(j))&&(name1.charAt(k)!= lastmach)){
                            charsThatMatch++;
                            lastmach=name1.charAt(k);
                        }
                    }
                }
                if(charsThatMatch==name1.length()){
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
            }else if(name1.length()>name2.length()){
                char lastmach=' ';
                //charsThatMatch=0;
                for(int j=0; j<name1.length(); j++){
                    for(int k=0; k<name2.length(); k++){
                        if((name1.charAt(j)==name2.charAt(k))&&(name1.charAt(j)!= lastmach)){
                            charsThatMatch++;
                            lastmach=name1.charAt(j);
                        }
                    }
                }
                if(charsThatMatch==name2.length()){
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
            }else if(name1.length()==name2.length()){
                //charsThatMatch=0;
                for(int j=0; j< name1.length(); j++){
                    if(name1.charAt(j)==name2.charAt(j)){
                        charsThatMatch++;
                    }
                }
                if(charsThatMatch==name1.length()){
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
            }

        }
    }
}
