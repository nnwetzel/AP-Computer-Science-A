import java.awt.Color;

import ihs.apcs.spacebattle.*;
import ihs.apcs.spacebattle.commands.*;

public class FindTheMiddleShip extends BasicSpaceship {

   int state = 0;
   double tolerance = 15.0;
   double duration = 1.0;
   double power = 0.5;
   
   double worldWidth = 0.0;
   double worldHeight = 0.0;

   @Override
   public RegistrationData registerShip(int numImages, int worldWidth, int worldHeight)
   {
      return new RegistrationData("The Wraith", new Color(255, 0, 0), 0);
   }

   @Override
   public ShipCommand getNextCommand(BasicEnvironment env)
   {
      ObjectStatus ship = env.getShipStatus();
      Point midpoint = new Point (worldWidth / 2, worldHeight / 2);
      
      state++;
        
      switch (state)
      {
        
         case 1:
            return new RotateCommand(ship.getPosition.getAngleTo(midpoint) - ship.getOrientation());
            
         case 2:
            if (ship.getPosition().isCloseTo(midpoint, tolernace))
            {
               return new BrakeCommand(0);
            }
            else {
               return new ThrustCommand ('B', duration, power);
            }
         case 3:
            state = state - 3;
      }
      return new IdleCommand(0.1);
   }
}