# API-chatbot

API for technical documentation chatbot

---------------------------------------------------------------------------------------------------------



1. *Clone the application*

	bash
	git clone https://github.com/AbdelkarimELKHATIB/nlpChatBot.git
	cd nlpChatBot
	

2. *Run the app*

	You can run the spring boot app by typing the following command -

	bash
	mvn spring-boot:run
	

	The server will start on port 8089.

	You can also package the application in the form of a `jar` file and then run it like so -

	bash
	mvn package
	java -jar target/naivebayes-0.0.1-SNAPSHOT.jar
	

2. *Exemples*
  ex1:

  request : http://localhost:8089/api/naivesBayes/domain/get current java workshops
  response : {"domain":"formation","keyword":"java"}

   ex2:
  
  request : http://localhost:8089/api/naivesBayes/domain/search php tutorials
  response : {"domain":"Formation","keyword":"php "}

