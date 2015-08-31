package mainpack;

import java.io.File;





public class Prac2 {

	static void p(String s){
		System.out.println(s);
	}
	public static void main(String[] args) {
       File f1=new File("D:/sapient");
       
       p("File Name: "+ f1.getName());
       p("Path: "+f1.getPath());
       p("abs Path: "+ f1.getAbsolutePath());
       p("parent: "+f1.getParent());
       p(f1.exists()? "exists":" does not exists");
       p(f1.canWrite() ?"is writable":"is not writable");
       p(f1.canRead() ?"is readable":"is not readable");
       p("is"+(f1.isDirectory()?"":"not"+"a directory"));
       p(f1.isAbsolute()?"is Absolute":"is not absolute" );
       p("File last modified "+f1.lastModified());
       p("file size:"+f1.getTotalSpace()+" bytes");
       
	}

}
