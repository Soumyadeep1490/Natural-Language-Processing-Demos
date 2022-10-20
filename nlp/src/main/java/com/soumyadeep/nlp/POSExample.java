package com.soumyadeep.nlp;

import java.util.List;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

//POS = Parts of Speech
public class POSExample {
	
	public static void main(String args[]) {
		
		StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
		
		String text = "Hey! I am Soumyadeep Mukherjee.";
		
		CoreDocument coreDocument = new CoreDocument(text);
		
		stanfordCoreNLP.annotate(coreDocument);
		
		 List<CoreLabel> list = coreDocument.tokens();
		
		 for(CoreLabel label : list) {
			 
			 String pos = label.get(CoreAnnotations.PartOfSpeechAnnotation.class);
			 System.out.println(label.originalText() + " = " + pos);
		 }
		
	}

}
