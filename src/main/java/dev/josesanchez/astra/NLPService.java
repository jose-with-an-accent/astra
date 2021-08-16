package dev.josesanchez.astra;

import java.util.Properties;

import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class NLPService {
	StanfordCoreNLP coreNLP;

	public NLPService() {
		Properties props = new Properties();
		props.setProperty("annotators", "tokenize, ssplit, parse, sentiment");

		coreNLP = new StanfordCoreNLP(props);


	}
	public void doYourThing(String text) {
		Annotation annotation = coreNLP.process(text);

		annotation.toString();
	}
}
