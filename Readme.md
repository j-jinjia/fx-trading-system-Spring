#Tech test

##Java tech test

This directory includes the Market price handler with Java.

This Readme file includes my process thought as well as assumptions and my approach to the exercise.

My understanding of the test:
-
- I want to create a system that handles a market price feed, adds a margin to the prices and returns them.
- The prices come from a messaging system.
- The prices are in a CSV format as follows : 106, EUR/USD, 1.1000,1.2000,01-06-2020 12:01:01:001.
- The structure of the price consists of: Unique ID, Instrument name, Bid, Ask, timestamp.

Notes:
- 
- Assume the feed is coming form a messaging system(i.e implement an interface, e.g. onMessage(String message))
- Assume margin to be added: +0.1% on bid , -0.1% on ask.

First approach: Creating the system for 1 message
-
- I will assume there is only 1 message coming form the feed in a CSV format. The message is hardcoded in the Main class.
- Thinking about UNIT tests. Write unit tests for : 
  - Commission applying correctly.
  - Prices returned correctly
- I created the functions that adds/substract the corresponding comissions to ask/bid respectively. 
- Created the Price class with the respective properties of (ID, instrument name, bid, ask, timestamp).
- 


Second approach: Adding more messages to the system with a CSV reader
-
- I switched to SpringBoot in order to be able to create an endpoint to return the updated prices. 
- Writing Unit tests for :
  - Checking the CSV reader works.
- Progressing from my first approach, I added more messages to the feed. 
- For that, I created a CSV file and added the example messages, created a CSV reader and returned each line as a Price class. 
- Each price is added to a List. 
- And it is returned when the endpoint is called.

Third approach: Discussing testing. 
- 
- The testing criteria detailed in the brief are as follows:

  1. The prices are being processed in sequence and tact non are missing
  2. Only the latest price for a given instrument is stored(client should not be able to see older prices if a newer one has already been received)
  3. Validate each price to ensure that bid < ask and that the commission has been applied correctly.
  4. Summarise a strategy of how this could be tested end-end.


In regard to End-to-End testing, I assume we would want to automate the tests. As per now, I use Postman to test whether the endpoint returns the updated prices.
I believe we would need an automated testing framework such as Mockito or Cucumber to do that. 





