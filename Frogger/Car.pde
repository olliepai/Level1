class Car {
  int xpos;
  int ypos;
  int size;
  int speed;

  Car (int xpos, int ypos, int size, int speed) {
    this.xpos = xpos;
    this.ypos = ypos;
    this.size = size;
    this.speed = speed;
  }

  void display() {
    fill(255, 0, 0);
    rect(xpos, ypos, size, 50);
  }

  void moveLeft() {
    xpos -= speed;

    if (xpos < 0 - size) {
      xpos = 400;
    }
  }

  void moveRight() {
    xpos += speed;

    if (xpos > 400) {
      xpos = 0 - size;
    }
  }

  int getX() {
    return xpos;
  }

  int getY() {
    return ypos;
  }

  int getSize() {
    return size;
  }

  boolean intersects(Car car) {
    if ((y > car.getY() && y < car.getY()+50) && (x > car.getX() && x < car.getX()+car.getSize()))
      return true;
    else 
    return false;
  }
}