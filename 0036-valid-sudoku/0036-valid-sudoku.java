class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                char c=board[i][j];
                if(c=='.')
                {
                    continue;
                }
                if(set.contains(c+"row"+i))
                {
                      return false;
                }
                if(set.contains(c+"col"+j))
                {
                      return false;
                }
                if(set.contains(c+"+"+(i/3)+"+"+(j/3)))
                {
                        return false;
                }
                set.add(c+"row"+i);
                set.add(c+"col"+j);
                set.add(c+"+"+(i/3)+"+"+(j/3));
            }
        }
        return true;
    }
}