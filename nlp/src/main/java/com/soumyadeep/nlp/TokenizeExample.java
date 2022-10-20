package com.soumyadeep.nlp;

import java.util.List;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class TokenizeExample {

	public static void main(String args[]) {
		
		StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
		
		String text = "Hey! This is Soumyadeep Mukherjee";
		
		CoreDocument coreDocument = new CoreDocument(text);
		
		stanfordCoreNLP.annotate(coreDocument);
		
		List<CoreLabel> list = coreDocument.tokens();
		
		for(CoreLabel label : list) {
			System.out.println(label.originalText());
		}

	}
}
