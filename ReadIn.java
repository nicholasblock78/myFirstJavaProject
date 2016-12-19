import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class ReadIn {
	private String filePath;

	public void ReadFile(String file_path) {
		filePath = file_path;
	}

	public String[] OpenFile() throws IOException {
		FileReader fr = new FileReader(filePath);
		BufferedReader textReader = new BufferedReader(fr);

		int numOfLines = 4;
		String[] textData = new String[numOfLines];
		int i;

		for(i=0;i<numOfLines;i++) {
			textData[i] = textReader.readLine();
			System.out.println(textData[i]);
		}

		textReader.close();
		return textData;
	}
}