package toolbox;

public class Point2D
{
	protected float _x;
	protected float _y;

	public Point2D(float x, float y)
	{
		_x = x;
		_y = y;
	}

	public Point2D()
	{
	}

	public float getX()
	{
		return _x;
	}

	public void setX(float x)
	{
		_x = x;
	}

	public float getY()
	{
		return _y;
	}

	public void setY(float y)
	{
		_y = y;
	}
}
