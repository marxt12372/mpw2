package toolbox;

public class Point3D extends Point2D
{
	protected float _z;

	public Point3D(float x, float y, float z)
	{
		super(x, y);
		_z = z;
	}

	public Point3D()
	{
		super();
	}

	public float getZ()
	{
		return _z;
	}

	public void setZ(float z)
	{
		_z = z;
	}
}
