import java.util.Arrays;

public class Point2D {
    float x;
    float y;

    public Point2D(){}

    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX(){
        return  x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        float[] arr = new float[2];
        arr[0] = x;
        arr[1] = y;
        return arr;
    }

    public String toString(){
        return Arrays.toString(getXY());
    }
}