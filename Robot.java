import java.awt.Point;

public class Robot {

    private String direction;
    private Point pointOfRobot;
    
    public Robot(){
         pointOfRobot = new Point(0,0);
        direction = "N";
    }
    public void turnLeft(){
        if(direction =="N"){
            direction = "W";
        }else if(direction == "W"){
            direction = "S";
        }else if(direction == "S"){
            direction = "E";
        }else if(direction == "E"){
            direction = "N";
        }

    }
    public void turnRight(){
        if(direction =="N"){
            direction = "E";
        }else if(direction == "E"){
            direction = "S";
        }else if(direction == "S"){
            direction = "W";
        }else if(direction == "W"){
            direction = "N";
        }
    }
    public void move(){
        if(direction =="N"){
            double x = pointOfRobot.getX();
            double y = pointOfRobot.getY();
            x = x+1;
            pointOfRobot.setLocation(x, y);

        }else if(direction == "W"){
              double x = pointOfRobot.getX();
            double y = pointOfRobot.getY();
            y = y+1;
            pointOfRobot.setLocation(x, y);
        }else if(direction == "S"){
            double x = pointOfRobot.getX();
            double y = pointOfRobot.getY();
            x = x-1;
            pointOfRobot.setLocation(x, y);
        }else if(direction == "E"){
                 double x = pointOfRobot.getX();
            double y = pointOfRobot.getY();
            y = y+1;
            pointOfRobot.setLocation(x, y);
        }
    }
    public Point getPoint(){
        return pointOfRobot;
    }
    public String getDirection(){
        return direction;
    }
    
}
