public class Comparacao {
    public static void main(String[] args) {
        int x, y, z;
        x = 8;
        y = 10;
        z = 12;
        if (x>y && x>z && y>z){
            System.out.println(z + "," + y + "," + x);
        }else if (x>y && x>z && y<z){
            System.out.println(y + "," + z + "," + x);
        }else if (y>x && y>z && x>z){
            System.out.println(z + "," + x + "," + y);
        }else if (y>x && y>z && x<z){
            System.out.println(x + "," + z + "," + y);
        }else if (z>y && z>x && x>y){
            System.out.println(y + "," + x + "," + z);
        }else{
            System.out.println(x + "," + y + "," + z);
        }
    }
}

