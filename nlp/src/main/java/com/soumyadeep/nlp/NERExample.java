package com.soumyadeep.nlp;

import java.util.List;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class NERExample {

	public static void main(String args[]) {
		
		StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
		
		String text = "Hey! I am Soumyadeep Mukherjee and I have a friend. His name is Aditya." + 
					  " I lived in Kolkata and he lived in Berlin.";
		
		CoreDocument coreDocument = new CoreDocument(text);
		
		stanfordCoreNLP.annotate(coreDocument);
		
		 List<CoreLabel> list = coreDocument.tokens();
		 
		 for(CoreLabel label : list) {
			 
			 String ner = label.get(CoreAnnotations.NamedEntityTagAnnotation.class);
			 
			 System.out.println(label.originalText() + " - " + ner);
		 }
		 
	}
}
