
public class CatalanNumbers {
	int catalan(int n)
    {
        int res = 0;

        if (n <= 1) {
            return 1;
        }
        for (int i = 0; i < n; i++) {
            res += catalan(i) * catalan(n - i - 1);
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CatalanNumbers cn = new CatalanNumbers();
        for (int i = 0; i < 10; i++) {
            System.out.print(cn.catalan(i) + " ");
	}

}
}