package com.soumyadeep.nlp;

import java.util.List;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class LemmaExample {

	public static void main(String args[]) {
		
		StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
		
		String text = "I am trying to learn new technologies.";
		
		CoreDocument coreDocument = new CoreDocument(text);
		
		stanfordCoreNLP.annotate(coreDocument);
		
		 List<CoreLabel> list = coreDocument.tokens();
		 
		 for(CoreLabel label : list) {
			 
			 String lemma = label.lemma();
			 System.out.println(label.originalText() + " -> " + lemma);
		 }
		
	}
	
}
