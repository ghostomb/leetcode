package problems.middle;

import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Nqueens_51 {

    public static void main(String[] args) {
        Nqueens_51 nqueens_51 = new Nqueens_51();
        List<List<String>> result = nqueens_51.solveNQueens(4);
    }
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] path = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(path[i], '.');
        }
        DFS(0, path);
        return res;
    }

    void DFS(int row, char[][] path) {
        if(path.length == row) {
            res.add(charArrayToList(path));
            return;
        }

        //重要的剪枝
        int n = path[row].length;

        for (int i = 0; i < n; i++) {
            //对列进行操作
            if (!isValid(path, row, i)){
                continue;
            }
            path[row][i] = 'Q';
            DFS(row + 1, path);
            path[row][i] = '.';
        }
    }

    List<String> charArrayToList(char[][] chars) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            list.add(new String(chars[i]));
        }
        return list;
    }

    boolean isValid(char[][] path, int row, int col) {
        for (int i = 0; i < path.length; i++) {
            if(path[i][col] == 'Q'){
                return false;
            }
        }
        //右上
        for (int i = row - 1, j = col + 1; i >= 0 && j < path[i].length ; i--, j++) {
            if (path[i][j] == 'Q') {
                return false;
            }
        }

        //左上
        for (int i = row - 1, j = col - 1; i >= 0 && j >=0 ; i--, j--) {
            if (path[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
}
