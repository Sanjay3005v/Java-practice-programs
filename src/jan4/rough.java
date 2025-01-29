package jan4;
class Solution {
    public int countServers(int[][] a) {
        int count =0;
        for(int i =0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i][j]==1){
                    count++;
                }
                if(a[j][i]==1){
                    count++;
                }
            }
            if(count==2){
               for(int j=0;j<a[i].length;j++){
                if(a[i][j]==1){
                    a[i][j]=0;
                }
               } 
            }
            System.out.println(count);
            count=0;
        }
        int x=0;
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[i].length;j++){
                    if(a[i][j]==1) {
                        x++;
                    }
                }
            }
            
         return x;
    }
}