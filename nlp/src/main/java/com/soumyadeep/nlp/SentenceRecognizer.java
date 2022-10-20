package com.soumyadeep.nlp;

import java.util.List;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class SentenceRecognizer {

	public static void main(String args[]) {
		
		StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
		
		String text = "Hello! I am Soumyadeep Mukherjee. I am from Kolkata and work for EY";
		
		CoreDocument coreDocument = new CoreDocument(text);
		
		stanfordCoreNLP.annotate(coreDocument);
		
		List<CoreSentence> list = coreDocument.sentences();
		
		for(CoreSentence sentence : list) {
			System.out.println(sentence.toString());
		}
		
	}
}
