package problems;

public class ProjectionArea {
    public static void main(String[] args) {
        System.out.println(projectionArea(new int[][]{{1,2},{3,4}}));
    }


    public static int projectionArea(int[][] grid) {
        int up=0,left=0,right=0;
        for (int i = 0; i < grid.length; i++) {
            int leftTemp=0;
            int rightTemp=0;
            for (int j = 0; j < grid.length; j++) {
                if(grid[i][j]>0){
                    up++;
                }
                if(grid[i][j]>leftTemp){
                    leftTemp=grid[i][j];
                }
                if(grid[j][i]>rightTemp){
                    rightTemp=grid[j][i];
                }
            }
            right+=rightTemp;
            left+=leftTemp;
        }
        return up+left+right;

    }
}
