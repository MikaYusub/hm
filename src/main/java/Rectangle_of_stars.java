public class Rectangle_of_stars {
    public static void main(String[] args) {
        int height = 31;
        int width = 25;
        double diag = ((double)width/height);
        System.out.println(diag);

        for (int i = 0; i < height/2; i++) {
            for (int j = 0; j < width; j++) {
                if (    i==0
                        ||j==0
                        ||j==width-1
                        ||j==(int)(i*diag)
                        ||(width-j-1)==(int)(i*diag)
                        ) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}
