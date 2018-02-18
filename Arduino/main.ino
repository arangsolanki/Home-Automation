#include <LiquidCrystal.h>

const int rs = 12, en = 11, d4 = 5, d5 = 4, d6 = 3, d7 = 2;
LiquidCrystal lcd(rs, en, d4, d5, d6, d7);
char data = 0;
const int buttonPin1 = 23;
const int buttonPin2 = 25;
const int buttonPin3 = 27;
const int buttonPin4 = 29;
const int buttonPin5 = 31;
const int buttonPin6 = 33;
const int buttonPin7 = 35;
const int buttonPin8 = 39;

char command;
String string;

void setup() {
  lcd.begin(16, 2);
  Serial.begin(9600);
  pinMode(buttonPin1, OUTPUT);
  pinMode(buttonPin2, OUTPUT);
  pinMode(buttonPin3, OUTPUT);
  pinMode(buttonPin4, OUTPUT);
  pinMode(buttonPin5, OUTPUT);
  pinMode(buttonPin6, OUTPUT);
  pinMode(buttonPin7, OUTPUT);
  pinMode(buttonPin8, OUTPUT);
  digitalWrite(buttonPin1, HIGH);
  digitalWrite(buttonPin2, HIGH);
  digitalWrite(buttonPin3, HIGH);
  digitalWrite(buttonPin4, HIGH);
  digitalWrite(buttonPin5, HIGH);
  digitalWrite(buttonPin6, HIGH);
  digitalWrite(buttonPin7, HIGH);
  digitalWrite(buttonPin8, HIGH);
}

void loop() {
  if (Serial.available() > 0) {
    string = "";
    while (Serial.available() > 0) {
      command = ((byte)Serial.read());
      if (command == ':')
        break;
      else
        string.concat(command);
      delay(1);
    }
    lcd.clear();
    if (string == "ON1") {
      digitalWrite(buttonPin1, HIGH);
      lcd.print("Turning ON");
      lcd.setCursor(0,1);
      lcd.print("Switch 1");
    } else if (string == "ON2") {
      digitalWrite(buttonPin2, HIGH);
      lcd.print("Turning ON");
      lcd.setCursor(0,1);
      lcd.print("Switch 2");  
    } else if (string == "ON3") {
      digitalWrite(buttonPin3, HIGH);
      lcd.print("Turning ON");
      lcd.setCursor(0,1);
      lcd.print("Switch 3");  
    } else if (string == "ON4") {
      digitalWrite(buttonPin4, LOW);
      lcd.print("Turning ON");
      lcd.setCursor(0,1);
      lcd.print("Switch 4");  
    } else if (string == "ON5") {
      digitalWrite(buttonPin5, HIGH);
      lcd.print("Turning ON");
      lcd.setCursor(0,1);
      lcd.print("Switch 5");  
    } else if (string == "ON6") {
      digitalWrite(buttonPin6, HIGH);
      lcd.print("Turning ON");
      lcd.setCursor(0,1);
      lcd.print("Switch 6");  
    } else if (string == "ON7") {
      digitalWrite(buttonPin7, HIGH);
      lcd.print("Turning ON");
      lcd.setCursor(0,1);
      lcd.print("Switch 7");  
    } else if (string == "ON8") {
      digitalWrite(buttonPin8, HIGH);
      lcd.print("Turning ON");
      lcd.setCursor(0,1);
      lcd.print("Switch 8");  
    } else if (string == "OFF1") {
      digitalWrite(buttonPin1, LOW);
      lcd.print("Turning OFF");
      lcd.setCursor(0,1);
      lcd.print("Switch 1");  
    } else if (string == "OFF2") {
      digitalWrite(buttonPin2, LOW);
      lcd.print("Turning OFF");
      lcd.setCursor(0,1);
      lcd.print("Switch 2");  
    } else if (string == "OFF3") {
      digitalWrite(buttonPin3, LOW);
      lcd.print("Turning OFF");
      lcd.setCursor(0,1);
      lcd.print("Switch 3");  
    } else if (string == "OFF4") {
      digitalWrite(buttonPin4, HIGH);
      lcd.print("Turning OFF");
      lcd.setCursor(0,1);
      lcd.print("Switch 4");  
    } else if (string == "OFF5") {
      digitalWrite(buttonPin5, LOW);
      lcd.print("Turning OFF");
      lcd.setCursor(0,1);
      lcd.print("Switch 5");
    } else if (string == "OFF6") {
      digitalWrite(buttonPin6, LOW);
      lcd.print("Turning OFF");
      lcd.setCursor(0,1);
      lcd.print("Switch 6");  
    } else if (string == "OFF7") {
      digitalWrite(buttonPin7, LOW);
      lcd.print("Turning OFF");
      lcd.setCursor(0,1);
      lcd.print("Switch 7");  
    } else if (string == "OFF8") {
      digitalWrite(buttonPin8, LOW);
      lcd.print("Turning OFF");
      lcd.setCursor(0,1);
      lcd.print("Switch 8");  
    } else if (string == "CON") {
      lcd.print("Connected!");  
    } else if (string == "DIS") {
      lcd.print("Disconnected!");  
    }
  } 
}
