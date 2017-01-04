/**
 * Modifying the class to maintain the state of the traffic light
 * 
 * @author Michelle Pham 
 * @version Nov 9, 2016 / Final
 */
public class TrafficLight extends TrafficLightViewer 
{
    private int light;
    public static final int GREEN = 0;
    public static final int YELLOW = 1;
    public static final int RED = 2;
    private int x;
    private int y;

    /**
     * Constructs the box of traffic lights
     * @param theX the x coordinate of the top left corner of the traffic light
     * @param theY the y coordinate of the top left corner of the traffic light
     */
    public TrafficLight(int theX, int theY)
    {
        x = theX;
        y = theY;
        light = RED;
    }

    /**
     * changes the state (the color)
     */
    public void cycle() 
    {
        if (light == RED)
            light = YELLOW;
        else if (light == YELLOW)
            light = GREEN;
        else if (light == GREEN)
            light = RED;
    }

    /**
     * gets the color (the state) of the light as a string "red", "yellow", or "green"
     * @return color the color of light
     */
    public String getLight() 
    {
        if (light == RED)
        {
            return "red";
        }
        else if (light == YELLOW)
        {
            return "yellow";
        }
        else
        {
            return "green";
        }
    }

    /**
     * Draws the traffic light box
     */
    public void draw()
    {
        Rectangle box1 = new Rectangle(x, y, 20, 60);
        box1.draw();

        Rectangle box2 = new Rectangle(x, y, 20, 60);
        box2.draw();

        Rectangle box3 = new Rectangle(x, y, 20, 60);
        box3.draw();

        Rectangle box4 = new Rectangle(x, y, 20, 60);
        box4.draw();

        Rectangle box5 = new Rectangle(x, y, 20, 60);
        box5.draw();

        Ellipse circle1 = new Ellipse(x, y, 20, 20);
        circle1.draw();
        if (light == RED) 
        {
            circle1.setColor(Color.RED);
        } 
        else 
        {
            circle1.setColor(new Color(128, 0, 0));
        }
        circle1.fill();
        Ellipse circle2 = new Ellipse(x, y+20, 20, 20);
        circle2.draw();
        if (light == YELLOW) 
        {
            circle2.setColor(Color.YELLOW);
        } 
        else 
        {
            circle2.setColor(new Color(255, 165, 0));
        }
        circle2.fill();
        Ellipse circle3 = new Ellipse(x, y+40, 20, 20);
        circle3.draw();
        if (light == GREEN) 
        {
            circle3.setColor(Color.GREEN);
        } 
        else 
        {
            circle3.setColor(new Color(85, 107, 47));
        }
        circle3.fill();
    }
}