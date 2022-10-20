package com.soumyadeep.nlp;

import java.util.List;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class SentimentAnalysis {

	public static void main(String[] args) {
		
		StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
		
		String text = "Hello This is Soumyadeep. I don't like this place.";
		
		CoreDocument coreDocument = new CoreDocument(text);
		
		stanfordCoreNLP.annotate(coreDocument);
		
		 List<CoreSentence> list = coreDocument.sentences();
		 
		 for(CoreSentence sentence : list) {
			 
			 String sentiment = sentence.sentiment();
			 System.out.println(sentiment + " -> " + sentence);
		 }

	}

}
