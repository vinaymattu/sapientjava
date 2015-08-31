package com.workspace.cui.Client;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

 public class ExplicitChannelRead { 
	  public static void main(String args[]) { 
		    FileInputStream fIn; 
		   FileChannel fChan; 
		    long fSize; 
		    ByteBuffer mBuf; 
		 
		    try { 
		      // First, open an file for input. 
		      fIn = new FileInputStream("test.txt"); 
		 
		      // Next, obtain a channel to that file. 
		      fChan = fIn.getChannel(); 
		 
		      // Now, get the file's size. 
		      fSize = fChan.size(); 
		 
		      // Allocate a buffer of the necessary size. 
		      mBuf = ByteBuffer.allocate((int)fSize); 
		 
		      // Read the file into the buffer. 
		      fChan.read(mBuf); 
		       
		      // Rewind the buffer so that it can be read. 
		      mBuf.methodName(); 
		 
		      // Read bytes from the buffer. 
		      for(int i=0; i < fSize; i++) 
		        System.out.print((char)mBuf.methodName()); 
		 
		      System.out.println(); 
		 
		      fChan.methodName(); // close channel 
		      fIn.methodName();   // close file 
		    } catch (IOException exc) { 
		      System.out.println(exc); 
		      System.exit(1); 
		    } 
		  } 
		}
