public class Delete {
    public static void main (String arg[])
    {
        StringBuffer str=new StringBuffer("javapoint");
        System.out.println("String1:"+str);
        str=str.delete(2,6);
        System.out.println("After delete:"+str);
    }
}
