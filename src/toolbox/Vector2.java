package toolbox;

import sun.awt.motif.X11CNS11643;

public class Vector2
{
	private float _x;
	private float _y;

	public Vector2(float x, float y)
	{
		_x = x;
		_y = y;
	}

	public Vector2()
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
