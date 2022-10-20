package com.soumyadeep.nlp;

import java.util.Properties;

import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class Pipeline {

	/*
	 * As we need the object of this class only once for entire application, so we need 
	   singleton implementation. Whenever we need to load a property for any feature, we can 
	   come here and load property and we can only one object through out the application.
	 */
	
	private static Properties properties;
	private static String propertiesName = "tokenize, ssplit, pos, lemma, ner, parse, sentiment";
	/*
	 * tokenize property for tokenizing/ splitting a string
	 * ssplit = sentence split [for sentence recognizing]
	 * pos = parts of speech
	 * ner = named entity recognizer
	 * parse = Comparing the rules of formal grammar, it checks the text for meaningfulness
	 * sentiment = technique used to determine whether data is positive, negative or neutral
	 * 
	 */
	
	private static StanfordCoreNLP stanfordCoreNLP;
	
	//private constructor for not able to create any object
	private Pipeline() {
		
	}
	
	static {
		properties = new Properties();
		properties.setProperty("annotators", propertiesName);
	}
	
	//singleton implementation
	public static StanfordCoreNLP getPipeline() {
		
		if (stanfordCoreNLP == null) {
			stanfordCoreNLP = new StanfordCoreNLP(properties);
		}
		return stanfordCoreNLP;
	}
	
}
