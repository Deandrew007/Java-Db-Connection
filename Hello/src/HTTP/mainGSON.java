package HTTP;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

public class mainGSON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("data.json"));
			Result result = gson.fromJson(br, Result.class);
			
			if (result != null) {
				for(Todo t : result.getTodos()) {
					System.out.println(t.getId() + " : " + t.getTitle() + " - " + t.getCompleted());
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
