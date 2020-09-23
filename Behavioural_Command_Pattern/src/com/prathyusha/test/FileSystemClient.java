package com.prathyusha.test;

import com.prathyusha.model.CloseFileCommand;
import com.prathyusha.model.FileInvoker;
import com.prathyusha.model.FileSystemReceiver;
import com.prathyusha.model.FileSystemReceiverUtil;
import com.prathyusha.model.OpenFileCommand;
import com.prathyusha.model.WriteFileCommand;

public class FileSystemClient {
	
	public static void main(String[] args) {
		//Creating the receiver object
		FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();
		
		//creating command and associating with receiver
		OpenFileCommand openFileCommand = new OpenFileCommand(fs);
		
		//Creating invoker and associating with Command
		FileInvoker file = new FileInvoker(openFileCommand);
		
		//perform action on invoker object
		file.execute();
		
		WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
		file = new FileInvoker(writeFileCommand);
		file.execute();
		
		CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
		file = new FileInvoker(closeFileCommand);
		file.execute();
	}


}
