import java.util.Scanner;
public class NokiaCallCenter{


	public static void main(String... args){



String nokia = """ 

Hello Nokia 

press 

1 phone book
2 Message
3 Chat
4 Call register
5 Tone
6 Settings
7 Call divert
8 Games
9 Calculator
10 Reminder
11 Clock
12 Profiles
13 SIM services



""";
Scanner input = new Scanner(System.in);
int nokiaInput = input.nextInt();

System.out.println(nokia);

switch(nokiaInput){

case 1 -> System.out.println("Phone book");

case 2 -> System.out.println("Message");

case 3 -> System.out.println("Chat");

case 4 -> System.out.println("Call register");

case 5 -> System.out.println("Tone");

case 6-> System.out.println("Setting");

case 7 -> System.out.println("Call divert");

case 8 -> System.out.println("Games");

case 9 -> System.out.println("Calculate");

case 10 -> System.out.println("Reminder");

case 11 -> System.out.println("Clock");

case 12 -> System.out.println("Profile");

case 13-> System.out.println("SIM services");

}

	String phone = """ 
	Hello!!

	Welcome to your Nokia phone

	press


	1 for Search
	2: for Service Nos
	3: to Add name
	4: to erase
	5: to edit
	6: to assign tone
	7: to send b'card
	8: for options
	9: for speed dials
	10: for voice tag


""";


	System.out.println(phone);

	//System.out.println(option);


	
	int phoneInput = input.nextInt();

switch(phoneInput){

case 1 -> System.out.println("Search");

case 2 -> System.out.println("Service Nos");

case 3 -> System.out.println("Add name");

case 4 -> System.out.println("erase");

case 5 -> System.out.println("edit");

case 6 -> System.out.println("Assign tone");

case 7 -> System.out.println("Send b'card");

case 8 -> {
System.out.println("options");


String options = """ 
press

1 -> type of view
2 -> memory status

""";
System.out.println(options);

int optionInput = input.nextInt();

switch(optionInput){

case 1 -> System.out.println("type of view");

case 2 -> System.out.println("memory status");

default -> System.out.println("Oops!!! try again");
}
}

case 9 -> System.out.println("speed dials");
case 10 -> System.out.println("voice tags");

default -> System.out.println("Oops!!! try again");
}




// message


String message = """ 
with Nokia, you can send message to anyone of your friends in the world!

press

2 -> message


""";

int messageInput = input.nextInt();
System.out.println(message);

switch(messageInput){

case 2 -> {
System.out.println("message");


String box = """ 

press

1 -> write messages
2 -> inbox
3 -> outbox
4 -> picture messages
5 -> templates
6 -> smileys
7 -> message settings
8 -> info service
9 -> voice mailbox number
10 -> service command editor

""";
System.out.println(box);

int boxInput = input.nextInt();

switch(boxInput){

case 1 -> System.out.println("write message");

case 2 -> System.out.println("inbox");

case 3 -> System.out.println("outbox");

case 4 -> System.out.println("picture messages");

case 5 -> System.out.println("templates");

case 6 -> System.out.println("smileys");

case 7 -> System.out.println("message settings");

case 8 -> System.out.println("info service");

case 9 -> System.out.println("voice mailbox number");

case 10 -> System.out.println("service command editor");

default -> System.out.println("Oops!!! try again");
}
}
}

String set = """ 
To set your messages
press

1 -> Set


""";

int setInput = input.nextInt();

System.out.println(set);

switch(setInput){

case 1 -> { 
System.out.println("Set");

String center = """ 
press 

1 -> message centre number
2 -> message sent as
3 -> message validity


""";

int centerInput = input.nextInt();

System.out.println(center);

switch(centerInput){

case 1 -> System.out.println("message centre number");

case 2 -> System.out.println("message sent as");

case 3 -> System.out.println("message validity");

}
}
}



String dal = """ 
press

1 -> Common


""";

int dalInput = input.nextInt();

System.out.println(dal);

switch(dalInput){

case 1 -> { 
System.out.println("Common");


String common = """ 
press

1 -> delivery reports
2 -> reply via same centre
3 -> character support

""";

System.out.println(common);

int commonInput = input.nextInt();

switch(commonInput){

case 1 -> System.out.println("delivery reports");

case 2 -> System.out.println("reply via same centre");

case 3 -> System.out.println("character");
}
}
}

String chat = """ 
Chat with friends and family from anywhere in hte world.
press

1 -> chat


""";


int chatInput = input.nextInt();

System.out.println(chat);

switch(dalInput){

case 1 -> System.out.println("Chat");
}








String call = """ 
press

1 -> Call Register


""";

int callRegisterInput = input.nextInt();

System.out.println(call);

switch(callRegisterInput){

case 1 -> { 
System.out.println("Call Register");


String cent = """ 
press

1 -> Missed calls
2 -> Received calls
3 -> Dialled numbers
4 -> Erase recent call lists
5 -> Show call duration

""";

System.out.println(cent);

int centInput = input.nextInt();

switch(centInput){

case 1 -> System.out.println("Missed calls");

case 2 -> System.out.println("Received calls");

case 3 -> System.out.println("Dialled numbers");

case 4-> System.out.println("Erase recent call list");

case 5 -> { 

System.out.println("show call duration");

String show = """ 
press

1 -> delivery reports
2 -> reply via same centre
3 -> character support

""";

System.out.println(show);

int showInput = input.nextInt();

switch(showInput){

case 1 -> System.out.println("last call duration");

case 2 -> System.out.println("all calls duration");

case 3 -> System.out.println("recieved calls duration");

case 4 -> System.out.println("dialled call's duration");

case 5 -> System.out.println("clear timer");
}
}
}
}
}


String cost = """ 

press

6 -> Show call cost 

""";

int costInput = input.nextInt();
System.out.println(cost);


switch(costInput){

case 6 -> {

System.out.println("Show call cost");


String clear = """ 

press

1 -> last call cost
2 -> all call cost
3 -> clear counter


""";

int clearInput = input.nextInt();

System.out.println(clear);

switch(clearInput) {


case 1 -> System.out.println("last call cost");
case 2 -> System.out.println("all call cost");
case 3 -> System.out.println("clear counter");


}
}
}

String limit = """ 
press

7 -> call cost settings 

""";

int limitInput = input.nextInt();
System.out.println(limit);


switch(limitInput){

case 6 -> {

System.out.println("call cost settings");


String van = """ 

press

1 -> call cost limit
2 -> show cost in



""";

int vanInput = input.nextInt();

System.out.println(van);

switch(vanInput) {


case 1 -> System.out.println("call cost setting");
case 2 -> System.out.println("show cost in");

}
}
}


String paid = """ 
press

7 -> prepaid credit 

""";

int paidInput = input.nextInt();
System.out.println(paid);


switch(paidInput){

case 7 -> System.out.println("prepaid credit");

}



String tone = """ 

press

1 -> ringing tone
2 -> ringing volume
3 -> incoming call alert
4 -> composer
5 -> message alert tone
6 -> keypad tones
7 -> warning and game alert
8 -> vibrating alert
9 -> screen saver


""";
System.out.println(tone);

int toneInput = input.nextInt();

switch(toneInput){

case 1 -> System.out.println("ringing tone");

case 2 -> System.out.println("ringing volume");

case 3 -> System.out.println("incoming call alert");

case 4 -> System.out.println("composer");

case 5 -> System.out.println("message alert tone");

case 6 -> System.out.println("keypad tones");

case 7 -> System.out.println("warning and gaming alert");

case 8 -> System.out.println("vibrating alert");

case 9 -> System.out.println("screen saver");


default -> System.out.println("Oops!!! try again");
}




String auto = """ 
press

6 -> settings 

""";

int autoInput = input.nextInt();
System.out.println(auto);


switch(autoInput){

case 7 -> {

System.out.println("settings");

String speed = """ 

1 -> call settings


""";
int speedInput = input.nextInt();

System.out.println(speed);

switch(speedInput) {

case 1 -> {
System.out.println("call setting");

String send = """ 
press

1 -> automatic redial
2 -> speed dialling
3 -> call waiting options
4 -> own number sending
5 -> phone line in use
6 -> automatic answer


""";
int sendInput = input.nextInt();

System.out.println(send);

switch(sendInput) {

case 1 -> System.out.println("automatic redial");
case 2 -> System.out.println("speed dialling");
case 3 -> System.out.println("call waiting options");
case 4 -> System.out.println("own number sending");
case 5 -> System.out.println("phone line in use");
case 6 -> System.out.println("automatic answer");

}
}
}
}
}


String phoneSet = """ 
press

1 -> language
2 -> cell waiting options
3 -> welcome note
4 -> network selection
5 -> light
6 -> confirm SIM service actions


""";
int phoneSetInput = input.nextInt();

System.out.println(phoneSet);

switch(phoneSetInput) {

case 1 -> System.out.println("language");
case 2 -> System.out.println("cell waiting options");
case 3 -> System.out.println("welcome note");
case 4 -> System.out.println("network selection");
case 5 -> System.out.println("light");
case 6 -> System.out.println("confirm SIM service actions");

}





String secure = """ 
press

3 -> settings 

""";

int secureInput = input.nextInt();
System.out.println(secure);


switch(secureInput){

case 3 -> {

System.out.println("security settings");





String store = """ 
press

4 -> restore factory settings 

""";

int storeInput = input.nextInt();

System.out.println(store);

switch(storeInput) {

case 4 -> { 

System.out.println("restore factory settings ");


String pin = """ 
press

1 -> Pin code request
2 -> call barring service
3 -> fixed dialling
4 -> closed user group
5 -> phone security
6 -> change access codes


""";
int pinInput = input.nextInt();

System.out.println(pin);

switch(pinInput) {

case 1 -> System.out.println("Pin code request");
case 2 -> System.out.println("call barring service");
case 3 -> System.out.println("fixed dialling");
case 4 -> System.out.println("closed user group");
case 5 -> System.out.println("phone security");
case 6 -> System.out.println("change access codes");
}
}
}
}
}





String divert = """ 
press

7 -> call divert 

""";

int divertInput = input.nextInt();
System.out.println(divert);


switch(divertInput){

case 7 -> System.out.println("call divert ");


}


String game = """ 
press

 8 -> games

""";

int gameInput = input.nextInt();
System.out.println(game);


switch(gameInput){

case 8 -> System.out.println("game");
}




String cal = """ 
press

9 -> calculator 

""";

int calInput = input.nextInt();
System.out.println(cal);


switch(calInput){

case 9 -> { 
System.out.println("calculator ");
}
}





String mind = """ 
press

10 -> reminder

""";

int mindInput = input.nextInt();

System.out.println(mind);


switch(mindInput) {

case 10 -> {

System.out.println("reminder ");


String clock = """ 
press

11 -> clock

""";

int clockInput = input.nextInt();
System.out.println(clock);


switch(clockInput){

case 11 -> {

System.out.println("clock ");


String alarm = """ 
press

1 -> Alarm clock 
2 -> clock setting
3 -> date setting
4 -> stopwatch
5 -> countdown timer
6 -> auto update of date and time

""";

int alarmInput = input.nextInt();
System.out.println(alarm);


switch(alarmInput) {

case  1 -> System.out.println("alarm clock");

case  2 -> System.out.println("alarm clock");

case  3 -> System.out.println("alarm clock");

case  4 -> System.out.println("alarm clock");

case  5 -> System.out.println("alarm clock");

case  6 -> System.out.println("alarm clock");

default -> System.out.println("Oops! you typed the wrong number");

}
}
}
}
}





String pro = """ 
press

10 -> profile

""";

int proInput = input.nextInt();

System.out.println(pro);


switch(proInput) {

case 10 -> System.out.println("profile ");

}



String sim = """ 
press

10 -> SIM service

""";

int simInput = input.nextInt();

System.out.println(sim);


switch(simInput) {

case 10 -> System.out.println("reminder ");

}
//the two curly braces are the close block
}
}


