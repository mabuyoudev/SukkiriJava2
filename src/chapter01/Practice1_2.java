package chapter01;

public class Practice1_2 {

	public static void main(String[] args) {
		String withBackSlash = getFileName("C:\\ProgramFile\\", "test.txt");
		String withoutBackSlash = getFileName("C:\\ProgramFile", "test2.txt");
		System.out.println(withBackSlash);
		System.out.println(withoutBackSlash);
	}
	
	private static String getFileName(String folder, String file){
		String folderName = folder;
		if(!folder.endsWith("\\")){
			folderName += "\\";
		}
		return folderName + file;
	}

}