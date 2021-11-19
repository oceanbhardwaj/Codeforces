class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int col=encodedText.length()/rows;
        char arr[][]=new char[rows][col];
        int c1=0;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=encodedText.charAt(c1++);
            }
        }
        
        StringBuilder sb=new StringBuilder();
        int r=0;
        int countOfRow=0;
        int c=0;
        int countOfCol=0;
        while(countOfCol<col)
        { int rr=0;
         while(rr<rows && c<col){
             System.out.println(arr[rr][c]);
            sb.append(arr[rr][c]);
            rr++;
            c=c+1;
         }
         countOfRow++;
         countOfCol++;
         c=countOfCol;
         r++;
        }
       
       String ans= sb.toString();
        ans= ans.replaceAll("\\s+$", "");
        return ans;
        
        
    }
}