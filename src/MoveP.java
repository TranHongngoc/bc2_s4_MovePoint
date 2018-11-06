import java.util.Arrays;

public class MoveP extends Point2D {
    float xSpeed,ySpeed;

    public MoveP(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] arr = new float[2];
        arr[0] = getX() + xSpeed;
        arr[1] = getY() + ySpeed;
        return arr;
    }

    @Override
    public String toString(){
        return Arrays.toString(getSpeed());
    }

}
