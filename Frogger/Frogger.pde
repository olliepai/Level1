int x;
int y;

Car car1 = new Car(200, 100, 70, 2);
Car car2 = new Car(200, 175, 70, 2);
Car car3 = new Car(200, 250, 70, 2);

void setup() {
  size(400, 400);
  x = 200;
  y = 375;
}

void draw() {

  background(0, 0, 0);

  fill(0, 255, 0);
  ellipse(x, y, 30, 30);

  car1.moveLeft();
  car1.display();
  car2.moveRight();
  car2.display();
  car3.moveLeft();
  car3.display();
  
  bounds();

  car1.intersects(car1);
  if (car1.intersects(car1) == true) {
    x = 200;
    y = 375;
  }
  car2.intersects(car2);
  if (car2.intersects(car2) == true) {
    x = 200;
    y = 375;
  }
  car3.intersects(car3);
  if (car3.intersects(car3) == true) {
    x = 200;
    y = 375;
  }

  if (y == 25) {
    textAlign(CENTER);
    text("YOU WIN", 200, 200);
    textSize(20);
  }
}

void keyPressed()
{
  println("working");
  if (key == CODED) {
    if (keyCode == UP)
    {
      y -= 5;
    } else if (keyCode == DOWN)
    {
      y += 5;
    } else if (keyCode == RIGHT)
    {
      x += 5;
    } else if (keyCode == LEFT)
    {
      x -= 5;
    }
  }
}

void bounds() {
  if (x > 375) {
    x = 375;
  }
  if (x < 25) {
    x = 25;
  }
  if (y > 375) {
    y = 375;
  }
  if (y < 25) {
    y = 25;
  }
}