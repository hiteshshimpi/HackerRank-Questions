package DSA_2Pointers_Problems;

public class Spaces {
    public static void main(String[] args) {
        String s = "LeetcodeHelpsMeLearn";
        int[] space = {8,13,15};
        newSpaces();
        //spaces();

    }
        public static void spaces()
        {
            String s = "enjoyyourcoffee";
            int[] space = {5, 9};
            int i = 0;
            int start = space[i];

            StringBuilder builder = new StringBuilder();

            System.out.println("Length of s : " + s.length() + " and length of builder := " + builder.length());

            for (int j = 0; j < s.length(); j++) {
                if (j == start + 1 + i) {
                    char old = s.charAt(j);
                    builder.insert(j - 1, ' ');
                    builder.append(old);
                    i++;
                    if (i < space.length) {

                        start = space[i];
                    } else {
                        start = 0;
                    }

                } else {
                    builder.append(s.charAt(j));
                }
            }
            System.out.println(builder);

        }

        public static  void newSpaces(){
            String s = "spacing";
            int[] spaces = {0,1,2,3,4,5,6};
            StringBuilder stringBuilder = new StringBuilder(s);
            for(int i=0;i<spaces.length;i++)
            if(i!=0)
            {
                int newPlace = spaces[i];
                newPlace = newPlace+i;
                stringBuilder.insert(newPlace,' ');
            }
            else {

                stringBuilder.insert(spaces[i],' ');
            }

            System.out.println(stringBuilder);

        }

    public static class BreakingRecords {
        public static void main(String[] args) {
            int [] score ={10,5,20,20,4,5,2,25,1};
            int max = score[0];
            int min = score[0];

            int countmax=0;
            int countMin=0;
            for(int i=1;i<score.length;i++)
            {
                if(score[i]>max)
                {
                    countmax+=1;
                    max=score[i];
                }
                else if(score[i]<min)
                {
                    countMin+=1;
                    min=score[i];
                }
    //            else if(score[i]==min && score[i]==max)
    //            {
    //                countmax+=1;
    //                countMin+=1;
    //            }
            }
            System.out.println(countmax+" "+countMin);
        }
    }
}

