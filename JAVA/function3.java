import java.util.*;
public class function3 {
    public static void myIdentity(String name,int scId,float height){
        System.out.println("my name is:"+name);
        System.out.println("my scholar ID:"+scId);
        System.out.println("my height:"+height);
        return;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int scId=sc.nextInt();
        float height=sc.nextFloat();
        myIdentity(name,scId,height);

    }
}
