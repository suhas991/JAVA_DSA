package StringsProb;

public class DirectionProb {
    public static void main(String[] args) {

        String str = "NNSWES";

        int x=0,y=0;

        for(int i=0;i<str.length();i++){

            //north
            if(str.charAt(i) == 'N'){
                y++;
            }
            //south
            if(str.charAt(i) == 'S'){
                y--;
            }
            //east
            if(str.charAt(i) == 'E'){
                x++;
            }
            //west
            if(str.charAt(i) == 'W'){
                x--;
            }

        }

        System.out.println(Math.sqrt((x*x) + (y*y)));
        System.out.println(str.substring(0,4));

        //string capitalization

        String str1="hello myself suhas n h ";
        StringBuilder sb = new StringBuilder();

        char ch = Character.toUpperCase(str1.charAt(0));
        sb.append(ch);

        for(int i=1;i<str1.length();i++){
            if(str1.charAt(i) == ' ' && i<str1.length() -1){
                sb.append(str1.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str1.charAt(i)));
            }else{
                sb.append(str1.charAt(i));
            }
        }

        System.out.println(sb);
    }
}
