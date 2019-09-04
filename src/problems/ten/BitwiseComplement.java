package problems.ten;

public class BitwiseComplement {
    public int bitwiseComplement(int N) {
        int m=N,total=2;
        while (m/2>0){
            total*=2;
            m=m/2;
        }
        return total-N-1;
    }
}
