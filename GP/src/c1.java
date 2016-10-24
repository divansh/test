import java.awt.List;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Writer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class c1 {
	
	void say(ArrayList<? extends Number> list) { 
    	System.out.println("parent");
}
	
	public static void main(String[] args) {
		
		ArrayList<? extends Number> list1 = null;
		ArrayList<Integer> list2 = null;
		list1 = list2;
		System.out.println("Hey first change here");
	}
	}

