## Traffic light
App that helps build traffic lights, and lights up the color once it reads the words: "red", "green", "yellow".

### Examples:
```java
TrafficLight signal = new TrafficLight( 10, 20);
signal.draw();
String colorWord = (signal.getLight());
Text text = new Text(10, 100, colorWord);
text.draw();

TrafficLight signal2 = new TrafficLight( 60, 20);
signal2.cycle();
signal2.draw();
colorWord = signal2.getLight();
Text text2 = new Text(60, 100, colorWord);
text2.draw();

TrafficLight signal3 = new TrafficLight( 110, 20);
signal3.cycle();
signal3.cycle();
signal3.draw();
colorWord = signal3.getLight();
Text text3 = new Text(110, 100, colorWord);
text3.draw();

TrafficLight signal4 = new TrafficLight( 160, 20);
signal4.cycle();
signal4.cycle();
signal4.cycle();
signal4.draw();
colorWord = signal4.getLight();
Text text4 = new Text(160, 100, colorWord);
text4.draw();
```
