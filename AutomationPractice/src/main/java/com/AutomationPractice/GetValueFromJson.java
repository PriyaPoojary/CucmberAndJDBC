package com.AutomationPractice;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import org.json.JSONObject;

public class GetValueFromJson {

	public String getValue(String key) {

		File reader = new File(System.getProperty("user.dir") + "/src/main/resources/TestData/TestData.json");
		byte[] encoded;
		try {
			encoded = Files.readAllBytes(reader.toPath());
			String fileContent = new String(encoded, "UTF-8");

			JSONObject jObject = new JSONObject(fileContent);
			return jObject.getString(key);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
