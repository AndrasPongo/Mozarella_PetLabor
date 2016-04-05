package com.hybridtheory.studentbot;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class StudentBot {
	private String attitude;	
	private String smartness;
	private String willToLearnNewWords;
	private String difficulty;
	private Map<Integer, String> learnItemsList;
	private Map<Integer, Integer> wordStrengths = new HashMap<Integer, Integer>();
	private int numberOfLearntWords = 0;
	private AwardPool ownAwardPool;
	
	private int maximumQuestionsSolvedPerDay = 0;
	private int chanceToContinueTheNextDay = 0;
	private int enoughNewWordsForDailyStreak = 0;
	private int chanceToGiveCorrectAnswer = 0;
	private int consecutiveStreakDaysCompleted = 0;
	private int longestStreak = 0;
	private int chanceToLearnNewWord = 0;
	private int questionSequenceNumber = 0;
	private int daysUsedForPractice = 0;
	private int daysSkippedFromPractice = 0;
	private int pointsAccumulated = 0;
	private Writer writer;
	
	
	public StudentBot(Map<Integer, String> learnItemsList, String attitudeToTest, String difficultyToUse, String percentageOfCorrectness, String proportionOfLearningNewWordsAgainstPractice) {
		this.attitude = attitudeToTest;
		this.difficulty = difficultyToUse;
		this.smartness = percentageOfCorrectness;
		this.learnItemsList = learnItemsList;
		this.willToLearnNewWords = proportionOfLearningNewWordsAgainstPractice;
		for (int i = 0; i<learnItemsList.size(); i++) {
			this.wordStrengths.put(i, 0);
		}
		
		initializeBotPerformance();
		ownAwardPool = new AwardPool();
		startLogger();
	}

	private void startLogger() {
		try {
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("ExperimentResults.txt"), "utf-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void initializeBotPerformance() {
		if (this.attitude == "lazy")  {
			maximumQuestionsSolvedPerDay = 15;
			chanceToContinueTheNextDay = 40;
		} else if (this.attitude == "normal")  {
			maximumQuestionsSolvedPerDay = 30;
			chanceToContinueTheNextDay = 65;
		}  else if (this.attitude == "enthusiast")  {
			maximumQuestionsSolvedPerDay = 50;
			chanceToContinueTheNextDay = 95;
		}
		
		if (this.difficulty == "easy")  {
			enoughNewWordsForDailyStreak = 5;
		} else if (this.difficulty == "normal")  {
			enoughNewWordsForDailyStreak = 10;
		} else if (this.difficulty == "advanced")  {
			enoughNewWordsForDailyStreak = 20;
		} else if (this.difficulty == "hard")  {
			enoughNewWordsForDailyStreak = 50;
		}

		if (this.smartness == "1%")  {
			chanceToGiveCorrectAnswer = 1;
		} else if (this.smartness == "10%")  {
			chanceToGiveCorrectAnswer = 10;
		} else if (this.smartness == "20%")  {
			chanceToGiveCorrectAnswer = 20;
		} else if (this.smartness == "30%")  {
			chanceToGiveCorrectAnswer = 30;
		} else if (this.smartness == "40%")  {
			chanceToGiveCorrectAnswer = 40;
		} else if (this.smartness == "50%")  {
			chanceToGiveCorrectAnswer = 50;
		} else if (this.smartness == "60%")  {
			chanceToGiveCorrectAnswer = 60;
		} else if (this.smartness == "70%")  {
			chanceToGiveCorrectAnswer = 70;
		} else if (this.smartness == "80%")  {
			chanceToGiveCorrectAnswer = 80;
		} else if (this.smartness == "90%")  {
			chanceToGiveCorrectAnswer = 90;
		} else if (this.smartness == "99%")  {
			chanceToGiveCorrectAnswer = 99;
		}
		
		if (this.willToLearnNewWords == "justNewWords") {
			chanceToLearnNewWord = 100;			
		} else if (this.willToLearnNewWords == "1/3") {
			chanceToLearnNewWord = 33;
		} else if (this.willToLearnNewWords == "2/3") {
			chanceToLearnNewWord = 66;
		} else if (this.willToLearnNewWords == "justPractice") {
			chanceToLearnNewWord = -1;			
		}
	}
	
	public void performStudySequence(int numberOflengthOfStudySequence) {
		try {
			writer.write("*******************STARTING EXPERIMENT***************************"+System.lineSeparator());
			writer.write("Learn Item list size: "+learnItemsList.size()+System.lineSeparator());
			writer.write(System.lineSeparator());
			writer.write("Student profile:"+System.lineSeparator());
			writer.write(">>>>>>> Attitude: "+attitude+System.lineSeparator());
			writer.write(">>>>>>> Smartness: "+smartness+System.lineSeparator());
			writer.write(">>>>>>> Willingness to learn new words: "+willToLearnNewWords+System.lineSeparator());
			writer.write(">>>>>>> Choosen difficulty: "+difficulty+System.lineSeparator());
			writer.write("*****************************************************************"+System.lineSeparator());

			int keyOfTheActualQuestion = 0;
			String actualQuestion = "";
			String expectedAnswer = "";
			String wordToLearn = "";
			
			int currentDay = 0;
			int questionsAttemptedTheGivenDay = 0;
			int correctAnswersTheGivenDay = 0;
			String answer = "";
			
			//If completely new experiment, first teach the bot a few words
			if (currentDay == 0) {
				writer.write(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> 1 <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<"+System.lineSeparator());
				writer.write("Starting first day. Learning some new words"+System.lineSeparator());
				for (questionsAttemptedTheGivenDay = 0; questionsAttemptedTheGivenDay <= maximumQuestionsSolvedPerDay; questionsAttemptedTheGivenDay++) {
					if (numberOfLearntWords == learnItemsList.size()) {
						break;
					}
					writer.write("Question's sequence number: "+questionSequenceNumber+System.lineSeparator());
					keyOfTheActualQuestion = getQuestion("newWords");
					actualQuestion = learnItemsList.get(keyOfTheActualQuestion);
					wordToLearn = actualQuestion.split(":")[0];
					expectedAnswer = actualQuestion.split(":")[1];
					
					learn(keyOfTheActualQuestion);
					writer.write("YEAH, I've learnt a new item: "+learnItemsList.get(keyOfTheActualQuestion)+System.lineSeparator());
					
					answer = answer(actualQuestion);
					writer.write(System.lineSeparator());
					
					correctAnswersTheGivenDay = bookResults(answer, expectedAnswer, keyOfTheActualQuestion, correctAnswersTheGivenDay);
					
					pointsAccumulated += calculatePoints(keyOfTheActualQuestion);
				}
			}
			writer.write(System.lineSeparator());
			writer.write(System.lineSeparator());
			writer.write(System.lineSeparator());
			writer.write(">>>>>>>>>>>>>>>>>>>>>>>>>>>> 2 <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<"+System.lineSeparator());
			writer.write("Starting real sequence"+System.lineSeparator());

			while (currentDay < numberOflengthOfStudySequence) {
				writer.write("+++++++++++++++++++++++++++++++++++++++++++++++Deciding if I want to learn today++++++++++++++++++++++++++++++++++++++++++++++++++"+System.lineSeparator());
				if (learningTheGivenDay()) {
					writer.write("YES! Let's GO!"+System.lineSeparator());
					daysUsedForPractice++;
	
					for (questionsAttemptedTheGivenDay = 0; questionsAttemptedTheGivenDay <= maximumQuestionsSolvedPerDay; questionsAttemptedTheGivenDay++) {					
						
						//This whole new word/practice does not correspond to the Memrize system, but our bot learns along constant characteristics, so it might still be a good enough approximation  
						if (wantToLearnNewWords() && numberOfLearntWords != learnItemsList.size())  {
							//writer.write("Question's sequence number: "+questionSequenceNumber+System.lineSeparator());
							keyOfTheActualQuestion = getQuestion("newWords");
							actualQuestion = learnItemsList.get(keyOfTheActualQuestion);
							wordToLearn = actualQuestion.split(":")[0];
							expectedAnswer = actualQuestion.split(":")[1];
							
							//If it's a new learn item (Strength is 0), we simulate that the bot learns the word (ergo: we set Strength from 0 to 1)
							learn(keyOfTheActualQuestion);
							writer.write("YEAH, I've learnt a new item: "+learnItemsList.get(keyOfTheActualQuestion)+System.lineSeparator());
							
							
							answer = answer(actualQuestion);
							writer.write(System.lineSeparator());
							
							correctAnswersTheGivenDay = bookResults(answer, expectedAnswer, keyOfTheActualQuestion, correctAnswersTheGivenDay);
	
						} else {
							//writer.write("Question's sequence number: "+questionSequenceNumber+System.lineSeparator());
							keyOfTheActualQuestion = getQuestion("practice");
							actualQuestion = learnItemsList.get(keyOfTheActualQuestion);
							wordToLearn = actualQuestion.split(":")[0];
							expectedAnswer = actualQuestion.split(":")[1];
	
							answer = answer(actualQuestion);
							writer.write(System.lineSeparator());
							
							correctAnswersTheGivenDay = bookResults(answer, expectedAnswer, keyOfTheActualQuestion, correctAnswersTheGivenDay);
							
						} //End of practice for a single word
					}  //End of a question
	
				} else {
					writer.write("NO! I hate this!"+System.lineSeparator());
					writer.write("And so I just fucked up the following StreaK: "+consecutiveStreakDaysCompleted+System.lineSeparator());
					daysSkippedFromPractice++;
					consecutiveStreakDaysCompleted = 0;	
				}
				currentDay++;
			} //End of a day
			writer.write(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>FINISH<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<"+System.lineSeparator());
			writer.write("Points accumulated: "+pointsAccumulated+System.lineSeparator());
			writer.write("Longest Streak: "+longestStreak+System.lineSeparator());
			writer.write("Days spent with practice: "+daysUsedForPractice+System.lineSeparator());
			writer.write("Days skipped from practice: "+daysSkippedFromPractice+System.lineSeparator());
			writer.write("The following awards were accumulated: "+ownAwardPool.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {writer.close();} catch (Exception ex) {/*ignore*/}
		}
		
	} //end of COMPLETE study sequence
	
	private int bookResults(String answer, String expectedAnswer, int keyOfNextQuestion, int correctAnswersTheGivenDay) {
		if (answer.equals(expectedAnswer)) {						
			correctAnswersTheGivenDay++;

			//Check for Daily Streak
			if (DailyStreakThresholdReached(correctAnswersTheGivenDay)) {
				correctAnswersTheGivenDay = 0;
				ownAwardPool.setStreak_day(new Award(true));
				pointsAccumulated += ownAwardPool.getStreak_day().getPointValue();
				consecutiveStreakDaysCompleted++;
				if (consecutiveStreakDaysCompleted > longestStreak) {
					longestStreak = consecutiveStreakDaysCompleted;
				}
				if (consecutiveStreakDaysCompleted==7) {
					ownAwardPool.setStreak_week(new Award(true));
					pointsAccumulated += ownAwardPool.getStreak_week().getPointValue();
				} else if (consecutiveStreakDaysCompleted==30) {
					ownAwardPool.setStreak_month(new Award(true));
					pointsAccumulated += ownAwardPool.getStreak_month().getPointValue();	
				} else if (consecutiveStreakDaysCompleted==365) {
					ownAwardPool.setStreak_year(new Award(true));
					pointsAccumulated += ownAwardPool.getStreak_year().getPointValue();	
				}
			}

			//Add points
			pointsAccumulated += calculatePoints(keyOfNextQuestion);
			
			//Update word strength registry
			updateWordStrength(keyOfNextQuestion, "+");
			
		} else {
			updateWordStrength(keyOfNextQuestion, "-");
		}
		return correctAnswersTheGivenDay;
	}

	private int calculatePoints(int keyOfNextQuestion) {
		if (wordStrengths.get(keyOfNextQuestion) == 0) {
			return 5;
		} else if (wordStrengths.get(keyOfNextQuestion) == 1) {
			return 1;
		} else if (wordStrengths.get(keyOfNextQuestion) == 2) {
			return 1;
		} else if (wordStrengths.get(keyOfNextQuestion) == 3) {
			return 1;
		} else if (wordStrengths.get(keyOfNextQuestion) == 4) {
			return 1;
		} else if (wordStrengths.get(keyOfNextQuestion) == 5) {
			return 2;
		} else if (wordStrengths.get(keyOfNextQuestion) == 6) {
			return 2;
		} else if (wordStrengths.get(keyOfNextQuestion) == 7) {
			return 2;
		} else if (wordStrengths.get(keyOfNextQuestion) == 8) {
			return 2;
		} else if (wordStrengths.get(keyOfNextQuestion) == 9) {
			return 5;
		} else {
			return 5;
		}
	}

	private void learn(int keyOfLearnItem) {
		this.wordStrengths.put(keyOfLearnItem, 1);
		numberOfLearntWords++;
	}

	private void updateWordStrength(int keyOfLearnItem, String presignOfChange) {
		if (presignOfChange == "+") {
			if (this.wordStrengths.get(keyOfLearnItem) < 11) {
				this.wordStrengths.put(keyOfLearnItem, this.wordStrengths.get(keyOfLearnItem)+1);
			}
		} else {
			if (this.wordStrengths.get(keyOfLearnItem) > 1) {
				this.wordStrengths.put(keyOfLearnItem, this.wordStrengths.get(keyOfLearnItem)-1);				
			}
		}
				
	}
	
	private boolean DailyStreakThresholdReached(int amountOfCorrectAnswers) {
		if (amountOfCorrectAnswers == enoughNewWordsForDailyStreak) {
			return true;
		} else {
			return false;
		}
	}
	
	private boolean wantToLearnNewWords() {
		int randomNumber = (int)Math.round(Math.random()*100);
		if (randomNumber < chanceToLearnNewWord) {
			return true;
		} else {
			return false;
		}
	}

	private boolean learningTheGivenDay() {
		int randomNumber = (int)Math.round(Math.random()*100);
		if (randomNumber < chanceToContinueTheNextDay) {
			return true;
		} else {
			return false;
		}
	}
	
	private String answer(String question) {
		try {
			int randomNumber = (int)Math.round(Math.random()*100);
			if (randomNumber < chanceToGiveCorrectAnswer) {
				writer.write("I think it's: "+question.split(":")[1]+System.lineSeparator());
				return question.split(":")[1];				
			} else {
				writer.write("I don't know, because I'm just an annoying fictional character"+System.lineSeparator());
				return "I don't know, because I'm just an annoying fictional character";
			} 
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		} 
	}

	public int getQuestion(String newWordOrNot) {
		try {
			questionSequenceNumber++;
			int keyOfRandomQuestion = 0;
			if (newWordOrNot == "newWords") {
				keyOfRandomQuestion = Math.abs((int)Math.round(Math.random()*this.learnItemsList.size()-1));
				while (wordStrengths.get(keyOfRandomQuestion) != 0) {
					keyOfRandomQuestion = Math.abs((int)(Math.random() * this.learnItemsList.size()));				
				}
				writer.write("What does this mean: "+learnItemsList.get(keyOfRandomQuestion).split(":")[0]+"?"+System.lineSeparator());
				return keyOfRandomQuestion;
			} else {
				keyOfRandomQuestion = Math.abs((int)Math.round(Math.random()*this.learnItemsList.size()-1));
				while (wordStrengths.get(keyOfRandomQuestion) == 0) {
					keyOfRandomQuestion = Math.abs((int)(Math.random() * this.learnItemsList.size()));				
				}
				writer.write("What does this mean: "+learnItemsList.get(keyOfRandomQuestion).split(":")[0]+"?"+System.lineSeparator());
				return keyOfRandomQuestion;
			}
		} catch (IOException e) {
			e.printStackTrace();
			return -1;
		}
	}
}