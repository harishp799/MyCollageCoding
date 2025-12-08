public class multimatrix{
    public static void main (String args[] )
    {
    int a[][]={{1,3,5},{2,4,6},{7,8,9}};
    int b[][]={{3,1,5},{2,6,4},{9,8,4}};
    int c[][]=new int[3][3];
    for (int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            c[i][j]=0;
            for(int k=0;k<3;k++)

            {
                c[i][j]+=a[i][k]*b[k][j];
            }
            System.out.print(c[i][j]+" ");
        }
        System.out.println();
    }
    }
}