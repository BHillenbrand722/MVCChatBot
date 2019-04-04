# MVCChatBot
IST 262 MVC Semester-long project 

Deliverable 1 - 

This is the most basic form of this project. The viewer has a basic UI with an output textbox and an input textbox. The controller is in charge of the formatting of each input and output. Formatting allows everything to be more consistent while handling the input and output such as making sure punctuation and capitalization are added to each string. The model for the first deliverable is an array of 10 output strings that the program can choose from, each are hard-coded in. The model also has a random.nextInt(10) to pick a random response from the array and feed it through the controller for formatting. The success of this deliverable is based on whether the formatting works correctly and the viewer is able to show both the input and output in the text box. 

Deliverable 2 -

This deliverable will be light in terms of programming but will set up some basic framework for the AI I plan to implement for the next deliverable. That being said, the only thing I plan to add is a read from file function so that the AI will be able to read responses and create its own replies. Another thing I plan on doing with this deliverable is reworking the UI and making it cleaner and better looking. I'm not sure what it's going to look like just yet and plan to play around with Swing and JavaFX. As for testing, I will have the responses hardcoded in the file and as long as I get those responses as an output from the file I will consider it a success. Another success will be a better functioning/looking UI. 

Deliverable 3 -

The difference between deliverable 2 and 3 will be seen in 2 parts. I plan on changing both the back end and the front end of the program, in other words, the most amount of change will happen in the viewer and the model. The viewer will be changed from the static text box and messy look to a scrolling textbox so the user can see the entire message history. The model will become a fully fledged AI capable of formatting a response from the given data. I'm not quite aware of how the AI will be broken up however I plan on having it form its own responses if possible.

Step 1 - change viewer/front end

         a. scrolling text box

         b. better looking design

Step 2 - format the data used by the AI

         a. This has kind of been done in the controller already but I want to make it more efficient

Step 3 - add the AI

         a. I'm not sure how to break this into steps, I plan on building up the data input first, then response generation, and finally the response output.

 

I feel like fair criteria would be if the AI works and if the functionality of the scrolling text box is implemented then I consider it a success. Making it look good is a side goal of mine but not necessary to the function of the app.

