import java.io.File;

public class filetext {
    public static void getPaths(File f){
        try {
            System.out.println("Name : "+ f.getName());
            System.out.println("path : "+f.getPath());
            System.out.println("Parent : " +f.getParent());
            
        } catch (Exception e) {
            // TODO: handle exception
        }


    }
    public static void getInfo(File f){
        try {
            if (f.exists()) {
                System.out.println("File exist");
                System.out.println(f.canRead() + "and is readable");
                System.out.println(f.canWrite()+ "and is writeable");
                System.out.println("File is last modified : " + f.lastModified());
                System.out.println("File is "+ f.length()+" bytes");
            } else {
                System.out.println("File does not exist ");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public static void main(String[] args) {
        File filetochek;
       filetochek =new File("chandan.txt");
       System.out.println(args.length);
        if (filetochek.length()>0) {
            for (int i = 0; i < args.length; i++) {
                filetochek =new File(args[i]);
                getPaths(filetochek);
                getInfo(filetochek);
            }

            
        } else {
            System.out.println("Uses : java FileTest<filename(s)> ");
        }
    }
    
}
