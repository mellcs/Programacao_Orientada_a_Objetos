package robozitos;

import robocode.*;
import java.awt.Color;

/**
 * Chilton - a robot by Mell
 */
public class Chilton extends AdvancedRobot {
    @Override
    public void run() {    
        setBodyColor(new Color(255,192,203));
        setGunColor(new Color(250,128,114));
        setRadarColor(new Color(250,128,114));
        setBulletColor(new Color(255,20,147));
        setScanColor(new Color(255,215,0));

        setAdjustRadarForRobotTurn(true); 
        setAdjustGunForRobotTurn(true); 

        while (true) {
            moveInL();
            turnRadarRight(360);
        }
    }

    private void moveInL() {
        setAhead(100);
        execute();

        setTurnRight(90);
        execute();

        setAhead(100);
        execute();

        setTurnLeft(90); 
        execute();
    }
    
    private double calculateFirePower(double distance) {
        return Math.min(400 / distance, 3);
    }

    private double normalizeAngle(double angle) {
        while (angle > 180) angle -= 360;
        while (angle < -180) angle += 360;
        return angle;
    }

    @Override
    public void onScannedRobot(ScannedRobotEvent e) {
        double distance = e.getDistance(); 
        double absoluteBearing = getHeading() + e.getBearing(); 
        double gunTurn = absoluteBearing - getGunHeading(); 
        double radarTurn = absoluteBearing - getRadarHeading(); 

        setTurnRadarRight(normalizeAngle(radarTurn));
        setTurnGunRight(normalizeAngle(gunTurn));

        if (distance > 200) {
            setTurnRight(normalizeAngle(e.getBearing()));
            setAhead(distance - 100); 
        }

        setFire(calculateFirePower(distance));

        execute();
    }

    @Override
    public void onHitByBullet(HitByBulletEvent e) {
        setBack(50); 
        setTurnRight(45); 
        execute();
    }

    @Override
    public void onHitWall(HitWallEvent e) {
        setBack(100); 
        setTurnRight(90);
        execute();
    }
}
