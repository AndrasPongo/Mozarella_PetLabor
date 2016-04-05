package com.hybridtheory.studentbot;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TrainingMaterialProvider {
	private Map<Integer, String> learnItemsList = new HashMap<Integer, String>();
	
	public Map<Integer, String> FetchTrainingMaterial() {
	    Scanner sc;
	    int sequenceNr = 0;
		try {
			sc = new Scanner(new FileReader("SB_TrainingMaterial.txt"));
		    while (sc.hasNextLine()){
		    	learnItemsList.put(sequenceNr, sc.nextLine());
		    	sequenceNr++;
		    }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return learnItemsList;
	}
}