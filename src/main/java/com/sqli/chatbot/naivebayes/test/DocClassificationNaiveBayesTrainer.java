package com.sqli.chatbot.naivebayes.test;

import java.io.*;
import java.util.Scanner;

import com.sqli.chatbot.naivebayes.service.ClassificationNaiveBayesDomainService;
import com.sqli.chatbot.naivebayes.service.impl.DefaultClassificationNaiveBayesDomainService;
import com.sqli.chatbot.naivebayes.service.impl.DefaultClassificationNativeBayesKeywordService;
import com.sqli.chatbot.naivebayes.util.constantes.Constant;
import opennlp.tools.doccat.DoccatFactory;
import opennlp.tools.doccat.DoccatModel;
import opennlp.tools.doccat.DocumentCategorizer;
import opennlp.tools.doccat.DocumentCategorizerME;
import opennlp.tools.doccat.DocumentSample;
import opennlp.tools.doccat.DocumentSampleStream;
import opennlp.tools.ml.AbstractTrainer;
import opennlp.tools.ml.naivebayes.NaiveBayesTrainer;
import opennlp.tools.util.InputStreamFactory;
import opennlp.tools.util.MarkableFileInputStreamFactory;
import opennlp.tools.util.ObjectStream;
import opennlp.tools.util.PlainTextByLineStream;
import opennlp.tools.util.TrainingParameters;

/**
 * oepnnlp version 1.7.2
 * Training of Document Categorizer using Naive Bayes Algorithm in OpenNLP for Document Classification
 * @author www.tutorialkart.com
 */
public class DocClassificationNaiveBayesTrainer {

    /*public static void main(String[] args) {
        Scanner clavier =new Scanner(System.in);
        try {
            // read the training data
            InputStreamFactory dataIn = new MarkableFileInputStreamFactory(new File(Constant.TRAINING_DOMAIN_FILE_PATH));
            ObjectStream lineStream = new PlainTextByLineStream(dataIn, Constant.CHARSET_NAME);
            ObjectStream sampleStream = new DocumentSampleStream(lineStream);

            // define the training parameters
            TrainingParameters params = new TrainingParameters();
            params.put(TrainingParameters.ITERATIONS_PARAM, 10+"");
            params.put(TrainingParameters.CUTOFF_PARAM, 0+"");
            params.put(AbstractTrainer.ALGORITHM_PARAM, NaiveBayesTrainer.NAIVE_BAYES_VALUE);

            // create a model from traning data
            DoccatModel model = DocumentCategorizerME.train(Constant.LANGUAGE_TRAINING_CODE, sampleStream, params, new DoccatFactory());
            //System.out.println("\nModel is successfully trained.");

            // save the model to local
            BufferedOutputStream modelOut = new BufferedOutputStream(new FileOutputStream(Constant.TRAINING_DOMAIN_MODEL_PATH));
            model.serialize(modelOut);
            //System.out.println("\nTrained Model is saved locally at : "+"model"+File.separator+"en-ner-domain.bin");

            // test the model file by subjecting it to prediction
            DocumentCategorizer doccat = new DocumentCategorizerME(model);
            System.out.print("Enter your search sentence : ");
            String OurData=clavier.nextLine();
            //String[] docWords = "Afterwards Stuart and me ahahahahhhda hdadgjkdg notice Kate in the photos Stuart took at Leopolds ball and realise that her destiny must be to go back and be with Leopold That night while Kate is accepting her promotion at a company banquet he and Charlie race to meet her and show her the pictures Kate initially rejects their overtures and goes on to give her acceptance speech but it is there that she sees Stuarts picture and realises that she truly wants to be with Leopold".replaceAll("[^A-Za-z]", " ").split(" ");
            String[] docWords=OurData.replaceAll("[^A-Za-z]", " ").split(" ");
            double[] aProbs = doccat.categorize(docWords);

            // print the probabilities of the categories
            //System.out.println("\n---------------------------------\nCategory : Probability\n---------------------------------");
            /*
            for(int i=0;i<doccat.getNumberOfCategories();i++){
                System.out.println(doccat.getCategory(i)+" : "+aProbs[i]);
            }

            //System.out.println("---------------------------------");

            System.out.println("\n"+doccat.getBestCategory(aProbs)+" : is the predicted domain for the given sentence.");
        }
        catch (IOException e) {
            System.out.println("An exception in reading the training file. Please check.");
            e.printStackTrace();
        }
    }
    */

    public static  void main(String[] args) throws IOException {

        DefaultClassificationNativeBayesKeywordService service=new DefaultClassificationNativeBayesKeywordService();
        System.out.print("keyword : ");
        System.out.println(service.getKeywordFromSearchQuery("java"));
    }
}